package com.methods.nrwp;
import java.util.Scanner;
public class EvenOdd {
	public void check(int number) {
		if(number%2==0) System.out.println("Even");
		else System.out.println("Odd");
	}
	public void checkUsingBitwise(int number) {
		if((number & 1) == 0) System.out.println("Even");
		else System.out.println("Odd");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int number = sc.nextInt();
		EvenOdd e = new EvenOdd();
		e.check(number);
		e.checkUsingBitwise(number);
		sc.close();
		

	}

}
