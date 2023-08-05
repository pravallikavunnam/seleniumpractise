package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysAndClick {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By username=By.id("input-email");
		By password=By.id("input-password");
		By login=By.xpath("//input[@type='submit']");
		Actions act=new Actions(driver);
		act.sendKeys(driver.findElement(username), "test@gmail.com").perform(); //we are using actions.sendKeys to enter data
		act.sendKeys(driver.findElement(password), "123456").perform();
		act.click(driver.findElement(login)).perform();
		
		//difference between normal sendKeys and Action class sendKeys
		//----act.sendkeys---first will go to act.click element and then enter the value
			//-----go to element click on it and then enter value
			//performance will be slightly less when compared to normal click
		//--normal sendkeys--- it will directly starts entering the values without click
		//
		
		//Equivalent to calling: Actions.click(element).sendKeys(keysToSend).
		//This method is different from WebElement.sendKeys(CharSequence) - see sendKeys(CharSequence) for details how.
		
		
	//act.click says---clicks in the middle of the given element ,internally it will move to specific element 
	//and click on it then it will click on it--selenium will take of this when we are using Action class
		
		
		
		
	//when to use act.sendKeys and normal sendKeys
		//we go for act.sendKeys in cases like  any element getting overlapped with other element when we gt interact with element
		
		
		//How many ways of clicking on element
		//two ways
		//1. WebElement.click (Normal click)
		//2. Actions class .click
		//later on we will see JavaScript.click
}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static void doActionsClick(By locator) {
		Actions act=new Actions(driver);
		act.moveToElement(getElement(locator)).perform();
		
	}
	
	public static void doActionsSendKeys(By locator,String value) {
		Actions act=new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}