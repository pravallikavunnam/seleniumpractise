package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodChainingRegister {

	static WebDriver driver;
	public static void main(String[] args) {
		
		//go to register page --enter firstname by locating element and for rest other fields not using of respective locators

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			
			WebElement fname=driver.findElement(By.id("input-firstname"));	
			Actions act=new Actions(driver);
			act.sendKeys(fname, "pravallika").
			sendKeys(Keys.TAB).
			pause(1000).
			sendKeys("Chowdary").
			pause(1000).
			sendKeys(Keys.TAB).
			pause(1000).
			sendKeys("pravallika.pras@gmail.com").
			pause(1000).
			sendKeys(Keys.TAB).
			pause(1000).
			sendKeys("8332847364").
			pause(1000).
			sendKeys(Keys.TAB).
			pause(1000).
			sendKeys("123456").
			sendKeys(Keys.TAB).
			pause(1000).
			sendKeys("123456").
			pause(1000).
			sendKeys(Keys.TAB).
			pause(1000).
			sendKeys(Keys.TAB).
			pause(1000).
			sendKeys(Keys.TAB).
			pause(1000).
			sendKeys(Keys.TAB).
			pause(1000).
			sendKeys(Keys.ENTER).
			click().
			pause(1000).
			sendKeys(Keys.TAB).
			pause(1000).
			click().build().perform();
		
		
		
	}

}
