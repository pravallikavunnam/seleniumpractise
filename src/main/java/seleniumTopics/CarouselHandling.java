package seleniumTopics;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarouselHandling {
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("https://www.noon.com/uae-en/");
				String xpath="//h2[text()='Recommended for you']/../../following-sibling::div//div[@data-qa='product-name']";
				String next_xpath="//h2[text()='Recommended for you']/../../following-sibling::div//div[contains(@class,'swiper-button-next')]";
				List<WebElement> prodList=driver.findElements(By.xpath(xpath)); //get all the product name listed in the carousel
				
				//In ArrayList we can add duplicate values 
				//Hashmap will store the value on the key and value pair format
				//so we go for HashSet
				//creating one set of string ---In set it doesn't not allow duplicate values
				Set<String> prodSet=new HashSet<String>();
				//if we use HashSet--we get all the product names in random order
				//LinkedHashSet ----exact order as click
				//TreeSet----in the Alphabetical Order
				
				while(!driver.findElement(By.xpath(next_xpath)).getAttribute("class").contains("swiper-button-disabled")){
						
					for(WebElement e:prodList) {
						
						String title=e.getAttribute("title");
						//System.out.println(title); //for each carousel click it will give all list of products in all carousel so we go for Set 
						prodSet.add(title);
					}
					
					driver.findElement(By.xpath(next_xpath)).click();
					}
		
				//iterate the prodSet
				for(String e:prodSet) {
				System.out.println(e);	
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
