package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BasketSummaryPage {
	
	@FindBy(how=How.ID, using= "checkoutSecurelyAndPuchBtn")
	public static WebElement Checkout_Securely_Button;
	
	@FindBy(how=How.NAME, using="guestCheckoutForm:GuestWidgetAction_emailAddress_decorate:GuestWidgetAction_emailAddress")
	public static WebElement Guest_Checkout_Form;
	
	@FindBy(how=How.ID, using= "guestCheckoutForm:guestCheckout")
	public static WebElement Guest_Checkout_Button;
	
	
	
	
	public void click_CheckoutSecure(){
		Checkout_Securely_Button.click();
	}

	public void typeGuestEmail(String guest){
		Guest_Checkout_Form.sendKeys(guest);
	}
	
	public void clickGuestCheckoutButton(){
		Guest_Checkout_Button.click();
	}
	

}
