//Task: calculate how many notes qeuired based o the amount entered by user
package com.operators.arthmetic;
import java.util.Scanner;
public class ATMCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount you want to withdraw: ");
		int amount = sc.nextInt();
		if(amount >= 500) {
			System.out.println("500 notes : "+ amount/500);
			amount = amount % 500;
		}
		if(amount >= 200) {
			System.out.println("200 notes : "+amount/200);
			amount = amount % 200;
		}
		if(amount >=100) {
			System.out.println("100 notes : "+amount/100);
			amount = amount % 100;
		}
		if(amount >=50) {
			System.out.println("50 notes : "+amount / 50);
			amount = amount % 50;
		}
		if(amount >= 20) {
			System.out.println("20 notes : "+amount /20);
			amount = amount % 20;
		}
		if(amount >=10) {
			System.out.println("10 notes : "+amount / 10);
		}
		
	}
}
