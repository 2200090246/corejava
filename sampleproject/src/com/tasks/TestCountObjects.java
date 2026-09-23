package com.tasks;

public class TestCountObjects {
	static int count = 0;
	public TestCountObjects() {
		count++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCountObjects t = new TestCountObjects();
		TestCountObjects t1 = new TestCountObjects();
		TestCountObjects t2 = new TestCountObjects();
		System.out.println("No of objects Created : "+count);
		

	}

}
