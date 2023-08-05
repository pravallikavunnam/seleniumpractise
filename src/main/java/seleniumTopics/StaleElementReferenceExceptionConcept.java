package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceExceptionConcept { //We have to reinitialize the WebElement

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			WebElement username=driver.findElement(By.id("input-email"));
			//after creating the page refreshing the page
			username.sendKeys("pandu@gmail.com");
			driver.navigate().refresh();//page will be refreshed
			//after refreshing the page if we try to do any action on the element we get StaleElementReferenceException
			//even if we apply thread.sleep or wait also we get the exception only
			Thread.sleep(4000);
			//so after refreshing the page again we need to create the element and perform an action 
			//so its better to create By.locator and use whenever required instead using driver.find and hitting the server each time
			username=driver.findElement(By.id("input-email"));
			username.sendKeys("test@gmail.com");
		
		//Exception in thread "main" org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
		

	}
	
	
	
	//1. When URL is entered DOM is loaded first then page is loaded
	//2. Even after refresh also DOM also gets refreshed along with page refresh
	//3. DOM1----ele v1 got created --username.sendkeys---works
	//4. refresh--After refreshing the page 
	//5. DOM2---ele v1 cannot be identified in DOMV2 version thats why we get StaleElementReferenceException
	//Stale means not fresh or rotten or got expired
	//ele is from first DOM V1 then you refresh the page so ele got expired
	//so we have to initialize the ele as per DOM V2 
	//username.sendKeys  -here DOM isv2 and ele also v2 
	
	//In which cases we get StaleElementReferenceException
	//1. navigate.refresh 
	//2. navigate.back
	//3. navigate.forward
	
	
	//for each and every element selenium will maintain one WebElement ID internally
	//ele1 in DOM1 will be expired after page refresh 
	//so in DOM2 ele1 WebElement ID will be expired
	//so in DOM2 WE reinitialize the ele1 as ele2 in DOM2
	//
	
	
	
	
	
	
	
	
	
	

}
