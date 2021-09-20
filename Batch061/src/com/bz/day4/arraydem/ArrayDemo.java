package com.bz.day4.arraydem;

public class ArrayDemo {

	public static void showArrayDetails(Object obj[]) {
		for(int i=0;i<obj.length;i++) {
			switch (i) {
			case 0:
				int intArray[] = (int[]) obj[i];
				for(int j=0;j<intArray.length;j++) {
					System.out.println(intArray[j]);
				}
				break;
			case 1:
				String stringArray[] = (String[]) obj[i];
				for(int j=0;j<stringArray.length;j++) {
					System.out.println(stringArray[j]);
				}
				break;
			case 2:
				Student studArray[] = (Student[]) obj[i];
				for(int j=0;j<studArray.length;j++) {
					System.out.println(studArray[j]);
				}
				break;
			default:
				break;
			}
		}
	}
	
}

