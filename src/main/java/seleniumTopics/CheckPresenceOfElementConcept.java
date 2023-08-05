package seleniumTopics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckPresenceOfElementConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
			By username=By.name("username");
			By password=By.name("password");
			By loginBtn=By.xpath("//button[@type='submit']");
			By forgotPwdLink=By.xpath("//p[text()='Forgot your password? ']");
			
			//need to apply only for username field
			
			//creating WebDriverWait class
			//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			//WebElement username_ele=wait.until(ExpectedConditions.presenceOfElementLocated(username)) ;
			//RHS is actually creating WebElement---10th approach of creating element with the help of wait
			//will wait for the element for 10 sec--check the ele present on the page ----on the basis of locator
			//if ele is present within 10 sec--we create a webelement and gives you 
			//so until method returns webelement and we can store it in ref var and perform action
			//until method says you have to give me a condition ----that on wait until a specific condition is satisfied
			//for that we use ExpectedConsitions Class
			//return type of until method is WebElement 
		//	username_ele.sendKeys("Admin");
		//	driver.findElement(password).sendKeys("admin");
		//	driver.findElement(loginBtn).click();
			
			//out of three locator we applied wait for only one locator
			//which is not available in IW Concept
			
			//what do you mean by presenceOfElementLocated ?
			//if we want to apply wait for other locators also then we have to write same lines for each locator 
			//so we create a generic method and apply for required locator
			
			
			//here we have 4 elements out of 4 we applied wait only for 2 elements
			waitForElementPresence(username, 10).sendKeys("Admin");
//			driver.findElement(password).sendKeys("admin");
//			driver.findElement(loginBtn).click();
			
//			waitForElementPresence(forgotPwdLink, 5).click();
			waitForElementVisible(forgotPwdLink, 5).click();
			
	}	
	       /**
	        * An expectation for checking that an element is present on the DOM of a page.
	        *  This does not necessarily mean that the element is visible.
	        * 
	        * @param locator
	        * @param timeOut
	        * @return
	        */
			
	
			public static WebElement waitForElementPresence(By locator,int timeOut ) {
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
				return wait.until(ExpectedConditions.presenceOfElementLocated(locator)) ;
			
			}
			
			//if tomorrow element is present in DOM but not visible in the web page 
			//if is not present on web page when perform any action like sendKeys selenium will throw exception
			//so we use other method on the basis of visibility which checks both the things together
			
			
			/**
			 * An expectation for checking that an element is present on the DOM of a page and visible.
				Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
			* @param locator
			 * @param timeOut
			 * @return
			 */
			
			public static WebElement waitForElementVisible(By locator,int timeOut) {
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
				return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			}
			
			
			
			
			
			
			
			
			



}
