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

			iStack.add(x);
		}
		iStack.printLinkedList();
		
		int result = 0;
		while(!iStack.isEmply()) {
			String x = iStack.pop();
			if(x.equals(")")) {
				String fo = iStack.pop();
				String op = null;
			}
		}
	}
	
	static int getResult(String fo, String so, String op) {
		switch (op) {
		case "+":
			Integer result1 = Integer.parseInt(fo) + Integer.parseInt(so);
			return result1;
		case "-":
			Integer result2 = Integer.parseInt(fo) - Integer.parseInt(so);
			return result2;
		default:
			break;
		}
		return 0;
	}
	
}
