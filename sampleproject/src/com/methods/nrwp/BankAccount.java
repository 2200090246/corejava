package com.methods.nrwp;
import java.util.Scanner;
public class BankAccount {
	double intial_balance;
	double deposit_amount;
	public static void calculateBalance(double balance, double deposit) {
		balance = balance + deposit;
		System.out.println("New Balance = "+balance);
	}
	public void displayBalance() {
		System.out.println("initial_balance = "+intial_balance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter initial balance : ");
		b.intial_balance=sc.nextDouble();
		System.out.println("Enter deposit Amount : ");
		b.deposit_amount=sc.nextDouble();
		calculateBalance(b.intial_balance,b.deposit_amount);
		b.displayBalance();
		sc.close();

	}

}
