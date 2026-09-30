//task:calculation using methods
package com.methods.nrwtp;

import java.util.Scanner;

public class Calculator {
	int first_number;
	int second_number;
	public static void add(int a,int b) {
		int sum = a + b;
		System.out.println("Sum = "+sum);
	}
	public void subtract() {
		int difference = first_number - second_number;
		System.out.println("Difference = "+difference);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");;
		c.first_number=sc.nextInt();
		System.out.println("Enter Second Number : ");
		c.second_number=sc.nextInt();
		add(c.first_number,c.second_number);
		c.subtract();
		sc.close();
		
	}

}
