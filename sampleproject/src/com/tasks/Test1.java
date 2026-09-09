//Task : write a program by creating 2 static and 2 instance methods and don't create object at class level or method level and don't call any method in main method but you have to print all the e4methods 
package com.tasks;

public class Test1 {
	//when Class loads it actually run the static block first so thats why i created static block;
	static {
		//when we create a object in static block and call method it can call one instance method
		Test1 t1 = new Test1();
		t1.instancemthod1();

	}

	public static void staticmethod1() {
		System.out.println("static method 1 called");
		staticmethod2();//As we can call a static method from one static method i am calling static method 2

	}

	public static void staticmethod2() {
		System.out.println("static method 2 called");

	}

	public void instancemthod1() {
		System.out.println("instance method 1 called");
		instancemethod2();//As we can call instance method from one instance method iam calling instance method 2

	}

	public void instancemethod2() {
		System.out.println("instance method 2 called");
		staticmethod1();//As we can call static method from instance method 1 i am calling static method 1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
