package com.methods.nrwp;

import java.util.Scanner;

public class Temprature {
	double celsius;
	public static void convertToFahrenheit(double celsius) {
		double f = (celsius * 9/5)+32;
		System.out.println("Temprature in Fahrenheit = "+f);
	}
	public void displayCelsius() {
		System.out.println("Temprature in Celsius = "+celsius);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temprature t = new Temprature();
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Temprature in Celsius : ");
		t.celsius=sc.nextDouble();
		convertToFahrenheit(t.celsius);
		t.displayCelsius();
		sc.close();
	}

}
