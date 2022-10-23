package com.SauceDemo.POMClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMClass 
{
//	1. 
	private WebDriver driver;
	private Select s;
	private Actions act;
	
	
//	2.
	@FindBy(xpath = "//button[@id=\"react-burger-menu-btn\"]")
	WebElement menuButton;
	
	public void clickMenuButton()
	{
		menuButton.click();
	}
	
//	3.
	@FindBy(xpath = "//a[@id=\"logout_sidebar_link\"]")
	private WebElement logoutButton;
	
	public void clickLogoutButton()
	{
		logoutButton.click();
	}
	
//	4.
	
	public HomePOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
//		s = new Select(dropDown);
		act = new Actions(driver);
		
	}
	
//	bag ele
	@FindBy(xpath = "//button[@id=\"add-to-cart-sauce-labs-backpack\"]")
	private WebElement bagButton;
	
//	public void clickBagButton()
//	{
//		bagButton.click();
//	}
	
	public void clickBagButton()
	{
		act.click(bagButton).perform();
	}

	
	
//	add to cart
	@FindBy(xpath="//a[@class=\"shopping_cart_link\"]")
	private WebElement addToCart;
	
	public String getTextFromAddToCart() 
	{
		String totalProducts = addToCart.getText();
		return totalProducts;
	}
	
//	multiple ele
	
	@FindBy(xpath = "//button[text()=\"Add to cart\"]")
	private List<WebElement>allProducts;
	
	public void clickAllProducts()
	{
		for(int i = 0;i<allProducts.size();i++)
		{
			allProducts.get(i).click();
		}
		for(WebElement i: allProducts)
		{
			i.click();
		}
		
//		dropdown ele
		
//		@FindBy(xpath = "//select[@class='product_sort_container']") 
//		private WebElement dropDown;
//		
//		public void clickDropDownFilter()
//		{
//			dropDown.click();
////			Select s = new Select(dropDown);
//			s.selectByValue("lohi");	
//		}
		
		
		
		
		
	}
	
	
	

}
