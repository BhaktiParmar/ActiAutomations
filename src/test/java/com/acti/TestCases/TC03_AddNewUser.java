package com.acti.TestCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class TC03_AddNewUser extends PreTest {
	
	
	@Test
	public void testValidatecreateNewUser()
	{
		logger=extent.createTest("Validating New User functionality ");
		LaunchApp();
		logger.log(Status.PASS, "Launched application");
		LP.validateLogin("admin", "manager");
		logger.log(Status.PASS, "looged into application");
		ET.ClickusersMenu();
		logger.log(Status.PASS, "clicked on New User Button");
		USP.clickNewUserBtn();
		logger.log(Status.PASS, "Clicked on New User Button");
		USP.createNewUser("Bhakti", "parmar", "test@test.com");
		logger.log(Status.PASS, "Entered FirstName,LastName,Email");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
