package com.methods.nrwtp;
import java.util.Scanner;
public class EmployeeSalary {
	double basic_salary,bonus;
	public static void calculateTotalSalary(double basic, double bonus) {
		double total_salary = basic + bonus;
		System.out.println("Total Salary = "+total_salary);
	}
	public void displaySalary(){
		System.out.println("Basic Salary = "+basic_salary);
		System.out.println("Bonus = "+bonus);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeSalary e = new EmployeeSalary();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic salary : ");
		e.basic_salary=sc.nextDouble();
		System.out.println("Enter bonus : ");
		e.bonus=sc.nextDouble();
		
		calculateTotalSalary(e.basic_salary,e.bonus);
		e.displaySalary();
		sc.close();
	}

}
