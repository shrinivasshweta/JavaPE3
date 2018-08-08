package com.stackroute.pe3;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ChessBoardTest {
	private static ChessBoard cb;
	@BeforeClass
	public static void setup() {
		// setup methods runs, before every test case runs
		// This method is used to initialize the required variables
		cb = new ChessBoard();
	}

	@AfterClass
	public static void teardown() {
		// teardown method runs, after every test case run
		// This method is to clear the initialized variables
		cb = null;
	}

	@Test
	public void chessDisplay()
	{ String s[][] = {{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}};
			
      assertArrayEquals(s,cb.chessPattern());
		
	}
	@Test
	public void chessDisplays()
	{ String s[][] = {{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","BB|"}};
			
      assertNotEquals(s,cb.chessPattern());
		
	}
	
	

}
