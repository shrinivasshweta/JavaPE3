package com.stackroute.pe3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConsecutiveNumTest {
	private static ConsecutiveNum cn;
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
	
		cn= new ConsecutiveNum();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		cn = null;

	}
	@Test
	public void testConsecutive()
	{
		String s = "1,2,3,4,5,6,7";
		assertEquals("Consecutive Numbers",cn.checkNum(s));
	}
	@Test
	public void testConsecutives()
	{
		String s = "7,6,5,4,3,2,1";
		assertEquals("Consecutive Numbers",cn.checkNum(s));
	}
	@Test
	public void testnotConsecutive()
	{
		String s = "1,2,3,4,5,6,6";
		assertEquals("Not Consecutive Numbers",cn.checkNum(s));
	}
	@Test
	public void testnotConsecutives()
	{
		String s = "1,2,3,4,5,6,6";
		assertNotEquals("Consecutive Numbers",cn.checkNum(s));
	}
}
