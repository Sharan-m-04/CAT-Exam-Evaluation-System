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
		int aRowCount = eu1.getRowCount();
		String[] names = new String[sRowCount];
		String[] userAns = new String[aRowCount];
		for (int i = 1; i < sRowCount; i++) {
			names[i] = eu1.getCellData(i, 1);
			System.out.println("Enter " + names[i] + "'s answers: ");
			userAns[i] = sc.next();
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
		String keyAnsStr = "";
		for(int i = 1; i < aRowCount; i++){
			keyAns[i] = eu2.getCellData(i, 1);
//			keyAnsStr = new String[]{keyAns.toString()};
//			keyAnsStr = new String[]{String.join("", keyAns)};
			keyAnsStr += keyAns[i];
		}
		return keyAnsStr;
	}
	public Float calPercentile() throws Exception {
		int i=0, sum=0;
		String[]  str1 = readData();
		String  str2 = keyAnswer();
		if(str1[i]==str2[i]) {
			sum+=3;
		}
	}
	public static void main(String[] args) throws Exception {
		Main obj = new Main();
//		obj.readData();
		obj.keyAnswer();





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

