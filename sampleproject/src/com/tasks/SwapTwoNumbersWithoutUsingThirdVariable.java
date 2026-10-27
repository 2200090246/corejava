package com.tasks;

import java.util.Scanner;

public class SwapTwoNumbersWithoutUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mahesh marks : ");
		int mmarks = sc.nextInt();
		System.out.println("Enter aakash marks : ");
		int amarks = sc.nextInt();
		System.out.println("Hey unfortunately i have entered mahesh marks to aakash and aakash marks to mahesh");
		System.out.println("Hey dont worry you can update them without using extra memory space man");
		mmarks = amarks + mmarks;
		amarks = mmarks - amarks;
		mmarks = mmarks - amarks;
		System.out.println("Hey you have updated correctly");
		System.out.println("Mahesh Marks : " + mmarks);
		System.out.println("Aakash Marks : " + amarks);
	}

}
