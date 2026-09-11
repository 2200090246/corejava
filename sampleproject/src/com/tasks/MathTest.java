//Task: User has 100 Rupees and one pencil costs 7 rupees now you have to calculate how many pencils User can buy and how much balance is available at user;
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
