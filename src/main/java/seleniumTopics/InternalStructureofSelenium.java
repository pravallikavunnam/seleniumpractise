package seleniumTopics;

public class InternalStructureofSelenium {
	
	 //https://www.screencast.com/t/grv4xKv1h
	
	/* 1. In Selenium top Interface is SearchContext ---Rectangle means Interface---there are two methods defined in searcContext
	 *   1. FindElement
	 *   2. FIndElements  ----these methods don't have method body----In interface no method body.
	 * 2. WebDriver Interface is the child of searchContext Interface 
	 *    -- we use keyword extends for interface to interface
	 *    ---So,webdriver Interface extends SearchContext Interface  
	 *    ---we can override searchContext interface methods in webdriver interface---yes but we won't have method body 
	 *    ---Webdriver is an interface have its own abstract methods without any method body
	 *    ----geturl() method---to get the url
	 *    ----getTitle()----give the title but no method body
	 *    ----like close() --to close browser
	 *    ----quit() --to quit browser
	 *  3. RemoteWebDriver is a class which is child of Webdriver interface ---circle means class
	 *    ---we use Implement keyword for Implementing Webdriver Interface
	 *   RemoteWebdriver class Implements webdriver Interface where webdriver interface is extending SearchContect Interface
	 *   ---RemoteWebdriver responsibility is to override methods in webdriver 
	 *   -----and implement those methods with the method body inside the remoteWebdriver class
	 *  4. They are browser specific classes ---SafariDriver is the child of RemoteWebDriver class --extends RemoteWebDriver class
	 *     ---FirefoxDriver is the child of RemoteWebDriver class --extends RemoteWebDriver class
	 *   ---ChromeDriver and EdgeDriver are not directly implementing RemoteWebDriver class
	 *   ----here we ChromiumDriver class---chromium is a technology to develop the browser
	 *   
	 *   ----ChromeDriver and EdgeDriver are the child classes of ChromiumDriver class and --extends ChromiumDriver class
	 *   ----where chromiumDriver is the child of RemoteWebdriver class--extends RemoteWebDriver class
	 *   
	 *   5. If we want to launch chrome browser --we need to use ChromeDriver
	 *   ---so we create object of ChromeDriver new ChromeDriver();
	 *   
	 *   
	 *   
	 *   
	 *   
	 *   
	 *   
	 *    
	 *  
	 *  
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
