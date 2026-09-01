package com.mahesh;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Mainmethod started");
		System.out.println("welcome to java world");
		Class.forName("java.lang.System");
		Class.forName("java.lang.Class");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Class.forName("com.mahesh.Test");
		System.out.println("Mainmethod ended");
	}

}
