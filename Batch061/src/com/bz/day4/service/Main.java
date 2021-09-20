package com.bz.day4.service;

import com.bz.day4.interfaces.IDemo;
import com.bz.day4.interfaces.IDemo1;

public class Main {

	public static void main(String[] args) {
		
		IDemo demo = new DemoImpl();
		IDemo1 demo1 = new DemoImpl();
		DemoImpl demoImpl = new DemoImpl();
		demo.showDemo();
		demo1.showDemo1();
		System.out.println("Addition of two numbers = "+demo.addTwoNumber(IDemo.x, 4));
	}
}
