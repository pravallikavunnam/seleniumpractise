package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandle {
	
	// Dropdown --Country ,month
	// dropdown which is available under select tag
	// In selenium we have to use Select class designed for dropdown

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil brUtil=new BrowserUtil();
		driver=brUtil.launchBrowser("chrome");
		brUtil.enterURL("https://www.orangehrm.com/en/try-it-free#free-trial-info-menu");
		Thread.sleep(4000);
		
		By country=By.id("Form_getForm_Country");
		WebElement country_ele=driver.findElement(country);
		
		//we have to create object of select class
		Select select=new Select(country_ele); //constructor asking for a webElement  so passing the WebELement
		//three methods are available under Select class
		
//1.		select.selectByIndex(5); 		//SelectByIndex method is taking integer as a parameter
										   //it will select 5th value from country dropDown
		
		//whatever index we give that will get selected
		//tomorrow if two more countries are added index will get changed and no guarantee that index will be same,index will get change
		//so thats why we move to other method
		
		//Example ----we can use index method for Month dropdowns and year dropdowns
		
//2.	select.selectByVisibleText("India");  //Actual text having ----give exact value that is visible in the dropDown and selects that value
		
		//if we don't want to use selectByVisibleText then we have another method
		
		
		
//3.	select.selectByValue("Austria"); // select by value means if you have value attribute available ,we can pass value attribute
		
		//Value and text cannot be same for all the application it depends on the application
		
		//if we have 10 dropdowns in the page then we need to create 10 select class objects  with 10 different webElements for each dropDown 
		//10 times we need to write Select select=new Select()
		//we cannot use same select class object for other dropdowns---so we create a generic method for creating select class object 
		//so that we can call method when required
		
	//	doSelectByIndex(country, 5);

	//	doSelectByIndex(country, 400);//when we give index more than existing index value we get NoSuchElementException 
										//selEnium internally knows the existing index so when we give more than that index it gives NSEE
	//	doSelectByIndex(country, -1);
		
	//	doSelectByVisibleText(country, null);
		
	//	doSelectByVisibleText(country, "India");
		
	//	doSelectByValue(country, "Brazil");
		
		doSelectByValue(country, "Brazil123"); //if we give invalid value we get NoSuchElementException
		
		
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	
	public static void doSelectByIndex(By locator, int index) {

		if (index < 0) {
			System.out.println("Please pass the right (+)ve index");
			return; // only return means return nothing and void both are same
		}
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectByVisibleText(By locator, String visibleText) {

		if(visibleText==null)
		{
			System.out.println("Please pass the right visible text and it cannot be null");
			return;
		}
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}

	public static void doSelectByValue(By locator, String attributeValue) {

		if(attributeValue==null)
		{
			System.out.println("Please pass the right visible text and it cannot be null");
			return;
		}
		Select select = new Select(getElement(locator));
		select.selectByValue(attributeValue);
	}

}
