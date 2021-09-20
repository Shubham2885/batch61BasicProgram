package com.bz.day4.inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		Son son = new Son();
		
		Father father = new Son();
		//Father father1 = new Father();
//		son.setColor("brown");
//		son.setHeight(5);
		
		father.printDetails();
		//father1.printDetails();
		son.doSome();
	}
}
