package com.tasks;

public class TernaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 23;
		int b = 14;
		
		System.out.println((a>0)?"positive":"negative");
		System.out.println((a==10)?"a is equl to 10":"a is not equal to 10");
		System.out.println("max value "+((a > b)?a: b));
		System.out.println("min value "+((a < b)?a: b));
		System.out.println((a % 2 == 0)?a+" is even " : a +" is odd");
		System.out.println((b % 2 == 0)?b+" is even " : b +" is odd");
		System.out.println((a % b == 0)?b +" is factor of "+a:b+" is not factor of "+a);
		System.out.println((a < 10) ? a+" is single digit number":a+" is not a single digit number");
		System.out.println((a < 100) ? a+" is double digit number":a+" is not a double digit number");
		

	}

}
