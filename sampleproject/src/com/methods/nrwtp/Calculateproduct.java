package com.methods.nrwtp;

import java.util.Scanner;

public class Calculateproduct {
	public int multiply(int a,int b) {
		int res = a * b;
		return res;
	}

	void main() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = sc.nextInt();
		System.out.println("Enter second number : ");
		int b = sc.nextInt();
		int ans = multiply(a,b);
		System.out.println("product of "+a+" and "+b+" is "+ans);
		sc.close();
		
	}

}
