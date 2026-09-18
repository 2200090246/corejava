package com.methods.nrwtp;
import java.util.Scanner;
public class Shopping {
	double price;
	int quantity;
	public static void calculateTotal(double price, int quantity) {
		double tprice = price * quantity;
		System.out.println("Total Price = "+tprice);
	}
	public void displayitem() {
		System.out.println("Price of Item : "+price);
		System.out.println("Quantity of item : "+quantity);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopping s = new Shopping();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter prrice of Item : ");
		s.price=sc.nextDouble();
		System.out.println("Enter quantity of item : ");
		s.quantity=sc.nextInt();
		calculateTotal(s.price,s.quantity);
		s.displayitem();
		sc.close();
	}

}
