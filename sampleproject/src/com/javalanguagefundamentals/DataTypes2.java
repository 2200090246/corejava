package com.javalanguagefundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;
class Student{
	int StudentId;
	String StudentName;
}

public class DataTypes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//In java we have object data types
		/*Integer is a data type where it is used as object data type
		 * we are using primitive data types instead of object data types because primitive data types takes less memory than object data types
		 * when we are storing a value in wrapper object it is converted to wrapper object data type which is known as auto boxing
		 * before 1.5 version we don't have auto boxing concept so at that time we converted manually using Integer.valueOf(a)
		 */
		int a = 100;
		Integer b = Integer.valueOf(a);
		/*similarly as int has Integer as wrapper object data type all 8 primitive data types has wrapper objects
		 * byte = Byte
		 * short = Short
		 * long = Long
		 * float = Float
		 * double = Double
		 * char = Character
		 * boolean = Boolean
		 */
		Byte c = 100;
		Short d = 114;
		Float e = 123F;
		Double f = 200D;
		Character g = 'C';
		Boolean h = true;
		System.out.println("Interger value : "+b);
		System.out.println("Byte value : "+c);
		System.out.println("Short Value : "+d);
		System.out.println("Float value : "+e);
		System.out.println("Double value : "+f);
		System.out.println("Character value : "+g);
		System.out.println("Boolean value : "+h);
		/*
		 * the above all are wrapper object data types now we are going to learn about object data types which are below
		 * String
		 * BigDecimal
		 * BigInteger
		 */
		String i ="Mahesh";
		BigInteger j = new BigInteger("1000000000000000000");
		BigDecimal k = new BigDecimal("1000090000990909099090909090907889899899778787676666666666666662566666");
		System.out.println("String : "+i);
		System.out.println("Big Integer value : "+j);
		System.out.println("Big Decimal Value : "+k);
		/*
		 * Now we are going to learn about the user defined data types
		 * a class is a user defined data type
		 */
		Student s = new Student();
		
		System.out.println("User defined data type after creating object"+s);//it is going to print address of Student 
		s.StudentName="Mahesh";
		System.out.println("Student name form user defined data type Student : "+s.StudentName);
	}

}
