//Task: check in a program which part will be executed first
package com.mahesh;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome mahesh");
	}
	//static block will get execute first because when class loads it will first check for static block or variables after executing them it will execute the main method
	static {
		System.out.println("Welcome to jvm architecture");
	}

}
