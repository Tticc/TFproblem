package com.chad.TFproblem;


/**
 * stage 1: apply a rule - check whether a number is divisible by 3/5<br/>  
 * 
 * from i=1 to i=100<br/>
 * when 
 *   i%3 == 0, print Fizz; 
 *   i%5 == 0, print Buzz; 
 *   i%3 == 0 and i%5 == 0, print FizzBuzz; 
 *   else print i  
 * @author wenc
 *
 */
public class TFstage1 {
	public static final String FIZZ = "Fizz";
	public static final String BUZZ = "Buzz";
	

	public void applyRule(int i) {
		System.out.print(mulOf3(i) ? FIZZ : "");
		System.out.print(mulOf5(i) ? BUZZ : "");
		System.out.print((mulOf3(i) || mulOf5(i)) ? "" : i);
		System.out.println();
	}

	/**
	 * <p>Whether the parameter is divisible by 3</p>
	 * @param i
	 * @return {@code true} only if the number is divisible by 3
	 */
	public static boolean mulOf3(int i) {
		if(i == 0) return false;
		return i%3 == 0 ? true : false;
	}
	/**
	 * <p>Whether the parameter is divisible by 5</p>
	 * @param i
	 * @return {@code true} only if the number is divisible by 5
	 */
	public static boolean mulOf5(int i) {
		if(i == 0) return false;
		return i%5 == 0 ? true : false;
	}

}
