package RobertStepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.robert.pageobjectModel.AmazonSearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonSearch {
	WebDriver driver;
	
	@Given("^user visit amazon homepage$")
	public void user_visit_amazon_homepage() throws Throwable {
		AmazonSearchPOM obj= new AmazonSearchPOM(driver);
		// How to open the browser 
				System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chrome.exe");
				driver = new ChromeDriver();
				
				// How to open URL
				driver.get("https://nexteticket.com/");
	    
	}

	@When("^user type \"([^\"]*)\" and click search icon$")
	public void user_type_and_click_search_icon(String productname) throws Throwable {
		AmazonSearchPOM obj= new AmazonSearchPOM(driver);
		Thread.sleep(5000);// Manual wait
	   obj.Amazonsearch().sendKeys(productname);
	   obj.tom().click();
	}

	@Then("^User should able to see the expected product$")
	public void user_should_able_to_see_the_expected_product() throws Throwable {
		AmazonSearchPOM obj= new AmazonSearchPOM(driver);
		Thread.sleep(5000);// Manual wait
		driver.close();
	   
	}
	@Then("^Verify Buy Ticket button Dispaly in Home page$")
	public void verify_Buy_Ticket_button_Dispaly_in_Home_page() throws Throwable {
		AmazonSearchPOM obj= new AmazonSearchPOM(driver);
		obj.buybutton().click();
	}


}
