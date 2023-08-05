package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait { 
	
		//this concept is also called as converting static wait to dynamic wait
		//that is converting static wait thread.sleep to dynamic wait without using selenium concepts
		//we can use Thread.sllep ad dynamic wait also as programmatically using break statmennt
	
		
		//Custom Wait: implement wait concept but without using any selenium wait
		//not allowed to use WDW ,FW,and IW
		//That concept is called as CW
		//CW---CW means we have to Wait for specific ele for few sec
		//we can use Thread.sleep but TS is a static wait
		//we have to create a custom dynamic wait just like WDW and FW
		//But we cannot use any selenium waits
		
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
				
				By email=By.id("input-email");
				
				
				retryingElement(email, 20,2000).sendKeys("test");
		}
		//create a function which will wait for particualr ele foe specific time if ele found then return WebElement
		
		//ele can be visible -after 1 sec, or may 2 sec or 8 sec
		//we don't have fixed num --how much time we have to wait for an ele
		//loop where iterations are not fixed or num of sec are not fixed
		
		
		public static WebElement getElement(By locator)  { 
		 return driver.findElement(locator);
		}
			
		
		public static WebElement retryingElement(By locator,int timeOut) {
			
			//default value of element is null ,this is non-primitive 
			//Non-primitive default value always is null 
			
			WebElement element=null;
			int attempts=0;
			while(attempts<timeOut) {  //0<20 ---condition is true and will come out of the loop when attempt--20<= to timeout 20 
				try 
				{
				element=getElement(locator);
				System.out.println("Ele is found ...."+locator + "in attempt " +attempts);
				break;
				}
				catch(NoSuchElementException e) 
				{
					System.out.println("Ele is not found ...."+locator + "in attempt " +attempts);
					try {
						Thread.sleep(500);
					}
					catch(InterruptedException e1) {
						e.printStackTrace();
					}
					
				}
				attempts++;
			}
			if(element==null) {
				
				System.out.println("Ele is not found ...tried for"+timeOut+"secs"+"with the interval of"+ 500 +" milli secs");
			}
			return element;
			
		}
		
		
		public static WebElement retryingElement(By locator,int timeOut,long pollingTime) {
			WebElement element=null;
			int attempts=0;
			while(attempts<timeOut) {  
				try 
				{
				element=getElement(locator);
				System.out.println("Ele is found ...."+locator + "in attempt " +attempts);
				break;
				}
				catch(NoSuchElementException e) 
				{
					System.out.println("Ele is not found ...."+locator + "in attempt " +attempts);
					try {
						Thread.sleep(pollingTime);
					}
					catch(InterruptedException e1) {
						e.printStackTrace();
					}
					
				}
				attempts++;
			}
			if(element==null) {
				System.out.println("Ele is not found ...tried for"+timeOut+"secs"+"with the interval of"+ pollingTime+" milli secs");
			}
			return element;
			
		}
		
}
