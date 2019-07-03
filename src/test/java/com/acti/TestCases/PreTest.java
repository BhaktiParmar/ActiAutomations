package com.acti.TestCases;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import com.acti.Base.DriverScript;
import com.acti.pages.EnterTimePage;
import com.acti.pages.LoginPage;
import com.acti.pages.UserListpage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class PreTest extends DriverScript{
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;
	
	LoginPage LP;
	EnterTimePage ET;
	 UserListpage USP;
	 
	public PreTest()
	{
		super();
	}
	
	@BeforeMethod
	
	public void preCondition()
	{
		//create object of 2 classes
		 htmlReporter = new ExtentHtmlReporter("./actiReports/RegressionResult.html");
		 extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		initBrowser();
		//LaunchApp();
		 LP = new LoginPage();
         ET = new EnterTimePage();
        USP = new UserListpage();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		extent.flush();
	}
}
