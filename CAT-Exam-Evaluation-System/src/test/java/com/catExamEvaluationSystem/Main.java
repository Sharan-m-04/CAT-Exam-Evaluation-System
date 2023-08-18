package com.catExamEvaluationSystem;

import java.util.Scanner;
import utilities.ExcelUtils;

public class Main {
	public static void main(String[] args) throws Exception {
		int rowCount = 0;
		String path = "./CAT-Exam-Evaluation-System/dataset/data.xlsx";

		//Getting data from Students sheet
		ExcelUtils eu1 = new ExcelUtils(path, "Students");
		rowCount = eu1.getRowCount();
//		System.out.println(eu1.getRowCount()); //Debugging purpose
		for(int i = 1; i < rowCount; i++)
			eu1.getCellData(i, 1);
		
		//Getting data from Answers sheet
		ExcelUtils eu2 = new ExcelUtils(path, "Answers");
		rowCount = eu2.getRowCount();
		for(int j = 1; j < rowCount; j++)
			eu2.getCellData(j, 1);
	}
}
