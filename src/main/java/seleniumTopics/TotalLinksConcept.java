package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalLinksConcept {
	static WebDriver driver;
	public static void main(String[] args) {

		//1. Open any url
		//2. get the count of links in the page
		// 3.print the text of each link in the console
		//4. Ignore blank text --blank links 
			
			BrowserUtil brUtil=new BrowserUtil();
			driver=brUtil.launchBrowser("chrome");
			brUtil.enterURL("https://www.amazon.com");
			
			By links=By.tagName("a");//when we pass incorrect locator ----In findElements method it will return empty list as with size 0
			//but where we get NoSuchElementException when locator is incorrect in FindElement method
			
			List<WebElement> linksList =driver.findElements(links); //List is a parent Interface of ArrayList
			//List is a order based list --which maintains  order of data on the basis of indexing 0,1,2.....
			//we should store list of webelements only in List ,,we cannot store in List<String> or arrayList or normal Array
			//why List means ?List is always Dynamic  --because links on the webpage are not always fixed 
			
			//we are collecting all webelements so List<WebElement>
			
			int linksCount =linksList.size(); //we use .length() for array and string and for ArrayList we use .size method to get count
			System.out.println("Total links are="+ linksCount);
			
			//3.print the text of each link in the console
			//using indexed based loop
			
//			for(int i=0;i<linksCount;i++)
//			{
//				String linkNames=linksList.get(i).getText();
//				if(!linkNames.isEmpty())
//				System.out.println(i + ":"+linkNames);
//			}
			
			//for each loop
			int count=0;
			for(WebElement e:linksList) {
				String text=e.getText();
				if(!text.isEmpty()) {
					System.out.println(count +":"+ text);
				}count++;
				
			}
	}

}
