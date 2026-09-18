package com.methods.nrwtp;

import java.util.Scanner;

public class NumberCheck {
	int number;
	public static void checkPositive(int number) {
		if(number > 0) System.out.println("Positive");
		else if(number < 0) System.out.println("Not positive");
		else System.out.println("Zero");
	}
	public void checkEven() {
		if((number & 1) == 0) System.out.println("Even");
		else System.out.println("Odd");;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberCheck n = new NumberCheck();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		n.number=sc.nextInt();
		checkPositive(n.number);
		n.checkEven();
		sc.close();
	}

}
