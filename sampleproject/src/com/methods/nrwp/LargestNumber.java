package com.methods.nrwp;

import java.util.Scanner;

public class LargestNumber {
	public void findLargest(int fnumber,int snumber) {
		if(fnumber > snumber) System.out.println(fnumber +" is Larger");
		else System.out.println(snumber+" is Larger");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int first_Number = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int second_Number = sc.nextInt();
		LargestNumber l = new LargestNumber();
		l.findLargest(first_Number, second_Number);
		sc.close();
	}

}
