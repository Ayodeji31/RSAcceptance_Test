package step_Definitions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.TestBase;
import pageObjects.Homepage;
import pageObjects.DeliveryDetailsPage;
import pageObjects.SearchPage;

public class RsSearch extends TestBase{
	
	WebDriver driver = getDriver();
	
	
	@Given("^Am on the home page$")
	public void am_on_the_home_page() throws Throwable {
	driver.navigate().to("https://uk.rs-online.com/web/");    
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	
	@When("^customer search for an item$")
	public void customer_search_for_an_item() throws Throwable {
		Homepage home = PageFactory.initElements(driver,Homepage.class);
		home.type_searchField("Lead Acid Battery");
		home.click_searchButton();
		
	}

	@Then("^search result is displayed to customer$")
	public void search_result_is_displayed_to_customer() throws Throwable {
		Homepage home = PageFactory.initElements(driver,Homepage.class);
		home.searchResultDisplayed();
	    
	}

}
