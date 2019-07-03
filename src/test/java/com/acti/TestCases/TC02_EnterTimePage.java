package com.acti.TestCases;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TC02_EnterTimePage extends PreTest {
	
	@Test(priority=1)
	public void testEnterTimePageTitle()
	{
	       LaunchApp();
	       LP.validateLogin("admin", "manager");
	        
			String Title = ET.verifyEnterTimePageTitle();
			Assert.assertEquals("actiTime Enter Time-track",Title );
		}
		
	
	
//	@Test(priority=2)
	public void testEnterMenuDisplayed()
	{
	LP.validateLogin("admin", "manager");
	boolean flag = ET.verifyTimeTrackMenu();
		System.out.println(flag);
	}

		
	}
	
	
	
	
	
	
	
	


