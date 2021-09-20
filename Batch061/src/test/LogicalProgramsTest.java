package test;

import org.junit.Assert;
import org.junit.Test;

import com.bz.day4.LogicalPrograms;
import com.bz.day4.interfaces.IDemo;
import com.bz.day4.service.DemoImpl;

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
	
	@Test(expected = NullPointerException.class)
	public void printTest() {
		int x[][] = {{1,2},{3,4}};
		x = LogicalPrograms.print(x);
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x.length;j++) {
				System.out.print(" "+x[i][j]);
			}
			System.out.println();
		}
		Assert.assertTrue(true);
	}
	
	@Test
	public void test1() {
		IDemo demo = new DemoImpl();
		Assert.assertEquals(5, demo.addTwoNumber(1, 4));
	}
}
