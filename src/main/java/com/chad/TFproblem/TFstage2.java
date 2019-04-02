package com.chad.TFproblem;

/**
 * <p>stage 2:</p>
 * <p>Extends TFstage1, add additional condition "contain 3 or 5"</p>
 * 
 * @see TFstage1
 * @author wenc
 *
 */
public class TFstage2 extends TFstage1{

	/**
	 * applyRule
	 */
	@Override
	public void applyRule(int i) {
		boolean containOrMulOf3 = (TFstage1.mulOf3(i) || contain3(i));
		boolean containOrMulOf5 = (TFstage1.mulOf5(i) || contain5(i));
		System.out.print(containOrMulOf3 ? TFstage1.FIZZ : "");
		System.out.print(containOrMulOf5 ? TFstage1.BUZZ : "");
		System.out.print(containOrMulOf3 || containOrMulOf5 ? "" : i);
		System.out.println();
	}
	/**
	 * <p>String the int para and check whether it contains 3 </p>
	 * @param i
	 * @return {@code true} only if the number contains of 3
	 */
	public static boolean contain3(int i) {
		if(i == 0) return false;
		return (i+"").indexOf("3") >= 0 ? true : false;
	}
	/**
	 * <p>String the int para and check whether it contains 5 </p>
	 * @param i
	 * @return {@code true} only if the number contains of 5
	 */
	public static boolean contain5(int i) {
		if(i == 0) return false;
		return (i+"").indexOf("5") >= 0 ? true : false;
		
	}
}
