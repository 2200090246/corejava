package com.tasks;
class Vehicle {
	String type ;

	public Vehicle(String type) {
		this.type = type;
	}
	
}
class Car extends Vehicle {

	String brand;
	double price;
	public Car(String type, String brand, double price) {
		super(type);
		this.brand = brand;
		this.price = price;
	}
	
	
}

public class ElectricCar extends Car{
	double battery_capacity;
	public ElectricCar(String type, String brand, double price, double battery_capacity) {
		super(type, brand, price);
		this.battery_capacity = battery_capacity;
	}

	 void display() {
	        System.out.println("Type: " + type);
	        System.out.println("Brand: " + brand);
	        System.out.println("Price: " + price);
	        System.out.println("Battery Capacity: " + battery_capacity + " kWh");
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricCar e = new ElectricCar("Electric", "tesla", 500000, 75);
		e.display();
	}

}
