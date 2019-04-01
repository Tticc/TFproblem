package com.chad.TFproblem;

import junit.framework.TestCase;

public class TFstage2Test extends TestCase {

	public void testPlayGame() {
		assertTrue(true);
	}
	/**
	 * test contain3
	 */
	public void testContain3() {
		assertTrue(TFstage2.contain3(23));
		assertFalse(TFstage2.contain3(22));
	}
	/**
	 * test contain5
	 */
	public void testContain5() {
		assertTrue(TFstage2.contain5(5));
		assertFalse(TFstage2.contain5(6));
	}

}
