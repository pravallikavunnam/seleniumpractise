package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DifferentLocators {

	static WebDriver driver;
	public static void main(String[] args) {
		
		BrowserUtil brUtil=new BrowserUtil();
		driver=brUtil.launchBrowser("chrome");
		brUtil.enterURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//there are 8 locators in Selenium
		//1. ID ---ID is attribute--ID will always be unique locator---it will be unique for webelements--if id is available --prefer ID--I Preference
	//	driver.findElement(By.id("input-firstname")).sendKeys("Pravallika");
		//2. Name ---name is attribute--name sometimes can be duplicate or sometimes unique --most of the cases name will be unique --II preference
		//------if ID and Name available --prefer ID
		//----------if multiple elements are found with same name then selenium will always consider the first element ie..top to bottom approach
	//	driver.findElement(By.name("lastname")).sendKeys("Vunnam");
		
		//3. ClassName :calss is attribute-- class can be duplicate and most of the time it is duplicate---III Preference
		//---because class means look and feel of that that particular element
		//---------classes are always space seperated in DOM--
		
	//	driver.findElement(By.className("form-control")).sendKeys("8332847364");
		//Selenium will give always --only 3 attributes based methods are available by.name,by.id ,by.class ---
		
		//4. Xpath(XML Path) :xpath is not an attribute---xpath is address of element in HTML DOM 
		//
		//	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("prava@gmail.com");
		
//		By fName=By.xpath("//*[@id=\"input-firstname\"]");
//		By lName=By.xpath("//*[@id=\"input-lastname\"]");
//		By pwd=By.xpath("//*[@id=\"input-password\"]");
//		By privacypolicy_checkbox=By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
//		By continue_button=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
//		
//		doSendKeys(fName, "Pravallika");
//		doSendKeys(lName, "vunnam");
//		doSendKeys(pwd, "1234567");
//		doClick(privacypolicy_checkbox);
//		doClick(continue_button);
		
		//If ID is available and xpath is available which one to prefer ----Always PREFER id becoz it will be unique
		
		//5. CSS Selector : CSS is not an attribute,it is like xpath ,,but it is not address of element.CSS is based on basis of CSS properties
		
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Pravallika");
//		driver.findElement(By.cssSelector("#input-telephone")).sendKeys("8332847364");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("12345678");
//		driver.findElement(By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)")).click();
//		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();
		
//		By first_Name=By.cssSelector("#input-firstname");
//		By telephone=By.cssSelector("#input-telephone");
//		By password=By.cssSelector("#input-password");
//		By privacy_checkbox=By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");
//		By continue_button=By.cssSelector("#content > form > div > div > input.btn.btn-primary");
//		
//		doSendKeys(first_Name, "Pravallika");
//		doSendKeys(telephone,"8332847364");
//		doSendKeys(password,"abcdef");
//		doClick(privacy_checkbox);
//		doClick(continue_button);
		
		
		//6. LinkText: Applicable only for links ...with the text of the links.
		//If the html tag is <a> then it is a link
		//with links we might have some attributes,text
		//we cannot use linktext for other attributes like Images ,buttons.....
		//Link text can be duplicate 
		
//		driver.findElement(By.linkText("Delivery Information")).click();
		
//		By deliveryInfo_link=By.linkText("Delivery Information");
//		doClick(deliveryInfo_link);
		
		//7. Partial Link text : only for links...with the partial text of the link
		//partial link text can be risky sometimes--suppose if we have same partial link text for two links 
	//	driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//8. TagName : HTML tag ...tag is not an attribute ,it is a an HTML tag
		//driver.findElement(By.tagName("input")).sendKeys("Pk");//ElementNotInteractable Exception---not better idea to use tagname as Input
		//Use tagname only when tagname is unique
		
		String header=driver.findElement(By.tagName("h1")).getText(); //getText method returns string
		System.out.println(header);
	}
	
	//we declared below methods as static because we can call them directly without creating object of class and call them
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator ,String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
}
