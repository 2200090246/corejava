package com.methods.nrwp;
import java.util.Scanner;
public class Student {
	String name;
	double m1,m2,m3;
	static double total_marks;
	public static void totalMarks(double m1,double m2,double m3) {
		total_marks = m1 +m2+m3;
		System.out.println("Total = "+total_marks);
	}
	public void displayDetails() {
		System.out.println("name = "+name);
		System.out.println("Total marks : "+total_marks);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		s.name=sc.nextLine();
		System.out.println("Enter Mark 1 : ");
		s.m1=sc.nextDouble();
		System.out.println("Enter Mark 2 : ");
		s.m2=sc.nextDouble();
		System.out.println("Enter Mark 3 : ");
		s.m3=sc.nextDouble();
		totalMarks(s.m1,s.m2,s.m3);
		s.displayDetails();
		sc.close();
	}

}
