package com.tasks;

import java.util.Scanner;

public class SwapTwoNumbersUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mahesh marks : ");
		int mmarks = sc.nextInt();
		System.out.println("Enter aakash marks : ");
		int amarks = sc.nextInt();
		System.out.println("Hey you entered aakash marks to mahesh and mahesh marks to aakash kindly update it.");
		int temp = mmarks;
		mmarks = amarks;
		amarks = temp;
		System.out.println("Hey you successfully chnaged the marks and updated them correctly Thank you");
		System.out.println("Mahesh Marks : " + mmarks);
		System.out.println("Aakash Marks : " + amarks);
		sc.close();
	}

}
