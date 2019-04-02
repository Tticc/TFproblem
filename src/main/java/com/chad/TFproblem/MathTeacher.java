package com.chad.TFproblem;

public class MathTeacher {
	/**
	 * random a student to the first one
	 * 
	 */
	public int startTheGameFrom(int numOfStudent){
		return (int)(Math.random() * numOfStudent);
	}
}
