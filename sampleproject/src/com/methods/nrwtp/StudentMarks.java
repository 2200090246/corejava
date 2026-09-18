package com.methods.nrwtp;

import java.util.Scanner;

public class StudentMarks {
	int a,b,c;
	public static void findSum(int a,int b,int c) {
		int sum = a + b + c;
		System.out.println("Sum = "+sum);
	}
	public void findAverage() {
		double average = (a + b+ c)/3.0;
		System.out.println("Average = "+average);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudentMarks s = new StudentMarks();
		System.out.println("Enter first Number");
		s.a=sc.nextInt();
		System.out.println("Enter Second Number : ");
		s.b=sc.nextInt();
		System.out.println("Enter Third Number : ");
		s.c=sc.nextInt();
		findSum(s.a,s.b,s.c);
		s.findAverage();
		sc.close();
	}

}
