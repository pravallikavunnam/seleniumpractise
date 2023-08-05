package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectDropdownWithoutSelectClass {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil brUtil=new BrowserUtil();
		driver=brUtil.launchBrowser("chrome");
	//	brUtil.enterURL("https://www.orangehrm.com/en/try-it-free#free-trial-info-menu");
		brUtil.enterURL("https://www.distacart.com/");
		Thread.sleep(4000);
		
		//Don't use select class methods like SelectByIndex,SelectByValue,SelectByText and getOptions also
		//In Selenium 2 Select class was there but select class methods(SelectByIndex,SelectByValue,SelectByText) was not there
		
	//	By countryOptions=By.xpath("//select[@id='Form_getForm_Country']/option");
		
		//By countryOptionsCSS=By.cssSelector("#Form_getForm_Country >option");
		
		By countryOptionsCSS=By.cssSelector("#CountryList>li");
		
		doSelectDropDownValueUsingLocator(countryOptionsCSS, "Canada");

	}
	
	
	public static void doSelectDropDownValueUsingLocator(By locator,String optionName) {
		
		List<WebElement> optionsList=driver.findElements(locator);
		int optionsCount=optionsList.size();
		System.out.println(optionsCount);
		for(WebElement e:optionsList) {
			String name=e.getText();
			System.out.println(name);
			if(name.equals(optionName)) {
				e.click();
				break;
			}
		}
		
		
	}
	

}



