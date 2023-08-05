package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		Thread.sleep(3000);
		
		//difference between frame and Iframe
		//In selenium both are frames---frame html tag is almost deprecated--we can have duplicate frames in the page
		//now we can most of the HTML DOM with iframe  -follows W3C Standard --we cannot have duplicate iframes in the page
		
		//frames ---majorly for security and to prevent automation
		
		driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click(); //click on Image
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]"))); //Switch to frame
		 
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("12345"); //sendkeys
		
		driver.switchTo().defaultContent(); //switch back to normal page from iframe
		
		
		

	}

}




	