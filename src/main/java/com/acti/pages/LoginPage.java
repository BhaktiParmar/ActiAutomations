package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;
import com.acti.Helper.JavaScriptHelper;
/*
*Script Author : Bhakti
*Date : 6/25/2019
*reviewed By : Hitesh
*Code Checked : Yes
*/
public class LoginPage extends DriverScript {

	  
		//********************Page Elements*******************************************
		
		@FindBy(xpath="//div[contains(@class,'atLogoImg')]") WebElement actiLogo;
		@FindBy(id="username") WebElement usernameTB;
		@FindBy(name="pwd")WebElement PasswordTB;
		@FindBy(id="loginButton")WebElement LoginBtn;
		
		
		//***********************Element Initialization*********************************
		
		public LoginPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		//*************************Page Actions*****************************
		
		public String verifyLoginPageTitle ()
		{
			return driver.getTitle();
		}
		
		public boolean verifyActiTimeLogo()
		{
			return actiLogo.isDisplayed();
		}
		
		public void validateLogin(String username,String password)
		{
			JavaScriptHelper.highLightElement(usernameTB);
			usernameTB.sendKeys(username);
			JavaScriptHelper.highLightElement(PasswordTB);
			PasswordTB.sendKeys(password);
			JavaScriptHelper.highLightElement(LoginBtn);
			LoginBtn.click();
		}
		
}
