package com.SauceDemo.testClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass.HomePOMClass;
import com.SauceDemo.UtilityClass.ScreenshotClass;

public class TC04_VerifyAllProductFunctionality extends TestBaseClass
{
	@Test
	public  void verifyAllProductFunctionality() throws IOException 
	{
//		home page
		
		HomePOMClass hp= new HomePOMClass(driver);
		
		hp.clickAllProducts();
		log.info("All product will get selected");
		
		ScreenshotClass.screenshot(driver);

//		validation
		
		String ExpectedProduct = "6";
		
		String ActualProduct = hp.getTextFromAddToCart();
		
		log.info("Actual Product = " + ActualProduct);
		
		log.info("validation");
		
		Assert.assertEquals(ActualProduct, ExpectedProduct);
		
		ScreenshotClass.screenshot(driver);

	}
	

}
