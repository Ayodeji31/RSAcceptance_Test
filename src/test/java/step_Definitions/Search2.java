package step_Definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.TestBase;
import pageObjects.Homepage;


public class Search2 extends TestBase{
	WebDriver driver = getDriver();

	
	@When("^customer search for an \"([^\"]*)\"item$")
	public void customer_search_for_an_item(String item) throws Throwable {
		Homepage home = PageFactory.initElements(driver,Homepage.class);
		home.type_searchField(item);
		home.click_searchButton();
	}



}
