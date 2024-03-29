package com.bz.day4;

public class LogicalPrograms {

	public static int revers(int n) {
		int sum = 0;
		int rm = 0;
		while(n!=0) {
			rm = n%10;
			sum = (sum * 10) + rm;
			n = n/10;
		}
		return sum;
	}
	
	public static int findGreatestNumber(int x, int y) {
		return x > y ? x : y;
	}
	
	public static int[][] print( int x[][]) {
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x.length;j++) {
				x[i][j] = i * 5;
			}
		}
		return x;
	}
}
