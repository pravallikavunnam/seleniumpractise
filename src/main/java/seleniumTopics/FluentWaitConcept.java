package seleniumTopics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {

		//FW is a class which is a child of Wait Interface method 
		//In wait Interface we have until method without any method body which is overriden by FW Class
		//WebDriverWait class---having FW as a parent class
		//FW can have individual methods also
		//FW is also a type EW but with some fluent features
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
				
				By email=By.id("input-email");
				
				//creating top casting ---child class object (new FluentWait();)referred by parent interface ref variable(wait)
				
				//tyoe <T> we need to pass --<T> The input type for each condition used with this instance.
				//FW SAYS--Whenever you have to create constructor you have to give me the input 
				//@param input--- The input value to pass to the evaluated conditions.
				//this input will be used to use the condition -- so we need a driver here ,,drive of Webdriver refernce
				//R.H.S is object of FW Class
				//generic name--WeDriver
				//argument in the constructor we are passing --driver
				//concept--top casting
				
//				Wait<WebDriver> wait=new FluentWait<WebDriver>(driver) 	//supplying driver ref value
						//accessing all methods of FW
						//Pattern---it is a kind of Builder Pattern
						//withTimeOut ,pollingevery,ignoring,withMessage these are individual methods of FW Class
						//which cannot be accessed with parent class ref var
						//In builder pattern we can write methods in any sequence
//											.withTimeout(Duration.ofSeconds(10))   //wait time //method returns this keyword which is current class object
//											.pollingEvery(Duration.ofSeconds(2))   //polling time
//											.ignoring(NoSuchElementException.class)   //ignoring exp while doing polling mechanism with total timeout
//											.ignoring(StaleElementReferenceException.class)
//											.withMessage("----timeout is done...element is not found" + email);//if ele not found then providing custom message
//											//method returns this keyword which is current class object
//				//can we access until method with top casting
//				wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys("test");
				
				waitForElementVisibleWithFluentWait(email, 10, 1).sendKeys("test");//10 attempts will be performed as polling time is 1
				
				
			}
		
			
		public static WebElement waitForElementVisibleWithFluentWait(By locator,int timeOut,int pollingTime) {
			
			Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(timeOut))   //wait time //method returns this keyword which is current class object
					.pollingEvery(Duration.ofSeconds(pollingTime))   //polling time
					.ignoring(NoSuchElementException.class)   //ignoring exp while doing polling mechanism with total timeout
					.ignoring(StaleElementReferenceException.class)
					.withMessage("----timeout is done...element is not found" + locator);
			
			return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}
		
		public static WebElement waitForElementPresenceWithFluentWait(By locator,int timeOut,int pollingTime) {
			
			Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(timeOut))   //wait time //method returns this keyword which is current class object
					.pollingEvery(Duration.ofSeconds(pollingTime))   //polling time
					.ignoring(NoSuchElementException.class)   //ignoring exp while doing polling mechanism with total timeout
					.ignoring(StaleElementReferenceException.class)
					.withMessage("----timeout is done...element is not found" + locator);
			
			return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
		
		public static Alert waitForJSAlertWithFluentWait(int timeOut,int pollingTime) {
			Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(timeOut))   //wait time //method returns this keyword which is current class object
					.pollingEvery(Duration.ofSeconds(pollingTime))   //polling time
					.ignoring(NoAlertPresentException.class)   //ignoring exp while doing polling mechanism with total timeout
					.ignoring(StaleElementReferenceException.class)
					.withMessage("----timeout is done...element is not found" );
			return wait.until(ExpectedConditions.alertIsPresent());
			
		}
		
		public static void waitForFrameWithFluentWait(String frameNameOrID,int timeOut,int pollingTime) {
			Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(timeOut))   //wait time //method returns this keyword which is current class object
					.pollingEvery(Duration.ofSeconds(pollingTime))   //polling time
					.ignoring(NoSuchFrameException.class)   //ignoring exp while doing polling mechanism with total timeout
					.ignoring(StaleElementReferenceException.class)
					.withMessage("----timeout is done...element is not found" );
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameNameOrID));
			
		}
		

}
