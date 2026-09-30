//Task : print account details using copy constructor
package com.tasks;

public class BankAccount2 {
	long account_number;
	String account_holder_name;
	double balance;
	String branch;
	
	public BankAccount2(long account_number, String account_holder_name, double balance, String branch) {
		this.account_number = account_number;
		this.account_holder_name = account_holder_name;
		this.balance = balance;
		this.branch = branch;
	}
	public BankAccount2(BankAccount2 b) {
		this.account_number=b.account_number;
		this.account_holder_name=b.account_holder_name;
		this.balance=b.balance;
		this.branch=b.branch;
	}
	public void accountInfo() {
		System.out.println("*******"+account_holder_name+" Details********");
		System.out.println("Account Holder Name : "+account_holder_name);
		System.out.println("Account NUmber of "+account_holder_name+" : "+account_number);
		System.out.println(account_holder_name+" balance is "+balance);
		System.out.println(account_holder_name+" has bank account in "+branch+" branch");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount2 b = new BankAccount2(246,"mahesh",2000.00,"Julurpad");
		b.accountInfo();
		System.out.println(" ");
		BankAccount2 b1 = new BankAccount2(b);
		b1.branch="Khammam";
		b1.balance=5000;
		b1.accountInfo();
	}

}
