package com.tasks;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks in percentage");
		int marks = sc.nextInt();
		String result = (marks < 0 || marks > 100) ? "Invalid marks"
				: (marks >= 90) ? "A Grade"
						: (marks >= 80) ? "B Grade" : (marks >= 70) ? "C Grade" : (marks >= 60) ? "D Grade" : "Fail";
		System.out.println("Result of Student : " + result);
		sc.close();
	}

}
