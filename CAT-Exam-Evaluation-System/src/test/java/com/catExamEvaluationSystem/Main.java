package com.catExamEvaluationSystem;

import java.lang.String;
import java.util.Arrays;
import java.util.Scanner;
import utilities.ExcelUtils;

public class Main {
	static String path = "./CAT-Exam-Evaluation-System/dataset/data.xlsx";
	Scanner sc = new Scanner(System.in);
	public String[] readData() throws Exception {
		ExcelUtils eu1 = new ExcelUtils(path, "Students");
		int sRowCount = eu1.getRowCount();
//		int aRowCount = eu1.getRowCount();
//		String[] names = new String[sRowCount];
		String[] userAns = new String[sRowCount];
		for(int i = 1; i < sRowCount; i++) {
//			names[i] = eu1.getCellData(i, 1);
//			System.out.println("Enter " + names[i] + "'s answers: ");
			userAns[i] = eu1.getCellData(i, 2);
//			System.out.println(userAns[i]);
		}
		//For debugging
		/*for (int j = 1; j < sRowCount; j++){
			System.out.println(names[j] + "'s answers: " + userAns[j]);
		}*/
		return userAns;
	}
//	public static String toString(char[] a)
//	{
//		String string = new String(a);
//		return string;
//	}
	public String keyAnswer() throws Exception {
		ExcelUtils eu2 = new ExcelUtils(path, "Answers");
		int aRowCount = eu2.getRowCount();
		String[] keyAns = new String[aRowCount];
		StringBuilder keyAnsStr = new StringBuilder();
		for(int i = 1; i < aRowCount; i++){
			keyAns[i] = eu2.getCellData(i, 1);
			keyAnsStr.append(keyAns[i]);
		}
		return keyAnsStr.toString();
	}
	public void calcPercentile() throws Exception {
		ExcelUtils eu1 = new ExcelUtils(path, "Students");
		int sRowCount = eu1.getRowCount();
		int[] sum = new int[sRowCount];
		String[] str1 = readData();
		String str2 = keyAnswer();

//		System.out.println(str1[0]);
//		System.out.println(str1[1]);
//		System.out.println(str1[25]);
//
//		System.out.println(str2);
//		System.out.println(str1[1].charAt(8));
//		System.out.println(str2.charAt(8));

//		String[] str1 = {"aa--cdcba-", "dbc-cba--a", "daccbbc-b-","-acdb--bac", "bcab--d-a-","-cb-aadbcc","a--b-dc-cd","dc-cb--aab","abd-bc-cca","-cdbcaad-b","bcd-aabdc-","caa-dc-cb-","-dbac-dcba","b-a-cd-bac","abcd--bacd","-d-cadbcab","cda--b--bc","aabddbc-a-","bcb-da--ac","dc-abcdb-a","-abaccd-bd","c-ba--adbc","c--adba-cb","b-cad-a--b","dc-ba--cab"};

//		String[] str2 = new String[aRowCount];
//		str2[0] = keyAnswer();
//		try {
			for (int i = 1; i < str1.length; i++) {
				for (int j = 0; j < str2.length(); j++) {
//					System.out.println(str1[i]);
					if (str1[i].charAt(j) == str2.charAt(j)) {
						sum[i] += 3;
					} else if (str1[i].charAt(j) == '-') {
						sum[i] += 0;
					} else {
						sum[i] -= 1;
					}
				}
			}
			for (int i = 0; i < sRowCount; i++)
				System.out.println(i + "\t" + sum[i]);
		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//	}
	public static void main(String[] args) throws Exception {
		Main obj = new Main();
//		obj.readData();
//		obj.keyAnswer();
		obj.calcPercentile();




	/*	int rowCount = 0;
		String path = "./CAT-Exam-Evaluation-System/dataset/data.xlsx";

		//Getting data from Students sheet
		ExcelUtils eu1 = new ExcelUtils(path, "Students");
		rowCount = eu1.getRowCount();
//		System.out.println(eu1.getRowCount()); //Debugging purpose
		for (int i = 1; i < rowCount; i++)
			eu1.getCellData(i, 1);

		//Getting data from Answers sheet
		ExcelUtils eu2 = new ExcelUtils(path, "Answers");
		rowCount = eu2.getRowCount();
		for (int j = 1; j < rowCount; j++)
			eu2.getCellData(j, 1);*/

	}
}

