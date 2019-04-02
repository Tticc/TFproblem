package com.chad.TFproblem;

import java.util.Iterator;
import java.util.LinkedList;

public class MyClass {
	private LinkedList<Student> studentList = null;
	private int numOfStudent;
	private Iterator<Student> ite = null;
	
	private MathTeacher mathTeacher;


	
	
	/**
	 * private default Constructor
	 */
	private MyClass(){}
	
	/**
	 * Constructor with int parameter to set number of student and initialize them
	 *  and initialize mathTeacher as well as set the first student to be the starter
	 * @param numOfStudent
	 */
	public MyClass(int numOfStudent, TFstage1 rule){
		this.numOfStudent = numOfStudent;
		this.studentList = Student.generateStudent(numOfStudent, rule);
		this.mathTeacher = new MathTeacher();
		this.ite = studentList.iterator();
	}
	
	/**
	 * play the game
	 * @param numOfStudent
	 */
	public void playTheGame(){
		int firstOne = this.mathTeacher.startTheGameFrom(this.numOfStudent);
		setFirstStudent(firstOne);
		for(int i = 1; i <= 100; i++){
			nextOne().shout(i);
		}
	}
	
	/**
	 * Point who is the first one to start.
	 *  to avoid the number is too large, circle
	 * @param indexOfStuednt should be in range [0, numberOfStudent)
	 * 
	 */
	public void setFirstStudent(int indexOfStuednt){
		ite = studentList.listIterator(indexOfStuednt % studentList.size());
	}
	
	/**
	 * one by one, circle all the students. 
	 * @return
	 */
	public Student nextOne(){
		if(this.ite.hasNext()){
			return ite.next();
		}else{
			ite = studentList.listIterator(0);
			return ite.next();
		}
	}

}
