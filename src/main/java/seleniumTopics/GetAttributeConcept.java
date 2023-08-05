package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetAttributeConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		BrowserUtil brUtil=new BrowserUtil();
		driver=brUtil.launchBrowser("chrome");
		brUtil.enterURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		
//		By forgot_password=By.linkText("Forgotten Password");	
//		By firstName=By.id("input-firstname");
		By logoImage=By.className("img-responsive");
		
//		String forgotpwd_href=driver.findElement(forgot_password).getAttribute("href");//getAttribute method return string
//		System.out.println(forgotpwd_href);
		
		//to check placeholder text and all we can use getAttribute method
		
//		String fn_placeholder_val=driver.findElement(firstName).getAttribute("placeholder");
//		System.out.println(fn_placeholder_val);
//		
//		WebElement logo_ele=driver.findElement(logoImage);
//		String srcValue=logo_ele.getAttribute("src");
//		String titleValue=logo_ele.getAttribute("title");
//		String altValue=logo_ele.getAttribute("alt");
//		
//		System.out.println(srcValue);
//		System.out.println(titleValue);
//		System.out.println(altValue);
		
		String srcValue=getElementAttribute(logoImage, "src");
		String titleValue=getElementAttribute(logoImage, "title");
		String altValue=getElementAttribute(logoImage, "alt");
		System.out.println(srcValue);
		System.out.println(titleValue);
		System.out.println(srcValue);
		
		
	}
		public static String getElementAttribute(By locator,String attributeName) {
			return getElement(locator).getAttribute(attributeName);
		
		}
		
		public static WebElement getElement(By locator) { 
			return driver.findElement(locator);
		}
}
