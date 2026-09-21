package com.methods.nrwp;

import java.util.Scanner;

public class NumberSquare {
	int number;
	public int calculateSquare() {
		int ans = number * number;
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		NumberSquare n = new NumberSquare();
		System.out.println("Enter Number : ");
		n.number=sc.nextInt();
		int s = n.calculateSquare();
		System.out.println("Square of "+n.number+" is : "+s);
		sc.close();
	}

}
