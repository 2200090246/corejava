package com.constructors;

import java.util.Scanner;

class Parent{
	String name="mahesh";
	Parent(){
		 System.out.println("No arg constructor from parent");
	}
}
public class TestConstructors extends Parent{
    String name = "subhu";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestConstructors t = new TestConstructors();
		t.info();
		Scanner sc=new Scanner(System.in);
	}

	public void info() {
		// TODO Auto-generated method stub
		System.out.println(super.name);
		
	}

}
