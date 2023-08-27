package com.catExamEvaluationSystem;

import java.lang.String;
import utilities.ExcelUtils;

public class Main {
	static String path = "./CAT-Exam-Evaluation-System/dataset/data.xlsx";
	public String[] readData() throws Exception {
		ExcelUtils eu1 = new ExcelUtils(path, "Students");
		int sRowCount = ExcelUtils.getRowCount();
		String[] userAns = new String[sRowCount];
		for(int i = 0; i < sRowCount; i++) {
			userAns[i] = ExcelUtils.getCellData(i, 2);
		}
		return userAns;
	}
	public String keyAnswer() throws Exception {
		ExcelUtils eu2 = new ExcelUtils(path, "Answers");
		int aRowCount = ExcelUtils.getRowCount();
		String[] keyAns = new String[aRowCount];
		StringBuilder keyAnsStr = new StringBuilder();
		for(int i = 0; i < aRowCount; i++){
			keyAns[i] = ExcelUtils.getCellData(i, 1);
			keyAnsStr.append(keyAns[i]);
		}
		return keyAnsStr.toString();
	}
	public int[] calcMarks() throws Exception {
		ExcelUtils eu1 = new ExcelUtils(path, "Students");
		int sRowCount = ExcelUtils.getRowCount();
		int[] sum = new int[sRowCount];
		String[] str1 = readData();
		String str2 = keyAnswer();
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (str1[i].charAt(j) == str2.charAt(j)) {
					sum[i] += 3;
				} else if (str1[i].charAt(j) == '-') {
					sum[i] += 0;
				} else {
					sum[i] -= 1;
				}
			}
		}
		return getRank(sum);
	}
	public int[] getRank(int[] marks) {
		int[] ranks = new int[marks.length];
		for(int i = 0; i < marks.length; i++){
			int rank = 1;
			for (int mark : marks) {
				if (mark > marks[i]) {
					rank++;
				}
			}
			ranks[i] = rank;
		}
		return ranks;
	}
	public void calcPercentile(int[] rank) throws Exception{
		ExcelUtils eu1 = new ExcelUtils(path, "Students");
		int sRowCount = ExcelUtils.getRowCount();
		float[] percentile = new float[sRowCount];
		int k = 0;
		while(k < sRowCount){
			percentile[k] = (1-((float) rank[k] /sRowCount)) * 100;
			k++;
		}
		displayResult(percentile);
	}
	public void displayResult(float[] percentile) throws Exception{
		ExcelUtils eu1 = new ExcelUtils(path, "Students");
		int sRowCount = ExcelUtils.getRowCount();
		String[] names = new String[sRowCount];
		System.out.println("-----------------------");
		System.out.printf("%-10s %-10s %n", "Name", "Percentile");
		System.out.println("-----------------------");
			for (int i = 0; i < sRowCount; i++) {
				names[i] = ExcelUtils.getCellData(i, 1);
				System.out.printf("%-10s %-10s %n", names[i], percentile[i]);
			}
		System.out.println("-----------------------");
	}
	public static void main(String[] args) throws Exception {
		Main obj = new Main();
		int[] rank = obj.calcMarks();
		obj.calcPercentile(rank);
	}
}

