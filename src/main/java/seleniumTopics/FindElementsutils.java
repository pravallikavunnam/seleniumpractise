package seleniumTopics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElementsutils {
	static WebDriver driver;
	public static void main(String[] args) {
		
			BrowserUtil brUtil=new BrowserUtil();
			driver=brUtil.launchBrowser("chrome");
			//brUtil.enterURL("https://www.amazon.com");
			
			
			brUtil.enterURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			
			By links=By.tagName("a");
			By images=By.tagName("img");
			
//			List<WebElement> linksCount=driver.findElements(links);
//			List<WebElement> imagesCount=driver.findElements(images);
//			System.out.println(getElementsCount(images));
//			System.out.println(getElementsCount(links));
			
			List<String> actElementTextList=getElementTextList(links);
			System.out.println(actElementTextList);
			
			if(actElementTextList.contains("Privacy Policy")){
				System.out.println("Privacy Policy---"+ "PASS");
			}
			if(actElementTextList.contains("Terms & Conditions")){
				System.out.println("Terms & Conditions---"+ "PASS");
			}
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public static List<String> getElementTextList(By locator) {
		List<WebElement> eleList=getElements(locator);
		List<String> eleTextList=new ArrayList<String>();
		System.out.println(eleList.size());
		for( WebElement e : eleList) {
			String text=e.getText();
			if(!text.isEmpty()) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}

}
