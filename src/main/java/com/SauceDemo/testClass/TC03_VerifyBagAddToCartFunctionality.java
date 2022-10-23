package com.SauceDemo.testClass;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass.HomePOMClass;
import com.SauceDemo.UtilityClass.ScreenshotClass;

public class TC03_VerifyBagAddToCartFunctionality extends TestBaseClass
{
	@Test
	public  void VerifyBagAddToCartFunctionality() throws IOException 
	{

//		home page
		
		HomePOMClass hp= new HomePOMClass(driver);
		
		hp.clickBagButton();
		log.info("Bag product will get selected");
		
		ScreenshotClass.screenshot(driver);

//		validation
		
		String ExpectedProduct = "1";
		
		String ActualProduct = hp.getTextFromAddToCart();
		
		System.out.println("Actual Product = " + ActualProduct);
		
		log.info("validation");
		
		Assert.assertEquals(ActualProduct, ExpectedProduct);


		
	}
}
