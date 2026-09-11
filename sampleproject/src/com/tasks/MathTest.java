package com.tasks;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userMoney = 100;
		int pencilCost = 7;
		int NumberOfpencilsUsercanBuy =userMoney /pencilCost;
		int remainingAmount = userMoney % pencilCost;
		System.out.println("User can Buy : "+NumberOfpencilsUsercanBuy+" pencils");
		System.out.println("User balance amount : "+remainingAmount);

	}

}
