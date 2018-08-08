package com.stackroute.pe3;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainExceptionTest {
	private static MainException me;
	private static MainException mes;
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
	
		me= new MainException("EXCEPTION");
		mes= new MainException("OCCURRED");
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		me = null;
		mes=null;

	}
	@Test
	public void testConst(){
		String res=me.test();
		String res1=mes.test();
		assertEquals(res,"EXCEPTION");
		assertEquals(res1,"OCCURRED");
		
	}
}
