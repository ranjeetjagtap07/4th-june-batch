package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass 
{
//	//1. 
//	1.webelement declare
	
	private WebDriver driver;
	
//	2. Find element
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
//	3. perform action of element
		
	public void sendUserName()
	{
		username.sendKeys("standard_user");
	}
	
//	// 2. password
	@FindBy(xpath = "//input[@id='password']" )
	private WebElement password;
	
	
	public  void sendPassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	
//	//3.login button
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginButton;
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	
//	//4. create constructor
	
	public LoginPOMClass(WebDriver driver)
	{
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}
	

	
	
	

}
