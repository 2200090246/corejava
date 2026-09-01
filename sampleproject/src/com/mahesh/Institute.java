package com.mahesh;

public class Institute {
	static String Trainer1,Trainer2;
	String ename;
	int eid;
	String edesignation;
	void show(String ename,int eid,String edisgnation) {
		System.out.println("Trainer1 Name: "+Trainer1+" Trainer2 Name: "+Trainer2+" Employee Name: "+ename+" Employee id: "+eid+" Employee designation: "+edesignation);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainer1 = "Srikanth";
		Trainer2 = "Vishwanath";
		Institute i = new Institute();
		i.ename="Mahesh";
		i.eid=90246;
		i.edesignation="Software developer";
		i.show(i.ename,i.eid,i.edesignation);
		Institute k = new Institute();
		k.ename="gopi";
		k.eid=902;
		k.edesignation=" Software Trainee";
		k.show(k.ename,k.eid,k.edesignation);
		Institute M = new Institute();
		M.ename="Mokshitha";
		M.eid=90255;
		M.edesignation="Cloud Engineer";
		M.show(M.ename,M.eid,M.edesignation);		
		Institute A = new Institute();
		A.ename="Aakash";
		A.eid=90067;
		A.edesignation="Ai engineer";
		A.show(A.ename,A.eid,A.edesignation);		
		Institute S = new Institute();
		S.ename="subhashini";
		S.eid=1459;
		S.edesignation="Software developer";
		S.show(S.ename,S.eid,S.edesignation);		
		
		
		

	}

}
