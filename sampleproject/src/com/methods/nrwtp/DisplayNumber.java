package com.methods.nrwtp;

import java.util.Scanner;

public class DisplayNumber {
	int a;
	public void display() {
		System.out.println("Number = "+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DisplayNumber d = new DisplayNumber();
		System.out.println("Enter Number : ");
		d.a=sc.nextInt();
		d.display();
		sc.close();
	}

}
