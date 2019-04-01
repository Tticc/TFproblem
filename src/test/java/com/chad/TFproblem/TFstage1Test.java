package com.chad.TFproblem;

import junit.framework.TestCase;

public class TFstage1Test extends TestCase {

	public void testPlayGame() {
		assertTrue(true);
	}
	
	public void testPlayGameOri() {
		assertTrue(true);
	}
	
	/**
	 * test if number is divisible by 3
	 */
	public void testMulOf3() {
		assertTrue(TFstage1.mulOf3(99));
		assertFalse(TFstage1.mulOf3(100));
	}
	
	/**
	 * test if number is divisible by 5
	 */
	public void testMulOf5() {
		assertTrue(TFstage1.mulOf5(5));
		assertFalse(TFstage1.mulOf5(6));
	}

}
