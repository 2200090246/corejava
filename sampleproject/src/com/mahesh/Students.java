package com.mahesh;

public class Students {
	static String collegeName = "KL University";
	String studentName;
	int studentId,studentMarks;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s = new Students();
		s.studentName="Mahesh";
		s.studentId=90246;
		s.studentMarks=100;
		System.out.println("college Name: "+collegeName+" Student Id : "+s.studentId+" Student Name: "+s.studentName+" Student Marks: "+s.studentMarks);
		

	}

}
