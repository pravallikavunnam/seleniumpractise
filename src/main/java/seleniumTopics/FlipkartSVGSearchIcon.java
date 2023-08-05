package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartSVGSearchIcon {

		static WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException {
			
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("https://www.flipkart.com/");
				Thread.sleep(4000); //4 sec
				
				driver.findElement(By.name("q")).sendKeys("Macbook pro");
				Actions act=new Actions(driver);
				
				act.moveToElement(driver.findElement(By.xpath("//*[local-name()='svg']/*[name()='g' and @fill-rule='evenodd']"))).click()
				.build().perform();
				
	}

}
