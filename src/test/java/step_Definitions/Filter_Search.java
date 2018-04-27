package step_Definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.TestBase;
import pageObjects.BasketSummaryPage;
import pageObjects.Homepage;
import pageObjects.SearchPage;


public class Filter_Search extends TestBase{
	
	WebDriver driver = getDriver();
	

	@When("^I navigate to the product$")
	public void i_navigate_to_the_product() throws Throwable {
		Homepage home = PageFactory.initElements(driver,Homepage.class);
		home.clickAllProduct();
		home.MoveCursorcablesAndWires();
		home.clickAudioVideoCable();
	}

	@Then("^Search is displayed$")
	public void search_is_displayed() throws Throwable {
		SearchPage search = PageFactory.initElements(driver, SearchPage.class);
		search.clickAudioMixedCable();
	}
	

}
