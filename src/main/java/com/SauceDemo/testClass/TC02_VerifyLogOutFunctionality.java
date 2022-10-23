package com.SauceDemo.testClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass.HomePOMClass;
import com.SauceDemo.UtilityClass.ScreenshotClass;

public class TC02_VerifyLogOutFunctionality extends TestBaseClass
{
	
	@Test
	public  void verifyLogOutFunctionality() throws IOException 
	{
//		home page
		
		HomePOMClass y = new HomePOMClass(driver);
		
		y.clickMenuButton();
		y.clickLogoutButton();
		
		ScreenshotClass.screenshot(driver);

//		// Home page validation
		log.info("apply the validation");

		String expectedTitle = "Swag Labs";
		
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		

	}
	
}
