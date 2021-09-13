package com.bz.day4;

public class Main {

	public static void main(String[] args) {
		
//		//reference valiable 
//		Vahicle bmw = new Vahicle();
//		
//		bmw.brand = "bmw";
//		bmw.color = "Blue";
//		bmw.name = "bmw";
//		
//		System.out.println("Name of Car = "+bmw.brand);
//		bmw.running();
//		bmw.breaking();
//		
//		Vahicle maruti = new Vahicle();
//		maruti.color = "White";
//		maruti.brand = "Suzuki";
//		
//		System.out.println("Name of Car = "+maruti.brand);
//		System.out.println("Name of Color = "+maruti.brand);
//		
//		Vahicle honda = new Vahicle();
//		maruti.color = "Black";
//		maruti.brand = "Hero";
//		
//		System.out.println("Name of Car = "+maruti.brand);
//		System.out.println("Name of Color = "+maruti.color);
		
		Account acc1 = new Account();
		
		acc1.setName("Shubham");
		acc1.setBalance(10000);
		acc1.showBalance();
		
		Account acc2 = new Account();
		
		acc2.setName("Rahul");
		acc2.setBalance(2000);
		acc2.showBalance();
		
		Account acc3 = new Account();
		
		acc3.setName("P K");
		acc3.setBalance(3000);
		acc3.showBalance();
		
	
	}
}
