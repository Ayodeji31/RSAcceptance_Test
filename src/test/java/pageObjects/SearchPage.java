package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPage extends MyBaseClass{
	
	public SearchPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(how=How.LINK_TEXT, using= "5m Audio Video Mixed Cable Assembly Male NP2X")
	public static WebElement Audio_mixed_cable;
	
	@FindBy(how=How.XPATH, using= "//*[@id='pagecell']/div/div[1]/div[1]/h1y")
	public static WebElement Audio_mixed_cable_Assembly;
	
	@FindBy(how=How.CSS, using= "#price-break-container > div > div.addToCartRTQContainer > div > div.add-to-basket-container > div > button")
	public static WebElement AddToBasket_Button;
	
	@FindBy(how=How.CSS, using= "#price-break-container > div > div.addToCartRTQContainer > div > div.cart-added.page-cart-added > button")
	public static WebElement ViewBasket_Button;
	
	@FindBy(how=How.LINK_TEXT, using= "RS Pro RS3.2-12 12V Lead Acid Battery, 3.2Ah")
	public static WebElement RS_Pro_LeadBattery;


	

	
	 public void clickAudioMixedCable(){
		 Audio_mixed_cable.click();	 
	 }
	 
	 public void checkAudioMixedCable(){
		 Audio_mixed_cable_Assembly.isDisplayed();	 
	 }
	 
	 public void clickAdd_To_Basket(){
		 AddToBasket_Button.click();	 
	 }
	 
	 public void clickView_Basket(){
		 ViewBasket_Button.click();	 
	 }
	 
	 public void clickRsProBattery(){
		 RS_Pro_LeadBattery.click();	 
	 }

	
}