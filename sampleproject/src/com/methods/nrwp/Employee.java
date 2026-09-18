package com.methods.nrwp;
import java.util.Scanner;
public class Employee {
	public void displayEmployee(String name, double salary) {
		System.out.println("Employee Name = "+name);
		System.out.println("Employee salary = "+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Employee Salary : ");
		double salary = sc.nextDouble();
		e.displayEmployee(name, salary);
		sc.close();
	}

}
