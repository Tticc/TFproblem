package com.chad.TFproblem;

import java.util.LinkedList;

public class Student {
	
	private String name;
	private TFstage1 rule;
	
	/**
	 * private default Constructor
	 */
	public Student(){}
	
	/**
	 * Constructor with String parameter to set student name
	 * @param name
	 */
	public Student(String name, TFstage1 rule){
		this.name = name;
		this.rule = rule;
	}
	
	public void shout(int number){
		System.out.print(this.name+" shout: ");
		rule.applyRule(number);
	}
	
	/**
	 * get student's name
	 * @return
	 */
	public String getName(){
		return this.name;
	}

	public static LinkedList<Student> generateStudent(int numberOfStudent, TFstage1 rule) {
		LinkedList<Student> stl = new LinkedList<Student>();
		for(int i = 0; i < numberOfStudent; i++) {
			stl.add(new Student("name_"+i, rule));
		}
		return stl;
	}
}
