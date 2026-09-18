package com.methods.nrwtp;
import java.util.Scanner;
public class Welcome {
	static String name;
	public static void displayWelcome() {
		System.out.println("Welcome to java Programming");
		System.out.println("name = "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Welcome w = new Welcome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		w.name=sc.nextLine();
		displayWelcome();
		sc.close();
	}

}
