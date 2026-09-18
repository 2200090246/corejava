package com.methods.nrwtp;

import java.util.Scanner;

public class SquareNumber {
	int number;
	public void square() {
		int answer = number * number;
		System.out.println("Square = "+answer);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		SquareNumber s = new SquareNumber();
		s.number=sc.nextInt();
		s.square();
		sc.close();
	}

}
