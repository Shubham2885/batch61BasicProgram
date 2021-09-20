package com.bz.day4.inheritance;

//subclass // clild class // 
public class Son extends Father {
	
	
	public Son() {
		super();
		System.out.println("Clild constuctor call");
	}
	
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Details of Clild :: ");
		System.out.println("Color :: "+color);
		System.out.println("Height :: "+height);
		System.out.println("Surname of Clild :: "+surname);
		System.out.println("MarrigeCertificate of GFather :: "+certificate);
	}
	
	public void doSome() {
		System.out.println("doSome");
	}
}
