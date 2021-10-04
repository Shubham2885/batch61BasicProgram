package com.bz.day4.exceptionhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingException {

	public static void main(String[] args) {
		
		File file = new File("F:\\shubham.txt");
		
		String message = "hello world";
		FileWriter fileWriter = null;
		FileReader fileReader = null;
		try {
//			fileWriter = new FileWriter(file);
			fileReader = new FileReader(file);
			Scanner scanner = new Scanner(fileReader);
//			System.out.println(scanner.nextLine());
//			fileWriter.write(message);
		} catch ( NullPointerException | FileNotFoundException e) {
			System.out.println("Exception Handled :: "+e);
		}finally {
			try {
//				fileWriter.close();
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(file.exists());
		
	}
}
