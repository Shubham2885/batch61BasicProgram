package com.bz.day4.inheritance;

//base class // parent class also super class
public class Father extends GFather {

	public Father() {
		System.out.println("Father constuctor call");
	}
	
	String color;
	int height;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void singing() {
		System.out.println("singing");
	}
	
	public void printDetails(){
		System.out.println("Details of Father :: ");
		System.out.println("Color :: "+color);
		System.out.println("Height :: "+height);
	}
}
