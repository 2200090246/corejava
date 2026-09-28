package com.tasks;

public class Customer {
	String mobile_model;
	int quantity;
	double price;
	double delivery_charges;
	Customer(){
		this("m30s");
	}
	Customer(String mobile_model){
		this(mobile_model,1);
	}
	Customer(String mobile_model,int quantity){
		this(mobile_model,quantity,20000.00);
	}
	Customer(String mobile_model,int quantity,double price){
		this(mobile_model,quantity,price,200.00);
	}
	Customer(String mobile_model,int quantity,double price,double delivery_charges){
		this.mobile_model=mobile_model;
		this.quantity=quantity;
		this.price=price;
		this.delivery_charges=delivery_charges;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		c.mobileInfo();
		Customer c1 = new Customer("m35");
		c1.mobileInfo();
		Customer c2 = new Customer("m36",2);
		c2.mobileInfo();
		
	}
	public void mobileInfo() {
		// TODO Auto-generated method stub
		System.out.println("************"+mobile_model+"***************");
		System.out.println("Model of the mobile : "+mobile_model);
		System.out.println("Number of mobiles : "+quantity);
		System.out.println("Cost of each mobile"+price);
		System.out.println("Delivery Charges : "+delivery_charges);
		System.out.println("Mobile cost : "+(quantity * price));
		System.out.println("final bill : "+((quantity * price)+delivery_charges));
		
		
	}

}
