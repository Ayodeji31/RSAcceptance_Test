package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class DeliveryDetailsPage extends MyBaseClass{
	public DeliveryDetailsPage(WebDriver driver){
		super(driver);
	}

	
	@FindBy(how=How.XPATH, using= "//*[@id='deliveryCollectionForm:CustomerContactDetailsWidgetAction_title_decorate']/span/select")
	public static WebElement Title_Drop;
	
	@FindBy(how=How.ID, using= "deliveryCollectionForm:CustomerContactDetailsWidgetAction_firstName_decorate:CustomerContactDetailsWidgetAction_firstName")
	public static WebElement First_Name;
	
	@FindBy(how=How.ID, using="deliveryCollectionForm:CustomerContactDetailsWidgetAction_surName_decorate:CustomerContactDetailsWidgetAction_surName")
	public static WebElement Last_Surname;
	
	@FindBy(how=How.ID, using= "deliveryCollectionForm:CustomerContactDetailsWidgetAction_contactNumber_decorate:CustomerContactDetailsWidgetAction_contactNumber")
	public static WebElement Mobile_Number;
	
	@FindBy(how=How.NAME, using= "deliveryCollectionForm:GuestDeliveryAddressWidgetAction_companyNameOne_decorate:GuestDeliveryAddressWidgetAction_companyNameOne")
	public static WebElement CompanyName;
	
	@FindBy(how=How.XPATH, using= "//*[@id='deliveryCollectionForm:GuestDeliveryAddressWidgetAction_addressLineOne_decorate:GuestDeliveryAddressWidgetAction_addressLineOne']")
	public static WebElement Delivery_Address;
	
	@FindBy(how=How.CSS, using= "#deliveryCollectionForm\3a GuestDeliveryAddressWidgetAction_addressLineThree_decorate\3a GuestDeliveryAddressWidgetAction_addressLineThree")
	public static WebElement Towny_Address;
	
	@FindBy(how=How.NAME, using= "deliveryCollectionForm:GuestDeliveryAddressWidgetAction_selectedRegion_decorate:selectedRegion")
	public static WebElement County_Of;
	
	@FindBy(how=How.ID, using= "deliveryCollectionForm:GuestDeliveryAddressWidgetAction_postCode_decorate:GuestDeliveryAddressWidgetAction_postCode")
	public static WebElement Post_Code_Field;
	
	@FindBy(how=How.ID, using= "checkoutSecurelyBtn")
	public static WebElement Continue_To_Payment;
	
	
	
	
	
	
	
	public void selectTitle(){	
//		Title_Drop.sendKeys("Mr");
		Select title = new Select(Title_Drop);
		title.selectByVisibleText("Mr.");
	}
	
	public void typeFirstname(String first){	
		First_Name.sendKeys(first);		
	}
	
	public void typeLastname(String Last){	
		Last_Surname.sendKeys(Last);		
	}
	
	public void typeMobileNumber (String mobile){	
		Mobile_Number.sendKeys(mobile);		
	}
	
	public void typeCompanyName(String comp){	
		CompanyName.sendKeys(comp);		
	}
	
	public void enterDeliveryAddress(String Addere){	
		Delivery_Address.sendKeys(Addere);		
	}
	
	public void enterTownAddress(String borough){	
		Towny_Address.sendKeys(borough);		
	}
	
	public void enterCounty(){
		Select title = new Select(County_Of);
		title.selectByVisibleText("Leicestershire");
	}
	
	public void enterPostCode(String post){	
		Post_Code_Field.sendKeys(post);		
	}
	
	public void clickContinuePayment(){	
		Continue_To_Payment.click();		
	}
	
	
}


