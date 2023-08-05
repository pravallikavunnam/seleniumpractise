package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiLevelMenuSelection {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(3000);
		
		WebElement shopByCategory=driver.findElement(By.xpath("//a[@qa='categoryDD']"));
		Actions act=new Actions(driver);
		act.moveToElement(shopByCategory).build().perform();
		Thread.sleep(3000);
		
		List<WebElement> level1=driver.findElements(By.xpath("//ul[@id='navBarMegaNav']//a"));
		
			for(WebElement e:level1) {
				act.moveToElement(e).build().perform();
				System.out.println(e.getText());
			
			
		List<WebElement> level2=driver.findElements(By.xpath("(//ul[contains(@class,'nav-pills')])[2]//a"));
			for(WebElement e1:level2) {
				act.moveToElement(e1).build().perform();
				System.out.println(e1.getText());
				
			
		List<WebElement> level3= driver.findElements(By.xpath("(//ul[contains(@class,'list-unstyled')])[last()-1]//a"));
			for(WebElement e2:level3) {
				act.moveToElement(e2).build().perform();
				System.out.println(e2.getText());
		
		}
		
	
	 }
	 }

	}
}

 
