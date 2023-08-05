package seleniumTopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownWithOptions {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil brUtil=new BrowserUtil();
		driver=brUtil.launchBrowser("chrome");
		brUtil.enterURL("https://www.orangehrm.com/en/try-it-free#free-trial-info-menu");
		Thread.sleep(4000);
		
		
		By country=By.id("Form_getForm_Country");
//		Select select=new Select(driver.findElement(country));
//		
//		//To check how many options are there in the dropDown and print all the option value one by one in the console
//		
//		//we have one method getOptions() which comes from Select class ,so we are able to call from select class object reference
//		List<WebElement> countryOptionsList=select.getOptions(); //return type of this method is List<WebElement>
//		System.out.println(countryOptionsList.size());
//		int count = 0;
//		for(WebElement e:countryOptionsList)
//		{
//			String CountryName=e.getText();
//			System.out.println("Countryname at index "+" "+ count +":"+ CountryName);
//			count++;
//		}
//		
		
		
		if(getDropDownTextList(country).contains("India")){
			System.out.println("PASS");
			
		}
	
		//we can create expected collection /asList methods return List of string so storing in List<String>
		List<String> expectedCountryOptionsList=Arrays.asList("India","Brazil","Aruba"); 
		
		if(getDropDownTextList(country).containsAll(expectedCountryOptionsList)){  //if we want to check two or more countries from the ArrayList 
			                                            //Ex: we have month dropDown and from the list we have 12 months we need to check Jan ,feb ,Mar
			                                            //containsAll will ask to give the collection of those things
			
			System.out.println(expectedCountryOptionsList +"is available");
		}
	}
	
	
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	//if we want to use all dropDown values we create generic method using ArrayList and store the values and return
	
	public static List<String> getDropDownTextList(By locator) {
		Select select=new Select(getElement(locator));  //call getElementMethod
		List<WebElement> optionsList=select.getOptions();  //getOptions method will return list of webElements 
		List<String> optionsTextList=new ArrayList<String>();  //list of blank ArratList creation
		for(WebElement e:optionsList)
		{
			String optionName=e.getText();
			optionsTextList.add(optionName);
		}
		return optionsTextList;
	}
	
	
	//Give me the count of how many options are in the particular list
	
	public static int getDropDownOptionsCount(By locator) {
		Select select=new Select(getElement(locator));
		return select.getOptions().size();
	}
	
	
	
}
