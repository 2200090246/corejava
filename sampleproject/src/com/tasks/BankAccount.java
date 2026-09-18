package com.tasks;

public class BankAccount {
	static double balance = 1000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deposit(500);
		withdraw(300);
		System.out.println("The balance amount is "+balance);

	}
	public static void deposit(int amount) {
		balance += amount;
		System.out.println(amount+" Deposited");
	}
	public static void withdraw(int amount) {
		if(balance < amount) {
			System.out.println("insufficient funds");
		}else {
			balance -= amount;
			System.out.println(amount+" Withdrwan");
		}
	}

}
