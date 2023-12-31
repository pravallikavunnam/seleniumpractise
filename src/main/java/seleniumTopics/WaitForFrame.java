package seleniumTopics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrame {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://classic.crmpro.com/");
			Thread.sleep(4000);
			
			driver.findElement(By.name("username")).sendKeys("newautomation");
			driver.findElement(By.name("password")).sendKeys("Selenium@12345");
			driver.findElement(By.xpath("//input[@value='Login']")).click();
		
			By frameLocator = By.name("mainpanel");
//			
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
//			driver.findElement(By.linkText("CONTACTS")).click();
			
			
			
			waitForFrameByLocator(frameLocator, 10);
			driver.findElement(By.linkText("CONTACTS")).click();
	}
	
	
	public static void waitForFrameByLocator(By frameLocator,int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
		
	}
	
	public static void waitForFrameByIndex(int frameIndex,int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
		
	}
	
	public static void waitForFrameByFrameNameOrID(String frameNameorID,int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameNameorID));
		
	}
	
	public static void waitForFrameByFrameElement(WebElement frameElement,int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
		
	}
	
	
	
	
	
	
	
	

}
