package com.tasks;

public class Employee {
	int id;
	byte age;
	double salary;
	char grade;
	short yoe;
	boolean isActive;
	int nol;
	long phoneNumber;
	int avialbleleaves;//global
	void applyLeave( ) {

		if(avialbleleaves == 0) {
			System.out.println(id+"You have No more Leaves in this month to apply for leave");
			return;
		}
		avialbleleaves--;
		nol++;
	}
	void display(int id, byte age,double salary,char grade,short yoe,boolean isActive,int nol,long phoneNumber) {
		System.out.println(id + " details");
		System.out.println("Employee Id : "+id+", Employee age : "+age+", Employee Salary : "+salary+", Employee Grade : "+grade+", Employee experirnce in years : "+yoe+", Employee is active"+isActive+", Employee leaves : "+nol+", Employee Phone Number : "+phoneNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.id=90246;
		e.age=21;
		e.salary=250000000;
		e.grade='A';
		e.yoe=10;
		e.isActive=true;
		e.avialbleleaves=5;
		e.phoneNumber=7815942053L;
		e.nol=0;
		e.applyLeave();
		e.applyLeave();
		e.display(e.id, e.age, e.salary, e.grade, e.yoe, e.isActive, e.nol, e.phoneNumber);
		Employee e1 = new Employee();
		e1.id=90255;
		e1.age=23;
		e1.salary=260000000;
		e1.grade='A';
		e1.yoe=12;
		e1.isActive=true;
		e1.avialbleleaves=3;
		e1.phoneNumber=7815657053L;
		e1.nol=0;
		e1.applyLeave();
		e1.applyLeave();
		e1.applyLeave();
		e1.applyLeave();
		e1.display(e1.id, e1.age, e1.salary, e1.grade, e1.yoe, e1.isActive, e1.nol, e1.phoneNumber);
		

	}

}
