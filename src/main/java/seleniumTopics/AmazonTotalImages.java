package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTotalImages {

	static WebDriver driver;
	
	public static void main(String[] args) {
		BrowserUtil brUtil=new BrowserUtil();
		driver=brUtil.launchBrowser("chrome");
		brUtil.enterURL("https://www.amazon.com");
		
		By images=By.tagName("img");
		List<WebElement> imagesCount=driver.findElements(images);
		System.out.println("Total images are :"+imagesCount.size());
		
		
		for(WebElement e:imagesCount) {
			String srcValue=e.getAttribute("src");
			String altValue=e.getAttribute("alt");
			System.out.println(srcValue+ ":"+ " "+altValue); //getting this data form page is web Scraping 
			//Web scrap -we scrap the data from online application
			
		}
	}

}
