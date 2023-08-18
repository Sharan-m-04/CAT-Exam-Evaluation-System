package com.catExamEvaluationSystem;

import java.util.Scanner;
import utilities.ExcelUtils;

public class Main {
	public static void main(String[] args) throws Exception {
		String path = "./dataset/data.xlsx";
//		System.out.println(System.getProperty(path));
//		String path = "D:/Github/CAT-Exam-Evaluation-System/CAT-Exam-Evaluation-System/dataset/data.xlsx";

		//Getting data from Students sheet
		ExcelUtils eu1 = new ExcelUtils(path, "Students");
//		System.out.println(eu1.getRowCount());
		for(int i = 1; i < 26; i++)
			eu1.getCellData(i, 1);
		
		//Getting data from Answers sheet
		//TODO: Below code throwing exception
		ExcelUtils eu2 = new ExcelUtils(path, "Answers");
		for(int j = 1; j < 11; j++)
			eu2.getCellData(j, 1);
	}
}
