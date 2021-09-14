package test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import com.bz.day4.LogicalPrograms;

public class LogicalProgramsTest {

	@Test
	public void reversTest() {
		int a = LogicalPrograms.revers(100);
		Assert.assertEquals(321, a);
	}
	
	@Test
	public void findTest1() {
		Assert.assertEquals(5, LogicalPrograms.findGreatestNumber(5, 3));
	}
	
	@Test
	public void findTest2() {
		Assert.assertEquals(8, LogicalPrograms.findGreatestNumber(5, 8));
	}
}
