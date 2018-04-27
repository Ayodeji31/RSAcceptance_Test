package modules;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	public WebDriver getDriver(){
		if(driver == null){
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");	
		driver = new ChromeDriver();	
	
		}
		return driver;
	}
	
	

	

//	//initializing the property file reading
//	public static Properties CONFIG=null;
//	public static WebDriver driver=null;
//	public int random;
//
//	public void initialize() throws IOException{
//		if(driver == null){
//
//			//config property file
//			CONFIG= new Properties();
//			FileInputStream fn =new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config\\config.properties");
//			System.out.println("aaaaaaaaaaaaaaaaaa");
//			//C:\Selenium\workspace\Maven\flamingo\src\main\java\config\config.properties
//			CONFIG.load(fn);
//			System.out.println("bbbbbbbb");
//
//
//			//Initialize the webdriver
//			if (CONFIG.getProperty("browser").equals("firefox")){
////				driver = new FirefoxDriver();
//
//			}else if(CONFIG.getProperty("browser").equals("IE")){
//				System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
//				driver = new InternetExplorerDriver();
//
//			}
//
//			else if(CONFIG.getProperty("browser").equals("chrome")){
//				System.out.println("ccccccc");
//				System.setProperty("Webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
//                System.out.println("ddddddd");
//                driver = new ChromeDriver();
//           
//
//			}
//
////			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		}
//	}
	
	
}

