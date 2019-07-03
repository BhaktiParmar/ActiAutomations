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

public class UserListpage extends DriverScript{
	
	//************************Element******************************************
	
	@FindBy(xpath="//div[contains(@class,'withPlusIcon')]") WebElement NewUserBtn;
	@FindBy(id="createUserPanel_firstNameField") WebElement firstNameTB;
	@FindBy(id="createUserPanel_lastNameField") WebElement lastNameTB;
	@FindBy(id="createUserPanel_emailField") WebElement EmailTB;
	
	
//	*********************Element initialization**********************************
	
	public UserListpage()
	{
		PageFactory.initElements(driver, this);
	}
	
//	**************************Actions**************************
	
	
	public void clickNewUserBtn()
	{
		JavaScriptHelper.highLightElement(NewUserBtn);
		NewUserBtn.click();
	}
	
	public void createNewUser( String FirstName,String Lastname,String Email)
	{
		JavaScriptHelper.highLightElement(firstNameTB);
		firstNameTB.sendKeys(FirstName);
		JavaScriptHelper.highLightElement(lastNameTB);
		lastNameTB.sendKeys(Lastname);
		JavaScriptHelper.highLightElement(EmailTB);
		EmailTB.sendKeys(Email);
		
	}
	
	

}
