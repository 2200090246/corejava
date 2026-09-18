package com.methods.nrwp;

import java.util.Scanner;

public class CalculateSum {
	public static void calculateSum(int a,int b, int c) {
		int sum = a+b+c;
		System.out.println("Sum = "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number : ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int b = sc.nextInt();
		System.out.println("Enter Third Number : ");
		int c = sc.nextInt();
		calculateSum(a,b,c);
		sc.close();
	}

}
