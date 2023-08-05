package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil brUtil=new BrowserUtil();
		driver=brUtil.launchBrowser("chrome");
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(4000);

		
		// 1. right click on normal page we get some options those are browser options we cannot automate them
		// 2.Right click---right clicking on a specific WebElement where we can perform any automation
		//this kind of Right click is context menu----right click and context menu both are same
		//what kind of element it is??it is a context menu element --shows application specific options when we do right click.
		
		
		
	//	WebElement rightClickElement=driver.findElement(By.xpath("//span[text()='right click me']"));
		
//		Actions act=new Actions(driver);
//		act.contextClick(rightClickElement).perform();
		
//		List<WebElement> rightClickoptionsList=driver.findElements(By.cssSelector("ul.context-menu-list.context-menu-root span"));
//		rightClickoptionsList.size();
//		for(WebElement e: rightClickoptionsList)
//		{
//			String name=e.getText();
//			System.out.println(name);
//			if(name.equals("Copy"))
//			{
//				e.click();
//				break;
//				
//			}
//			
//		}
		
		//Without for loop if we want to directly click on Copy
		
	//	driver.findElement(By.xpath("//span[text()='Copy']")).click();
		By contextMenuLocator=By.xpath("//span[text()='right click me']");
		selectRightClickOption(contextMenuLocator, "Quit");
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void selectRightClickOption(By contextMenuLocator,String optionValue) {
		Actions act=new Actions(driver);
		act.contextClick(getElement(contextMenuLocator)).perform();
		By optionLocator=By.xpath("//*[text()='"+optionValue+"']"); //span is hardcoded so we replace span with *
		getElement(optionLocator).click();
		
	}	
}
