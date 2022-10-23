package com.SauceDemo.testClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.UtilityClass.ScreenshotClass;

public class TC01_VerifyLoginFunctionality extends TestBaseClass
{
	
	
	@Test
	public  void verifyLoginFunctionality() throws IOException 
	{
		ScreenshotClass.screenshot(driver);

		
//		// Home page validation
		log.info("apply the validation");

		String expectedTitle = "Swag Labs";
		
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
		
		ScreenshotClass.screenshot(driver);

	}
		
		
		
	

}
