
package com.methods.nrwp;

import java.util.Scanner;

public class AddNumbers {
	public static void add(int a, int b) {
		System.out.println("Sum : "+(a + b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int b = sc.nextInt();
		add(a,b);
	}

}
