package com.bz.day4.service;

import com.bz.day4.interfaces.IDemo;
import com.bz.day4.interfaces.IDemo1;

public class DemoImpl implements IDemo , IDemo1{

	@Override
	public void showDemo() {
		System.out.println("Hello Interface Demo");
	}

	@Override
	public int addTwoNumber(int x, int y) {
		return x+y;
	}

	@Override
	public void showDemo1() {
		System.out.println("Hello Interface Demo1");
	}

	@Override
	public void superMethod() {
		System.out.println("Super method");
	}

	@Override
	public void something() {
		
	}

}
