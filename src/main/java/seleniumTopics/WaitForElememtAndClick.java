package seleniumTopics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElememtAndClick {
	
	//Clickable Elements : checkbox,links,button,elements 
	//Selenium doesn't provide any autowait mechanism
	//user should supply required timeOut 

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://classic.crmpro.com/");
			Thread.sleep(4000);
			

			driver.findElement(By.name("username")).sendKeys("newautomation");
			driver.findElement(By.name("password")).sendKeys("Selenium@12345");
			
			By loginLoc = By.xpath("//input[@value='Login']");
			
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait.until(ExpectedConditions.elementToBeClickable(loginLoc)).click();
			//not only checking ele is present on page but also for enabled element
			//this utility is for those ele which are clickable(visible) and enabled also
			//
			
			clickElementWhenReady(loginLoc, 10);
	}
	
	public static void clickElementWhenReady(By locator,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
		
	}	
		
	
	}

