package com.bz.day4.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilRegex {

	public static boolean checkFirstAphToUp(String input) {
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,16}$");
		Matcher matcher = pattern.matcher(input);
		return matcher.find();
	}
}
