package seleniumTopics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PollingWaitConcept {
	//for Explicit wait we can apply polling mechanism
	//Polling : keep on trying ele is present on the page or not
	//polling time/Interval time --Interval between two request--sending back to back req to browser--
	//difference between two requests is polling time
	
	//0 sec--e1--Not Available
	//2 sec--e1--NA
	//4 sec--e1--NA
	//6 sec---e1--NA
	
	//total time-10 sec--when we write EW--Selenium check on 0 sec-ele not available
	//then don't try immediately---again try for ele visible on page after 2 sec
	//then after 2 sec also not avail---then third attempt performed after 2 sec to check for ele
	//-----------total attempts will be 5 ---0 ,2,4,6,8
	//Polling time is 2 sec

	//default polling time /Interval time in selenium is 500MS,0.5Sec,
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			
			By email=By.id("input-email");
			
			//defining webdriver wait with polling time
			//we can override req polling time with default polling time
			
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2)); //we have to write duration class
			//two constructors are available for the WebDriver Wait
					//1. (WebDriver driver, Duration timeout)
					//2. (WebDriver driver, Duration timeout,Duration Sleep)
			//5 attempts it will perform if polling time is 2 sec
		
			wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys("test");
		

	}

}
