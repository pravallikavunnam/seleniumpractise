package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownWithSelectClass {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://html.com/attributes/select-multiple/");

			//if we have select tag with Multiple attribute 
			//if multiple property is there means then it is MultiSelectionDropdowns
			
			//creating select class object
			//In Select class object we pass WebElement
			
			//to select the values from multi selection dropdown
			
			WebElement dropDownEle=driver.findElement(By.xpath("//select[@multiple]"));
			Select select=new Select(dropDownEle);
			
			//we have one method select.isMuliple which returns boolean
			//which tells select based dropdown is multi selection or single selection
			if(select.isMultiple()) {
				System.out.println("multi selection is possible");
				select.selectByVisibleText("American flamingo");
				select.selectByVisibleText("Chilean flamingo");
				select.selectByVisibleText("Lesser flamingo");
				select.selectByVisibleText("James's flamingo"); //word with single quote James'sit will work
				              //if word id James"s then we need to escape character with James\"s
				
			} 
			
			//If we want to Deselect
			
			select.deselectByVisibleText("Lesser flamingo");
			select.deselectAll();			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
