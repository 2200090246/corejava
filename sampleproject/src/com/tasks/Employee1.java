//Create a class Named Employee1 with variables named empId, empName,empSalary and create three objects and initialize unique values for each object and print details using method
package com.tasks;

public class Employee1 {
	int empid;
	String empname;
	double empsalary;
	void display() {
		System.out.println(empid+" Details :");
		System.out.println("Employee Id : "+empid+", Employee Name : "+empname+", Employee Salary : "+empsalary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e =new Employee1();
		e.empid=246;
		e.empname="mahesh";
		e.empsalary=50000;
		e.display();
		Employee1 e1 = new Employee1();
		e1.empid=255;
		e1.empname="mokshitha";
		e1.empsalary=100000;
		e1.display();
		Employee1 e2 = new Employee1();
		e2.empid=1459;
		e2.empname="subhu";
		e2.empsalary=60000;
		e2.display();
		
		

	}

}
