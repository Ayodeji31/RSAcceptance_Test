package step_Definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import modules.TestBase;
import pageObjects.BasketSummaryPage;
import pageObjects.DeliveryDetailsPage;
import pageObjects.SearchPage;

public class SeaCheckout extends TestBase {
	WebDriver driver = getDriver();
	
	@Then("^I proceed to checkout to purchase the product$")
	public void i_proceed_to_checkout_to_purchase_the_product() throws Throwable {
		SearchPage search = PageFactory.initElements(driver, SearchPage.class);
		search.clickRsProBattery();
		search.clickAdd_To_Basket();
		search.clickView_Basket();
		
		BasketSummaryPage basket = PageFactory.initElements(driver, BasketSummaryPage.class);
		basket.click_CheckoutSecure();
		basket.typeGuestEmail("tope201@yahoo.com");
		basket.clickGuestCheckoutButton();
		Thread.sleep(1000);
		
		DeliveryDetailsPage delivery = PageFactory.initElements(driver, DeliveryDetailsPage.class);
		delivery.selectTitle();
		delivery.typeFirstname("Temitop");
		delivery.typeLastname("Joseph");
		delivery.typeMobileNumber("07748987661");
		delivery.typeCompanyName("RS Properties");
		delivery.enterDeliveryAddress("31 Epsom road");
		delivery.enterTownAddress("Leicester");
		delivery.enterCounty();
		delivery.enterPostCode("LE4 5DB");
		delivery.clickContinuePayment();
	}

}
