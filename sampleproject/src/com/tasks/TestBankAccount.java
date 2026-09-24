package com.tasks;

import java.util.Scanner;

public class TestBankAccount {
	long account_number;
	String customerName;
	String account_type;
	double balance;
	
	public TestBankAccount(long account_number, String customerName, String account_type, double balance) {
		this.account_number = account_number;
		this.customerName = customerName;
		this.account_type = account_type;
		this.balance = balance;
	}
	

	public TestBankAccount() {
		// TODO Auto-generated constructor stub
	}
	public void accountInfo() {
		System.out.println("********"+customerName+" Details*********");
		System.out.println("Customer Name : "+customerName);
		System.out.println(customerName+" Account Number : "+account_number);
		System.out.println(customerName+" Account Type : "+account_type);
		System.out.println(customerName+" Balance is "+balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number : ");
		long account_number=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Customer Name : ");
		String customerName=sc.nextLine();	
		System.out.println("Enter Account type : ");
		String account_type=sc.nextLine();
		System.out.println("Enter account balance : ");
		double balance=sc.nextDouble();
		TestBankAccount t1 = new TestBankAccount(account_number,customerName,account_type,balance);
		t1.accountInfo();
		System.out.println("Enter account number : ");
		account_number=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Customer Name : ");
		customerName=sc.nextLine();	
		System.out.println("Enter Account type : ");
		account_type=sc.nextLine();
		System.out.println("Enter account balance : ");
		balance=sc.nextDouble();
		TestBankAccount t2 = new TestBankAccount(account_number,customerName,account_type,balance);
		t2.accountInfo();
		
		

	}

}
