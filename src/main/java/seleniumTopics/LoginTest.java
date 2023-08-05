package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

//	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	
		
		BrowserUtil brUtil=new BrowserUtil(); //creating of object of BrowserUtil class for launch browser
		WebDriver driver=brUtil.launchBrowser("chrome"); //we call launchbrowser mathod and supply browser name
		//as driver was limited to BrowserUtil class only 
		//so we go to launchbrowser method where it says you give me browser in the string value we will supply you the driver
		//so once launchbrowser method is done we return driver so w return type will be changed to WebDriver 
		//whatever launch browser method is returning so we store the webdriver reference variable 
		brUtil.enterURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login"); //enter url
		
		System.out.println(brUtil.getPageTitle());
		
		By email=By.id("input-email"); 
		By pwd=By.id("input-password");
		
		ElementUtil eleUtil=new ElementUtil(driver); //create object of ElementUtil class to enter username and password
			//but here ElementUtil method asks for driver to pass so we get it from Luanchbrowser method return 
		eleUtil.doSendKeys(email, "testseleniumajava");
		eleUtil.doSendKeys(pwd, "1234");
		
		
		brUtil.closeBrowser();

	}

}
