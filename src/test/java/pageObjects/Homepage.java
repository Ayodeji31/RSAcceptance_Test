package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage extends MyBaseClass{
	
	public Homepage(WebDriver driver){
		super(driver);
	}

	
	@FindBy(how=How.ID, using= "searchTerm")
	public static WebElement Search_Field;
	
	@FindBy(how=How.ID, using= "btnSearch")
	public static WebElement Search_button;
	
	@FindBy(how=How.LINK_TEXT, using= "All Products")
	public static WebElement Search_Links;
	
	@FindBy(how=How.XPATH, using= "/html/body/div[2]/div/ul/li[1]/ul/li[11]/a")
	public static WebElement Cables_Wires;
	
	@FindBy(how=How.LINK_TEXT, using= "Audio Video Cable")
	public static WebElement audio_video_cables;
	
	@FindBy(how=How.XPATH, using= "//*[@id='pagecell']/section/div[1]/div/h1")
	public static WebElement Search_Result;
	
	


	public void type_searchField(String search){
		Search_Field.sendKeys(search);
	}
	
    public void click_searchButton(){
    	Search_button.click();
    }

    public void clickAllProduct(){
    	Search_Links.click();
    }
    
    public void MoveCursorcablesAndWires(){
    	WebElement Cables = driver.findElement(By.linkText("Cables & Wires"));
		Actions action = new Actions(driver);
		action.moveToElement(Cables).build().perform();
//    	Cables_Wires.click();
    }
    
    public void clickAudioVideoCable(){
    	audio_video_cables.click();
    }
    
    public void searchResultDisplayed(){
    	Search_Result.isDisplayed();
    }
    
    
    


     

    }