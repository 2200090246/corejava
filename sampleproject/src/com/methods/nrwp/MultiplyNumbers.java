package com.methods.nrwp;

import java.util.Scanner;

public class MultiplyNumbers {
	public void multiply(int a , int b) {
		System.out.println("Product = "+(a*b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int b = sc.nextInt();
		MultiplyNumbers m = new MultiplyNumbers();
		m.multiply(a,b);
		sc.close();
	}

}
