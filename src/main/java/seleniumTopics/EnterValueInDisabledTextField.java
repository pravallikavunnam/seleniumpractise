package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterValueInDisabledTextField {

	static WebDriver driver;
	public static void main(String[] args) {
		
		BrowserUtil brUtil=new BrowserUtil();
		driver=brUtil.launchBrowser("chrome");
		brUtil.enterURL("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		By disabled_pwd=By.id("pass");
		//on the disabled field we cannot enter the values --if we try we get exception
	//	driver.findElement(disabled_pwd).sendKeys("abcd"); //ElementNotInteractableException: element not interactable
		
		boolean flag=driver.findElement(disabled_pwd).isEnabled(); //false---element is not enabled
		System.out.println(flag);
		
		boolean flag1=driver.findElement(disabled_pwd).isDisplayed(); //true ---element is displayed
		System.out.println(flag1);
		
		String disabledAtt_val=driver.findElement(disabled_pwd).getAttribute("disabled"); //disabled property is true
		System.out.println(disabledAtt_val);
	}
	
	public static boolean checkElementIsDisabled(By locator) {
		String disabledValue=getElement(locator).getAttribute("disabled");
		if(disabledValue.equals("true"))
		{
			return true;
		}
		return false;
	}
	
	public static WebElement getElement(By locator) { 
		return driver.findElement(locator);
	}
	

}
