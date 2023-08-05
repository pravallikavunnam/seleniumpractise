package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIFramesHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		Thread.sleep(2000);
		
		//first frame
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("Pravallika");
		
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("Eshan");
		
		//if we try to directly move from frame1 to frame3 ----cannot switch from frame1 to frame3
//		driver.switchTo().frame("pact3");
//		driver.findElement(By.id("glaf")).sendKeys("Chinnu");
		
		//trying from frame3 to frame1 traversing   --cannot switch from frame3 to frame1
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("PC");
		
		//from Selenium 4 we got this concept parentframe
		
		//If we want to traverse backwards in Nested Iframes
		
//		//to traverse back to immediate parent frame  ---from Iframe3 to Iframe2
//		driver.switchTo().parentFrame(); 
//		driver.findElement(By.id("jex")).sendKeys("Narra");
//
//		//to traverse back to immediate parent frame  ---from Iframe2 to Iframe1
//		driver.switchTo().parentFrame(); 
//		driver.findElement(By.id("inp_val")).sendKeys("Vunnam");
		 
		// to traverse back to immediate parent frame  ---------from Iframe1 to Main Page
//		driver.switchTo().parentFrame();           
//		String text=driver.findElement(By.tagName("h3")).getText();
//		System.out.println(text);
	
		//we can use default content --says switch to first frame on the page or main document when a page contains iframe
//		driver.switchTo().defaultContent();	
//		String text=driver.findElement(By.tagName("h3")).getText();
//		System.out.println(text);
		
		//switch to first frame on the page
	//	driver.findElement(By.id("inp_val")).sendKeys("mallika");
		
		//always goes to main document where ever we are
//		driver.switchTo().defaultContent();	
//		String text=driver.findElement(By.tagName("h3")).getText();
//		System.out.println(text);
		

	}

}
