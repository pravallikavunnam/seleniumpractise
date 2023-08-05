package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class GoogleLangLinks {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException  {
		
		//pseudo elements are those elements which starts with :: in the HTML DOM which are used for representing * symbol
				//url : https://naveenautomationlabs.com/opencart/index.php?route=account/register
				//label[text()='First Name']/following-sibling::div/input[@id='input-firstname']
		
		BrowserUtil brUtil=new BrowserUtil();
		driver=brUtil.launchBrowser("chrome");
	//brUtil.enterURL("https://www.google.com/");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Thread.sleep(4000);
		
		
//		List<WebElement> langLinks=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
//		System.out.println("total lang links=" + langLinks.size());
//		for(WebElement e: langLinks) {
//			String text=e.getText();
//			System.out.println(text);
//			if(text.equals("తెలుగు"))
//			{
//				e.click();
//				break;
//			}
//		}
		
//		By langLinks=By.xpath("//div[@id='SIvCob']/a");
//		clickonElement(langLinks, "తెలుగు");
	
	
	
	By linksList=By.xpath("//div[@class='list-group']//a");
	clickonElement(linksList, "Forgotten Password");
}
	
	
	public static void clickonElement(By locator,String linkText) {
		List<WebElement> langLinks=driver.findElements(locator);
		System.out.println("total number of links=" + langLinks.size());
		for(WebElement e: langLinks) {
			String text=e.getText();
			System.out.println(text);
			if(text.equals(linkText))
			{
				e.click();
				break;
			}
		}
	}

}
