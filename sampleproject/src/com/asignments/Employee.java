package com.asignments;

import java.util.Scanner;

public class Employee {
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public double calculateSalary() {
		var sal = salary * 1.1;
		return sal;
	}

	public void displayEmployeeInfo(double sal) {
		System.out.println("*********" + name + " Details************");
		System.out.println("Employee Id : " + id);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Salary before giving bonus : " + salary);
		System.out.printf("Employee salary after giving bonus :%.2f ", sal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Employee Salary : ");
		double salary = sc.nextDouble();

		Employee e = new Employee(id, name, salary);
		double sal = e.calculateSalary();
		e.displayEmployeeInfo(sal);
		System.out.println();
		System.out.println("Enter Employee Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name : ");
		name = sc.nextLine();
		System.out.println("Enter Employee Salary : ");
		salary = sc.nextDouble();

		Employee e1 = new Employee(id, name, salary);
		sal = e1.calculateSalary();
		e1.displayEmployeeInfo(sal);
		sc.close();
	}

}
