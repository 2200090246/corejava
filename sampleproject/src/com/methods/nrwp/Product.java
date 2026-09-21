package com.methods.nrwp;

import java.util.Scanner;

public class Product {
	String productName;
	double price;
	int quantity;
	public double calculateTotalPrice() {
		double tprice = quantity * price;
		return tprice;
		
	}
	
	public void displayProductName() {
		System.out.println("Product Name : "+productName);
		
	}
	public void displayTotalPrice(double tp) {
		System.out.println("total price : "+tp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Product p=new Product();
		
		System.out.println("Enter product Name : ");
		p.productName=sc.nextLine();
		System.out.println("Enter "+p.productName+" price : ");
		p.price=sc.nextInt();
		System.out.println("Enter "+p.productName+" quantity : ");
		p.quantity=sc.nextInt();
		double tp = p.calculateTotalPrice();
		p.displayProductName();
		p.displayTotalPrice(tp);
		sc.close();
	}

}
