package seleniumTopics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleTogether {
	//when we click on the all the windows at a time 
	//like 4 child windows and 1 parent window
	//form parent to child and then to child2 to child3 to child4 to parent 
	//at the end we need to come to parent window

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(3000);
			
			String parentWindowID=driver.getWindowHandle();
			
			WebElement twitterElement=driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
			WebElement facebookElement=driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
			WebElement youtubeElement=driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
			WebElement linkedinElement=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
			
			twitterElement.click();
			facebookElement.click();
			youtubeElement.click();
			linkedinElement.click();
			
			Set<String> handles=driver.getWindowHandles(); //return set of strings
			Iterator<String> it=handles.iterator(); //will return Iterator of string 
			//using while loop as we have so many child windows
			while(it.hasNext())  //check next element available gives true
			{
				String windowID=it.next();
				
				driver.switchTo().window(windowID);
				System.out.println(driver.getTitle());
				Thread.sleep(1500); //1.5 sec of wait
					if(!windowID.equals(parentWindowID)) {
						driver.close();
						//closing parent window also along with child windows so we don't want to close parent windows
				        //for that we can do one check driver.getWindowHandle
					}
			}
			//now switching back from child windows after iterating back to parent window
			driver.switchTo().window(parentWindowID);
			System.out.println(driver.getCurrentUrl());
			
			
	}

}
