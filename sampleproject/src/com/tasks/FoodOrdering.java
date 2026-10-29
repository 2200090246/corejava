package com.tasks;

import java.util.Scanner;

public class FoodOrdering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double total = 0;
		String fn = "";
		do {
			System.out.println("********Menu Card*********");
			System.out.println("1.Pizza");
			System.out.println("2.Burger");
			System.out.println("3.Biryani");
			System.out.println("4.Noodles");
			System.out.println("Enter the Item Number you want");
			int in = sc.nextInt();
			String Item ="";
			double price=0;
			switch (in) {
			case 1 -> {
				Item="Pizza";
				price=200;
			}
			case 2 -> {
				Item="Burger";
				price=120;
			}
			case 3 -> {
				Item="Biryani";
				price=180;
			}
			case 4 -> {
				Item="Noodles";
				price=100;
			}
			default -> {
				System.out.println("Enter valid Item number");
			}

			}
			if(price>0) {
				System.out.println("Enter Quantity : ");
				int quantity = sc.nextInt();
				if(quantity > 0) {
					double it = quantity * price;
					total += it;
					System.out.println("\n----- Order Details -----");
                    System.out.println("Selected item: " + Item);
                    System.out.println("Price: Rs." + price);
                    System.out.println("Quantity: " + quantity);
                    System.out.println("Item total: Rs." + it);
				}else {
					System.out.println("Enter postive quantity only");
				}
			}
			System.out.println("Do ypu need anything else sir if yes type Y else N for No");
			String fyn = sc.next();
			fn = fyn;
		} while (fn.equalsIgnoreCase("y"));
		System.out.println("Your toatl bill is " + total + " sir");
		System.out.println("Thank You for Visiting!..");

	}

}
