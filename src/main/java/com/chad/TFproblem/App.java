package com.chad.TFproblem;

/**
 * Main class with the entrance to the program
 * run as java application
 */
public class App 
{
	/**
	 * start app. new MyClass instance with parameter students number and rule.
	 * @param args
	 */
    public static void main( String[] args )
    {
        //new MyClass(33, new TFstage1()).playTheGame();
        new MyClass(33, new TFstage2()).playTheGame();
    }
}
