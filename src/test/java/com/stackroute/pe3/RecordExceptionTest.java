package com.stackroute.pe3;

import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.assertThat;
//import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RecordExceptionTest {
	private static RecordException re;
	@BeforeClass
	public static void setup() {
		// setup methods runs, before every test case runs
		// This method is used to initialize the required variables
		re = new RecordException();

	}

	@AfterClass
	public static void teardown() {
		// teardown method runs, after every test case run
		// This method is to clear the initialized variables
		re = null;

	}
		@Rule
    public ExpectedException thrown = ExpectedException.none();
	
	@Test
	  public void testNegativeArraySizeException() throws NegativeArraySizeException {
		re.testNASE();
        thrown.expect(NegativeArraySizeException.class);
        thrown.expectMessage("NegativeArraySizeException Occured");
        throw new NegativeArraySizeException();
    }
	
	@Test
	  public void testIndexOutOfBoundsException() throws IndexOutOfBoundsException{
		re.testIOBE();
      thrown.expect(IndexOutOfBoundsException.class);
      thrown.expectMessage("IndexOutOfBoundsException Occured");
      throw new IndexOutOfBoundsException();
  }
	@Test
	public void testNullpoint(){
		String res = re.testNPEx();
		assertEquals("java.lang.NullPointerException", res);
	}
	
	@Test
	  public void testNullPointerException() throws NullPointerException {
		re.testNPE();
      thrown.expect(NullPointerException.class);
      thrown.expectMessage("NullPointerException Occured");
      throw new NullPointerException();
  }
	@Test
    public void throwsNothing() {
        // no exception expected, none thrown.
    }

	
  

}
