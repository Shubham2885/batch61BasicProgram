package com.bz.day4.interfaces;

public interface IDemo extends SuperDemo, IDemo1{

	int x = 5;
	void showDemo();
	
	int addTwoNumber(int x, int y);
	
	void something();
}
