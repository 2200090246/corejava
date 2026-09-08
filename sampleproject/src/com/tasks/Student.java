//Task: Write a program to display students using class and methods;
package com.tasks;

public class Student {
	static String college="KL University";//As i am printing same college student Details so college name will not change so that's why i am using static keyword for college
	//As name and age will change for every student name age will be different so that's why  i am using instance variable 
	String name;
	int age;
	//The below method will print the details of student when main method calls it;
	public static void display(String name, int age) {
		System.out.println(name + " Details");
		System.out.println("Name of the Stuent: "+name+", STudent age: "+age+", College: "+college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.name="mahesh";
		s.age=21;
		display(s.name,s.age);//i am calling the display method with parameters to print the student details
		Student s1 = new Student();
		s1.name="mahesh";
		s1.age=21;
		display(s1.name,s1.age);

	}

}
