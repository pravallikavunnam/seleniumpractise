package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetTextFieldValue {

	static WebDriver driver;
	
	public static void main(String[] args) {
		BrowserUtil brUtil=new BrowserUtil();
		driver=brUtil.launchBrowser("chrome");
		brUtil.enterURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		By forgot_password=By.linkText("Forgotten Password");	
//		By logoImage=By.className("img-responsive");
		
		By firstName=By.id("input-firstname");
		//if we want to capture the text from the field which we entered by using sendkeys ---use getAttribute method using attribute value 
		driver.findElement(firstName).sendKeys("testautomation");
	//	String fn_value=driver.findElement(firstName).getText();---not use getText method to fetch the value which entered by uisng sendkeys
	//	System.out.println(fn_value);

		String fn_value=driver.findElement(firstName).getAttribute("value"); //applicable for text fields
		System.out.println(fn_value);
	}

}
