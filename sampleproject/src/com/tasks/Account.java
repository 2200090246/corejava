package com.tasks;

public class Account {
	int Acno;
	String accountHolderName;
	double balance;
	static int accnogenrator = 2463;
	{
		Acno = accnogenrator;
		accnogenrator++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
		a.accountHolderName = "Mahesh";
		a.balance = 400000;
		System.out.println(a.accountHolderName + " Details");
		System.out.println("Account Holder Name : " + a.accountHolderName + ", Account Number : " + a.Acno
				+ ", Balance : " + a.balance);
		Account b = new Account();
		b.accountHolderName = "Subhu";
		b.balance = 500000;
		System.out.println(b.accountHolderName + " Details");
		System.out.println("Account Holder Name : " + b.accountHolderName + ", Account Number : " + b.Acno
				+ ", Balance : " + b.balance);
		Account c = new Account();
		c.accountHolderName = "Mokshitha";
		c.balance = 600000;
		System.out.println(c.accountHolderName + " Details");
		System.out.println("Account Holder Name : " + c.accountHolderName + ", Account Number : " + c.Acno
				+ ", Balance : " + c.balance);

	}

}
