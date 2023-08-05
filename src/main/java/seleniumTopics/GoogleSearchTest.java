package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		brUtil.enterURL("https://www.google.com/");
		
		
		//when we apply get text() method on parent tag we will get text of child elements also
		
		//when searched for Naveen Autoamtion Labs in google.com
		//when I enter key search field--it will hit database --from database via API then we get suggestion list
		

	//	Thread.sleep(4000); //wait for 4 seconds
		
		
//		List<WebElement> suggestionList=driver.findElements(By.xpath("//ul[@role='listbox']//div[@role='presentation' and @class='wM6W7d']/span"));
//		
//		System.out.println(suggestionList.size());
//		for(WebElement e: suggestionList) {
//		String text=e.getText();
//			System.out.println(text);
//			if(text.contains("youtube")) {
//				e.click();
//				break;
//			}
//		}
		
		By searchSLocator=By.xpath("//ul[@role='listbox']//div[@role='presentation' and @class='wM6W7d']/span");
		By search=By.name("q");
		
		
		doSearch(search, searchSLocator, "Naveen Automations Labs", "youtube");
	}
	
	
	public static void doSearch(By searchLocator ,By searchSuggLocator,String searchKey,String suggName) throws InterruptedException {
		driver.findElement(searchLocator).sendKeys(searchKey);
		Thread.sleep(4000);
		List<WebElement> suggestionList=driver.findElements(searchSuggLocator);
		
		System.out.println(suggestionList.size());
		for(WebElement e: suggestionList) {
		String text=e.getText();
			System.out.println(text);
			if(text.contains(suggName)) {
				e.click();
				break;
			}
		}
		
	}

}

