package seleniumTopics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWithFluentWaitFeatures {
		
		//WebDriver extends FW
		//In WebDriver no methods are available
		//only constructors are available
		
		//FW--Has constructors,overriden method ,individual methods
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
				
				By email=By.id("input-email");
				
				//WebDriver wait is child class of Fluentwait---we can access all methods of fluentwait by inheritance
				//
//				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//				wait
//					.pollingEvery(Duration.ofSeconds(2))
//						.ignoring(NoSuchElementException.class)
//							.withMessage("-----time out is done....ele is not found..."+email)
//								.until(ExpectedConditions.presenceOfElementLocated(email)).sendKeys("test@gmail.com");
//					
				
				//This is the implementation of WDW with FW features
				//FW is a concept --FW says why don't you apply polling time,
				//Total Timeout
				//if you really want to ignore any expections while searching or finding or waiting for an ele
				//withMessage also we can supply
				//if we don't want to use FW features we can use normal WDW also
				//
				//Explicit wait ---EW is explicitly applied for specific ele
				
				//EW is a parent class which has its own methods and overriden method until  from parent Wait Interface
				//WDW has no individual methods --it will inherit all the methods from FW Class
				
				waitForElementAndEnterValue(email, 10, 2, "test@gmail.com");
				
		}
		
		public static void waitForElementAndEnterValue(By locator,int timeOut,int pollingTime,String value) {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
			wait
				.pollingEvery(Duration.ofSeconds(pollingTime))
					.ignoring(NoSuchElementException.class)
						.withMessage("-----time out is done....ele is not found..."+locator)
							.until(ExpectedConditions.presenceOfElementLocated(locator))
								.sendKeys(value);
				
		}
		
		public static void waitForElementAndClick(By locator,int timeOut,int pollingTime) {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
			wait
				.pollingEvery(Duration.ofSeconds(pollingTime))
					.ignoring(NoSuchElementException.class)
						.withMessage("-----time out is done....ele is not found..."+locator)
							.until(ExpectedConditions.presenceOfElementLocated(locator))
								.click();
				
		}
		
		
		
		
		
		
		
		

}
