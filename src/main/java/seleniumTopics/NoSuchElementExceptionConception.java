package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class NoSuchElementExceptionConception {

	static WebDriver driver;
	public static void main(String[] args) {
		
		BrowserUtil brUtil=new BrowserUtil();
		driver=brUtil.launchBrowser("chrome");
		brUtil.enterURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By fgtPwd=By.linkText("Forgotten Password12");
		try {
			driver.findElement(fgtPwd).click(); //NoSuchElementException: no such element: Unable to locate element:
		}catch (NoSuchElementException e) {
			System.out.println("getting element exception...plz check your locator again");
			e.printStackTrace();
		}
		
		
		//In the above line  WebElement  or action is throwing the exception?--WebElement  by findElement method
		System.out.println(driver.getTitle()); //we won't get title because i above line we got error so it won't go further and check the code
		

	}

}
