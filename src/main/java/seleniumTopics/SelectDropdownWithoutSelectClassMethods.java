package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownWithoutSelectClassMethods {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil brUtil=new BrowserUtil();
		driver=brUtil.launchBrowser("chrome");
		brUtil.enterURL("https://www.orangehrm.com/en/try-it-free#free-trial-info-menu");
		Thread.sleep(4000);
		
		//Don't use select class methods like SelectByIndex,SelectByValue,SelectByText
		
		By country=By.id("Form_getForm_Country");
		
//		Select select=new Select(driver.findElement(country));
//		List<WebElement> optionsList =select.getOptions();
//		for(WebElement e:optionsList) {
//			String list=e.getText();
//			System.out.println(list);
//			if(list.equals("India")){
//				e.click();
//				break;
//			}
//		}
		
		doSelectDropdownValue(country, "Brazil");
		Thread.sleep(3000);
		doSelectDropdownValue(country, "India");
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static void doSelectDropdownValue(By locator,String dropDownValue)
	{
		Select select=new Select(getElement(locator));
		List<WebElement> optionsList =select.getOptions();
		for(WebElement e:optionsList) {
			String list=e.getText();
			System.out.println(list);
			if(list.equals(dropDownValue)){
				e.click();
				break;
			}
		}
		
	}

}
