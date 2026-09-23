package com.tasks;

public class TestEmployee {
	int eid;
	String ename;
	double esal;
	private TestEmployee(int eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEmployee t = new TestEmployee(1,"mahesh",20000);
		t.empInfo();
		TestEmployee t1 = new TestEmployee(2,"subhu",30000);
		t1.empInfo();
	}
	 void empInfo() {
		// TODO Auto-generated method stub]
		 System.out.println("************"+ename+" Details************");
		System.out.println("Employee Id : "+eid);
		System.out.println("Employee name : "+ename);
		System.out.println("Employee salary : "+esal);
	}

}
