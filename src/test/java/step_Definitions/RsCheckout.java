package step_Definitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.TestBase;
import pageObjects.BasketSummaryPage;
import pageObjects.DeliveryDetailsPage;
import pageObjects.SearchPage;

public class RsCheckout extends TestBase{
	WebDriver driver = getDriver();
//	Alert alert = driver.switchTo().alert();
	@When("^I added product to basket$")
	public void i_added_product_to_basket() throws Throwable {
		SearchPage search = PageFactory.initElements(driver, SearchPage.class);
		search.clickAudioMixedCable();
		search.clickAdd_To_Basket();
		search.clickView_Basket();
		
//		alert.accept();
	}

	@Then("^I proceed to checkout$")
	public void i_proceed_to_checkout() throws Throwable {
		BasketSummaryPage basket = PageFactory.initElements(driver, BasketSummaryPage.class);
		basket.click_CheckoutSecure();
		basket.typeGuestEmail("ayodeji102@hotmail.com");
		basket.clickGuestCheckoutButton();
//		alert.accept();
		Thread.sleep(1000);
		
		DeliveryDetailsPage delivery = PageFactory.initElements(driver, DeliveryDetailsPage.class);
		delivery.selectTitle();
		delivery.typeFirstname("Ayodeji");
		delivery.typeLastname("Joseph");
		delivery.typeMobileNumber("07688987661");
		delivery.typeCompanyName("RS Computers");
		delivery.enterDeliveryAddress("31 Epsom road");
		delivery.enterTownAddress("Leicester");
		delivery.enterCounty();
		delivery.enterPostCode("LE4 5DB");
		delivery.clickContinuePayment();
	}
	

}
