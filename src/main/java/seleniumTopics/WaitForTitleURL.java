package seleniumTopics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleURL {

		static WebDriver driver;
		public static void main(String[] args) {
			
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("https://classic.crmpro.com/");
				
				//Wait for the right title am looking for
//				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//				if(wait.until(ExpectedConditions.titleContains("Free CRM"))) {
//					System.out.println(driver.getTitle());
//				}
				
				waitForTitleContains("Free CRM11", 5);
		//		System.out.println(driver.getTitle());
				
		}
		
		public static String waitForTitleContains(String titleFraction,int timeOut) {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
	//		return wait.until(ExpectedConditions.titleContains(titleFraction));
			try {
			if(wait.until(ExpectedConditions.titleContains(titleFraction))) {
				return driver.getTitle();
			}
			else
			{
				System.out.println(titleFraction +" title value not present");
				return null;
			}
			}
			catch(Exception e) {
				System.out.println(titleFraction +" title value not present");
				e.printStackTrace();
				return null;
			}
			
		
		}
		
		//here we need to give full Title
		public static String waitForTitleIs(String titleValue,int timeOut) {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			try {
			if(wait.until(ExpectedConditions.titleContains(titleValue))) {
				return driver.getTitle();
			}
			else
			{
				System.out.println(titleValue +" title value not present");
				return null;
			}
			}
			catch(Exception e) {
				System.out.println(titleValue +" title value not present");
				e.printStackTrace();
				return null;
			}
			
		
		}
		
		
		public static String waitForURLContains(String urlFraction,int timeOut) {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			try {
			if(wait.until(ExpectedConditions.urlContains(urlFraction))) {
				return driver.getCurrentUrl();
			}
			else
			{
				System.out.println(urlFraction +" url value not present");
				return null;
			}
			}
			catch(Exception e) {
				System.out.println(urlFraction +" url value not present");
				e.printStackTrace();
				return null;
			}
			
		
		}


		
		public static String waitForURLToBe(String urlValue,int timeOut) {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			try {
			if(wait.until(ExpectedConditions.urlToBe(urlValue))) {
				return driver.getCurrentUrl();
			}
			else
			{
				System.out.println(urlValue +" url value not present");
				return null;
			}
			}
			catch(Exception e) {
				System.out.println(urlValue +" url value not present");
				e.printStackTrace();
				return null;
			}
			
		
		}
}
