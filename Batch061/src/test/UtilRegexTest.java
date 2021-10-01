package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bz.day4.regex.UtilRegex;

public class UtilRegexTest {

	@Test
	public void checkFirstAphToUpTest() {
		assertTrue(UtilRegex.checkFirstAphToUp("Sdfj"));
	}
}
