package com.methods.nrwtp;
import java.util.Scanner;
public class Rectangle {
	double length,width;
	public static void calculateArea(double length, double width) {
		double a = length * width;
		System.out.println("Area of Rectangle : "+a);
	}
	public void Dimensions() {
		System.out.println("Length = "+length);
		System.out.println("Width = "+width);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Rectangle : ");
		r.length=sc.nextDouble();
		System.out.println("Enter width of the Rectangle : ");
		r.width=sc.nextDouble();
		calculateArea(r.length,r.width);
		r.Dimensions();
		sc.close();
	}

}
