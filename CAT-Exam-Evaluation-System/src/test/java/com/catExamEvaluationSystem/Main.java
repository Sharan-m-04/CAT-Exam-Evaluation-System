package com.catExamEvaluationSystem;

import java.util.Scanner;
import utilities.ExcelUtils;

public class Main {
	static String path = "./CAT-Exam-Evaluation-System/dataset/data.xlsx";
	Scanner sc = new Scanner(System.in);
	public int readData() throws Exception {
		
		ExcelUtils eu1 = new ExcelUtils(path, "Students");
		int sRowCount = eu1.getRowCount();
		int aRowCount = eu1.getRowCount();
		String[] names = new String[sRowCount];
		String[] userAns = new String[aRowCount];
		for (int i = 1; i < sRowCount; i++){
			names[i] = eu1.getCellData(i, 1);
			System.out.println("Enter " + names[i] + "'s answers: ");
			userAns[i] = sc.next();
		}

		//For debugging
		/*for (int j = 1; j < sRowCount; j++){
			System.out.println(names[j] + "'s answers: " + userAns[j]);
		}*/
	public void calPercentile() {
		int i = 0;
		ExcelUtils eu2 = new ExcelUtils(path, "Answers");
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

