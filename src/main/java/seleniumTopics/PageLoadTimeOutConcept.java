package seleniumTopics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageLoadTimeOutConcept { //once page is fully loaded then perform some action
	

		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
				driver=new ChromeDriver();
			//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25)); //you wait upto 25 sec
				//if page is not loaded after 25 sec then thorw the exception
				//generally we don't use pageloadtimeout method because selenium is already waiting foe the page to load completely
				//but if page is taking time 2 or 3 minutes to load the page 
				
				driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
				//By email=By.id("input-email");
				
				//it is also a kind of dynamic wait, if page is completely loaded with 2 sec then rest 8 sec will be ignored
				//where no need of Thread.sleep
				//if we want to apply polling time also we can apply
				if(isPageLoaded(10)) {
				System.out.println("Page is fully loaded");	
				}

	}
		
		//how to check page is completely loaded or not
		//console--document.readyState   ---gives result as complete once the page is completely loaded
		//or else it will give result Interactive

		public static boolean isPageLoaded(int timeOut) {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
			String flag=wait.until(ExpectedConditions.jsReturnsValue("return document.readyState=='complete'")).toString();
			//returns JS boolean true or false so convert to string and store in String 
					//the value of flag will be true with ""
					//so convert this string to boolean  ---we use Wrapper Class from Java
			return Boolean.parseBoolean(flag);//then supply flag and return boolean
			
			//jsReturnsValue : this method is very powerful it is gonna wait to execute this particular script is giving you complete
			//which is telling page is completely loaded and page is ready to interact
			
		}
		
		//Tell me the three states of the page
		//1.Loading
		//2. Interactive mode
		//3. Complete
		
		//Javascript for those states is document.readyState
}






