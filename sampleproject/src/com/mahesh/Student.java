//Task: write a program to understand how JVM finds a class
package com.mahesh;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Mainmethod started");
		System.out.println("welcome to java world");
		Class.forName("java.lang.System");//As it is predefined package JVM will find this class at bootstrap class loader
		Class.forName("java.lang.Class");
		Class.forName("com.mysql.cj.jdbc.Driver");//As it is external package it will load in application class loader
		Class.forName("com.mahesh.Test");
		System.out.println("Mainmethod ended");
	}

}
