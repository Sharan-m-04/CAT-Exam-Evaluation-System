package com.catExamEvaluationSystem;

import java.sql.SQLOutput;
import java.util.Scanner;
import utilities.ExcelUtils;

public class Main {
		static String path = "./CAT-Exam-Evaluation-System/dataset/data.xlsx";
	public void readData() throws Exception {
		Scanner sc = new Scanner(System.in);
		ExcelUtils eu1 = new ExcelUtils(path, "Students");
		ExcelUtils eu2 = new ExcelUtils(path, "Answers");
		int sRowCount = ExcelUtils.getRowCount();
		int aRowCount = ExcelUtils.getRowCount();
		String[] names = new String[sRowCount];
		String[] userAns = new String[aRowCount];
		for (int i = 1; i < sRowCount; i++){
			names[i] = ExcelUtils.getCellData(i, 1);
			System.out.println("Enter " + names[i] + "'s answers: ");
			userAns[i] = sc.next();
		}
		for (int i = 1; i < sRowCount; i++){
			System.out.println(names[i]+"'s answers"+userAns[i]);
		}
	}
	public static void main(String[] args) throws Exception {
		Main obj = new Main();
		obj.readData();
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

