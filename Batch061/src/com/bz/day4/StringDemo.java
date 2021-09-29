package com.bz.day4;

import com.bz.day4.linkedList.IStack;
import com.bz.day4.linkedList.LinkedList;

public class StringDemo {

	public static void main(String[] args) {
		String exp = "(1+2)*(3+4)";
		
		IStack<String> iStack = new LinkedList<String>();
		
		for(int i=0;i<exp.length();i++) {
			char ch = exp.charAt(i);
			String x = Character.toString(ch);
			
			if(!x.equals("(")  && !x.equals(")")) {
				iStack.add(x);
			}
			
			if(x.equals(")")) {
				String firstOp = iStack.pop();
				String op = iStack.pop();
				String SecondOp = iStack.pop();
				iStack.add(getResult(firstOp,SecondOp,op));
			}
			
		}
		iStack.printLinkedList();
	}
	
	static String getResult(String fo, String so, String op) {
		switch (op) {
		case "+":
			Integer result1 = Integer.parseInt(fo) + Integer.parseInt(so);
			return result1.toString();
		case "-":
			Integer result2 = Integer.parseInt(fo) - Integer.parseInt(so);
			return result2.toString();
		default:
			break;
		}
		return null;
	}
	
}
