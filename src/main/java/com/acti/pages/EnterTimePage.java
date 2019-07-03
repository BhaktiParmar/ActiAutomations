package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;
/*
*Script Author : Bhakti
*Date : 6/25/2019
*reviewed By : Hitesh
*Code Checked : Yes
*/
public class EnterTimePage  extends DriverScript{
	  
	//********************Page Elements*******************************************
	
	
	@FindBy(id="logoutLink") WebElement LogoutLink;
	@FindBy(xpath="//div[contains(text(),'USERS')]") WebElement usersMenu;
	@FindBy(xpath="//a[@class='content selected tt']") WebElement TimeTrackMenu;
	@FindBy(xpath="//a[@class='content selected tasks']") WebElement TaskkMenu;
	@FindBy(xpath="//a[@class='content reports']]") WebElement ReportsMenu;
	//***********************Element Initialization*********************************
	
	public EnterTimePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
//	***************************************page Action********************************
	
	
	
	public String verifyEnterTimePageTitle()
	{
		return driver.getTitle();
	}
	
	public void ClickLogoutLink()
	{
		LogoutLink.click();
	}
	
	public void ClickusersMenu()
	{
		usersMenu.click();
	}
	
	public boolean verifyTimeTrackMenu()
	{
		return TimeTrackMenu.isDisplayed();
	}
	
	public boolean verifyTaskkMenu()
	{
		return TaskkMenu.isDisplayed();
	}
	
	public boolean verifyReportsMenu()
	{
		return  ReportsMenu.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
