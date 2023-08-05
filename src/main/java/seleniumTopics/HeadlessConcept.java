package seleniumTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessConcept {

	public static void main(String[] args) {
		
		//headless --means no browser at all
		//it will not launch any browser
		//browser will be invisible
		//without UI--it will just block visibility of browser
		//execution or testing happening behind the scenes-------
		//As execution happening behind the scenes without opening any browser ---it is slightly faster than normal mode(with the normal browser)
		//----------------
		//when to use headless ---we use in Non UI Environment
		//there are Operating System where there is no look and feel like Linux---where we cannot see browser but internally it uses browser
		//to run test cases with Jenkins---jenkins also run on linux machine---there is no look and feel browser available
		//to run test cases on DOCKER machine--Docker is a type of container(kind of linux machine) ---we can't see any look and feel---
		//Everything happens from terminal ---
		
		//-----------
		//Disadvantage ---we don't prefer headless in below cases
		//might not work for complex HTML Applications
		//might not work for Navigations
		//might not work for mouse movements
		//might not work for responsive testing---responsive testing means running test on different size of the window ---
//my application should work on normal screen size,bigger screen size,t.v,laptop ,mobile and different screens of mobile browsers it should work
//how my application is responding on android phone with 5 inches screen
		
		
		//create an object of ChromeOptions
		ChromeOptions co=new ChromeOptions();
		//co.setHeadless(true);//Deprecated method
		//Deprecated.  Use addArguments(String).Recommended to use '--headless=chrome' as argument for browsers v94-108.
		//Recommended to use '--headless=new' as argument for browsers 
		//Example: `addArguments("--headless=new")`.
		
		//co.addArguments("--headless=new");
				//or
		//co.addArguments("--headless");
				//or
//		co.addArguments("--headless=chrome");
//		
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Pravallika\\Downloads\\Cdriver\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver(co); // will launch the browser
//		driver.get("https://www.amazon.com");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		driver.quit();
		
		//to run headless in firefox
		FirefoxOptions fo=new FirefoxOptions();
		fo.addArguments("--headless"); //--headless=new and headless=chrome won't work for firefox
		WebDriver driver=new FirefoxDriver(fo);
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
//		//to run headless in Edge
//		EdgeOptions eo=new EdgeOptions();
//		eo.addArguments("--headless");
//		WebDriver driver=new EdgeDriver(eo);
//		driver.get("https://www.amazon.com");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		driver.quit();
		
		//There is no support in Safari for headless mode
	}

}
