package seleniumTopics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		
		//Case 1: Child class object new ChromeDriver()  can be referred by grandparent SearchContext Interface reference variable
		
		SearchContext sc=new ChromeDriver();//valid topcasting only but not recommneded because we never use practically
		                                    //---we can access only FindElement and findelements() method only
										    //where we cannot access get() ,close() , quit() , getURL(), getTitle() ............
		
		//Note : We cannot create object for an Interfaces like SearchContext and Webdriver
		
		//Case 2 : Topcasting ChromeDriver() with webDriver
		
	//WebDriver driver=new ChromeDriver(); //Valid and recommended and can be used for any browser / used for Local Execution
		
		//Case 3 : Topcasting between chromeDriver and RemoteWebDriver
		
	//	RemoteWebDriver driver =new ChromeDriver(); //Valid and recommended also and can be used for any browser / used for Local Execution
		//We can access all the methods from RemoteWebdriver class with reference variable driver
		
		//Case 4 : TopCasting between ChromeDriver and ChromiumDriver

	//	ChromiumDriver driver=new ChromeDriver(); //with this topcasting we can access all methods 
		                                          //but the problem is this top casting can be used only for Chrome and Edge
		                                          //we cannot use for Firefox and Safari
		
		//Case 5 : Top casting between RemoteWebDriver class and WebDriver Inteface
		//Child class object can be referred by parent Interface reference varaiable
		
 //		WebDriver driver=new RemoteWebDriver(remoteAddress,capabilities); //Valid and recommended but used for remote execution
		//when we use selenium Grid or to run test cases on Browser Stack or Lamda Test or any Cloud environment (AWS environment) or docker
		
		
		//Case 6 : Top Casting between RemoteWebDriver class and SearchContext Interface
	//	SearchContext sc=new RemoteWebDriver(remoteAddress,capabilities);//valid topcasting only but not recommneded because we never use practically
        																//---we can access only FindElement and findelements() method only
	    																//where we cannot access get() ,close() , quit() , getURL(), getTitle() ............
		
		
		//Case 7 : Directly Creating object of specific browser driver
		ChromeDriver driver=new ChromeDriver(); // valid but only recommended for specific browser
	//	FirefoxDriver driver=new FirefoxDriver(); // valid but only recommended for specific browser
	//	EdgeDriver driver=new EdgeDriver(); // valid but only recommended for specific browser
		
		
		
		
		
		
		
		
		
		
	}

}
