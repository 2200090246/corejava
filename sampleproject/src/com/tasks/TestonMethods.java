package com.tasks;

public class TestonMethods {
	
	public void add(int a, int b) {
		int res = a + b;
		System.out.println("Addition value : "+res);
		sub(res,a);
	}
	public void sub(int a , int b) {
		int res = a - b;
		System.out.println("Substraction Value : "+res);
		multiply(res,b);
	}
	public void multiply(int a, int b) {
		int res = a * b;
		System.out.println("Multiplication value : "+res);
		divison(res,a);
	}
	public void divison(int a, int b) {
		double res = a / b;
		System.out.println("Divison Value : "+res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestonMethods t = new TestonMethods();
		t.add(5, 10);
	}

}
