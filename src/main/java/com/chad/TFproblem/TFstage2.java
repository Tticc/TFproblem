package com.chad.TFproblem;

/**
 * <p>stage 2:</p>
 * <p>Combine TFstage1, add additional condition "contain 3 or 5"</p>
 * 
 * @see TFstage1
 * @author wenc
 *
 */
public class TFstage2{
	/**
	 * <p>From 1 to 100, print Fizz if the number contain or is divisible by 3
	 *  and print Buzz if the number contain or is divisible by 5.
	 *   If both, ie 15, print FizzBuzz</p>
	 */
	public void playGame() {
		for(int i = 1; i < 100; i++) {
			boolean containOrMulOf3 = (TFstage1.mulOf3(i) || contain3(i));
			boolean containOrMulOf5 = (TFstage1.mulOf5(i) || contain5(i));
			System.out.print(containOrMulOf3 ? TFstage1.FIZZ : "");
			System.out.print(containOrMulOf5 ? TFstage1.BUZZ : "");
			System.out.print(containOrMulOf3 || containOrMulOf5 ? "" : i);
			System.out.println();
		}
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
