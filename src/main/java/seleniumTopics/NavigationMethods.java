package seleniumTopics;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author Pravallika
 *
 */

public class NavigationMethods {

	
	public static void main(String[] args) throws MalformedURLException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pravallika\\Downloads\\Cdriver\\chromedriver114\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com"); //get() method used to launch URL
		
		//driver.navigate().to("https://www.google.com");
		
		System.out.println(driver.getTitle());
		//from here if we want to navigate to other URL we can use driver.get or we can use driver.navigate().to(URL)
		
		//navigate().to() method also used to launch URL
		
		//here we pass the string URL
		//driver.navigate().to("https://www.amazon.com");//here navigate.to() method internally calls get() method which enter the URL on browser
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		
		//other way to use driver.navigate.to() --where we pass URL which will be converted to string and calls get() method internally
		//Here we pass the string url with URL class
	//	driver.navigate().to(new URL("https://www.amazon.com")); //here we create object of URL Class and supply url value in the constructor
		//it will ask for (URL url) ---URL is a class in Java--to supply URL bases url we create object of URL Class
		
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		
		//Difference between get() and navigate().to()---there is no difference between these two methods in terms of functionality wise
		//the only difference is navigate.to() method is overloaded
		
		driver.navigate().refresh(); //refresh the current page
		//use of refresh -page not loaded completely sometimes,elements are missing or blank page is coming we can refresh the page
	}
}