package com.robert.pageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearchPOM {
	WebDriver driver;
	
	public  AmazonSearchPOM (WebDriver driver) {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		   }
	
	@FindBy(name="field-keywords")
	 
	
	WebElement Type_amazonsearch;
	
	public WebElement Amazonsearch(){
		return Type_amazonsearch;
		
		
		
	
  // Java rulls is if your method is non static, You have to create a object of the class
		// Java rulls is if your method is static, You do not have to create a object of the classq, We will call method by class name
		
	
	
	}
	@FindBy(id ="nav-search-submit-button")
	WebElement SearchButton;
	
	@FindBy(xpath  ="//a[@class=\"elementor-button elementor-button-link elementor-size-md\"][1]")
	WebElement BuyButton;
	
	public WebElement tom() {
		
		return SearchButton;
	}
public WebElement buybutton() {
		
		return BuyButton;
	}
	
	
}

// Constructor name should as class name