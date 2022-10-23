package com.SauceDemo.testClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClass.LoginPOMClass;
import com.SauceDemo.UtilityClass.ScreenshotClass;

public class TestBaseClass 
{
	public WebDriver driver;
	Logger log = Logger.getLogger("SauceDemoMaven") ;
	
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",
				"./DriverFiles\\chromedriver.exe");
		 driver =  new ChromeDriver();
		}
		else
		{
		System.setProperty("webdriver.gecko.driver",
				"./DriverFiles\\geckodriver.exe");		
		driver =  new FirefoxDriver();
		}
		
		PropertyConfigurator.configure("Log4j.properties");
		
		
		log.info("browser is opened");
		
		driver.manage().window().maximize();

		log.info("browser is maximized");
		
		driver.get("https://www.saucedemo.com/");

		log.info("Sauce demo url is opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		take screenshot
		
		ScreenshotClass.screenshot(driver);
		//loginPage elements find +action perform
		
				LoginPOMClass x= new LoginPOMClass(driver);
				
				x.sendUserName();
				log.info("username is entered");

				x.sendPassword();
				log.info("password is entered");

				
				x.clickOnLoginButton();
				log.info("clicked on login button");

				ScreenshotClass.screenshot(driver);
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		log.info("browser is closed");

		log.info("end of program");

	}

}
