package com.acti.TestCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import junit.framework.Assert;

public class TC01_LoginPage extends PreTest {
	
	
	
	
	@Test(priority=1)
	public void testLoginPageTitle()
	{
		logger=extent.createTest("Verify Page Title");
		LaunchApp();
		logger.log(Status.PASS, "Launched the Application");
		String Title = LP.verifyLoginPageTitle();
		Assert.assertEquals("actiTIME - Login",Title );
		logger.log(Status.PASS,"Title verified" );
	}
	
	
	@Test(priority=2)
	public void testActiTimeLogo()
	{
		logger=extent.createTest("Verify Logo");
		LaunchApp();
		logger.log(Status.PASS, "Launched the Application");
		boolean flag = LP.verifyActiTimeLogo();
        System.out.println(flag);
        logger.log(Status.PASS,"Logo Present" );
	}

	@Test(priority = 3)
	public void TestLoginFunctionality() {
		logger = extent.createTest("Validate LOgin");
		LaunchApp();
		logger.log(Status.PASS, "Launched the Application");
		logger.log(Status.INFO, "Entered UserName");
		logger.log(Status.INFO, "Entered password");
		logger.log(Status.INFO, "clicked on login button");
		LP.validateLogin("admin", "manager");
		logger.log(Status.PASS, "User able to login Successfully");

	}

}
