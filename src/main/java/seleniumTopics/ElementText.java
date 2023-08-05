package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementText {

	static WebDriver driver; //we declare driver at class level as static because we can use it through out the class
	public static void main(String[] args) {
		
		BrowserUtil brUtil=new BrowserUtil();
		driver=brUtil.launchBrowser("chrome");
		brUtil.enterURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By header=By.tagName("h1");
		By forgot_password=By.linkText("Forgotten Password");
		
//		
//		System.out.println(doElementGetText(header));
//		System.out.println(doElementGetText(forgot_password));
		
		
//		boolean flag=driver.findElement(header).isDisplayed();
//		System.out.println(flag);
		
		if(checkElementIsDisplayed(header)) {
			System.out.println("header is displayed");
			String tagNameText=doElementGetText(header);
			if(tagNameText.equals("Register Account"))
			{
				System.out.println("tagName is Register Account---Pass");
			}else
			{
				System.out.println("tagName is Not Register Account---Fail");
			}
		}
		
		
	}
	
	public static String doElementGetText(By locator) {
		String eleText=getElement(locator).getText();
		System.out.println("element text is ----->" +eleText);
		return eleText;
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static boolean checkElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	//these utilities i can call this utilities in my caller methods for validations
}
