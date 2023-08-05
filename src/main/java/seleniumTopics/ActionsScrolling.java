package seleniumTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {
	
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.amazon.com/");
			
		//From Selenium 4 
		//	Improved actions class API and they gave scrollingfeature in action class
		// 	On Amazon --size is fixed --at the end of the page we stop scrolling---where page size is fixed
		// 	facebook----we keep scrolling ---Infinite scrolling
			
		
			//Performs Scroll down two times and one time scroll up
			
			Actions act=new Actions(driver);
//			act.sendKeys(Keys.PAGE_DOWN).perform();   //performs keyboard actions --scroll down once
//			Thread.sleep(1000);
//			act.sendKeys(Keys.PAGE_DOWN).perform();  // //performs keyboard actions --scroll down once
//			Thread.sleep(1000);
//			act.sendKeys(Keys.PAGE_UP).perform();   //performs keyboard actions --scroll up once
			
			//if we want to scroll to end of the page
			//we can use Control+key.down---two keys we need 
			
//			act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
//			Thread.sleep(1000);
			
			//if we have more than one action to perform we use .build().perform()
			
			
			//If we want to go back to start of the page
			
		//	act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
			
			
//			//recently added ScrollToElement
//			act.scrollToElement(driver.findElement(By.linkText("Help")))
//				.click(driver.findElement(By.linkText("Help")))
//					.build()
//						.perform();
			
			//To refresh the page using keyboard Actions
			
		//	act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.COMMAND).build().perform();
			//keyDown method says give me Key 
			//KeysDown ----press the control key but won't release the key
			//Keys.F5---from keyboard sending one event F5
			//KeyUp---release the command
			
			driver.navigate().refresh();
			
			
			
			
			
			
			
			
			
			

}
}