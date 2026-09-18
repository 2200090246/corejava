package com.methods.nrwp;

import java.util.Scanner;

public class SimpleInterest {
	double principle;
	double rate;
	double time;
	public static void calculateInterest(double p, double r, double t) {
		double i = (p*t*r)/100;
		System.out.println("Simple Intrest = "+i);
	}
	public void displayDetails() {
		System.out.println("Principal = "+principle);
		System.out.println("Rate = "+rate);
		System.out.println("Time = "+time);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterest s = new SimpleInterest();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal amount : ");
		s.principle=sc.nextDouble();
		System.out.println("Enter Rate Of interest : ");
		s.rate=sc.nextDouble();
		System.out.println("Enter Time period : ");
		s.time=sc.nextDouble();
		calculateInterest(s.principle,s.rate,s.time);
		s.displayDetails();
		sc.close();
	}

}
