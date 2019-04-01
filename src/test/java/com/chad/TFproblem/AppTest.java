package com.chad.TFproblem;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * TestSuite
 */
public class AppTest 
    extends TestSuite 
{
    
	public static void main(String[] args) {
		junit.textui.TestRunner.run(suite());
	}
	
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
    	TestSuite suite = new TestSuite();
    	suite.addTestSuite(TFstage1Test.class);
    	suite.addTestSuite(TFstage2Test.class);
    	return suite;
    }

}
