package com.javalanguagefundamentals;

public class IntegerLiterals {
	public static void main(String[] args) {
		//literal is constant value which we store in our variables directly
		int x = 10;
		int y = -50;
		//here we are trying to print binary values in decimal actually it is binary literal because here at starting we are using ob
		//here the base is 2 so 0b1010 means
		//0b->it is binary
		//1010 here 2^0 * 0 + 2^1 *1 + 2^2 *0+2^3*1 = 10
		int a = 0b1010;
		//here JVM will consider first 0 as it is octal literal
		//0->octal where octal base is 8 and it allows only 0 to 7 values 
		//122 ->8^0 * 2 + 8^ 1 * 2 +8^2 *1=82
		int b = 0122;
		//here JVM will consider 0x as hexadecimal literal 
		//hexadecimal literal base value is 16 and it allows only 0-9 and A to F either in lower or upper case characters
		//0x->hexadecimal literal;
		//10AEd -> (16^0 * d)+(16^1*E)+(16^2 * A)+(16 ^ 3 * 0) + (16^4 * 1)
		//here A = 10,b = 11,c=12,d=13,e=14,f=15;
		//so,10AEd -> (1*13)+(16*14)+(256*10)+(0)+(65536) = 
		int c = 0x10AEd;
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
