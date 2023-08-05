package seleniumTopics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	/*How to launch browser
		1. Open the Browser ---Chrome
		2. First we create the object of ChromeDriver --As we selected browser as chrome
		3. ChromeDriver is coming from selenium libraries so we need to Import, 
		 where import is coming from dependencies which we added from selenium 4.1.9 version 
		 
	Note :  1. we cannot interact directly with browser without browser.exe file
			2. We have scripted code for chrome 100 version but now chrome browser got updated to latest version 105
			,if we try to send request from chrome 100 version exe to browser 105 verson script wont work and interacts
			3. It will always works like one-to one mapping ie ..100 version chrome.exe will work for 100 chrome browser version
			4. To avoid above problem after selenium 4.6.0 release ---no need to download exe files ,
			everything will be taken care by selenium internally ie...SeleniumManager
			
	 */

	public static void main(String[] args) {
		
		//https://www.screencast.com/t/eeiz5LCogUGJ
		
		//1.Open the Browser--Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\Cdriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();   //this line---calls default constructor of new ChromeDriver class and 
                                                  //because of which chrome browser will get launched
		//driver is a reference variable of ChromeDriver which is pointing to this object new ChromeDriver()
		//created an object for ChromeDriver class--so we can Inherit all grand parent RemoteWebDriver class methods
		//----ie grand child class can Inherit the methods of Grandparent class methods by creating object of grand child class
		//Designed methods in WebDriver Interface....and Implemented those methods in RemoteWebDriver class 
		//----and Inherited those methods by ChromeDriver Class
		
		
		//whenever line no 25 is written it will open fresh chrome browser which is a replica of existing chrome browser
		//FirefoxDriver driver=new FirefoxDriver();
		//EdgeDriver driver=new EdgeDriver();
		
		//2. Enter URL ---to launch URL
		driver.get("https://www.google.com"); // driver reference we use to call the methods of parent class
		                                    //where overidden get() method form remotewedDriver class is Inherited in ChromeDriver class
		//After entering the URL if i miss protocol ie..missing http or https
		//driver.get("www.google.com"); //browser will open but will not enter URL and gives Exception as InvalidArguementException
		
		//If we remove www from URL 
		driver.get("https://google.com"); //It will enter URL ,selenium will automatically take care even if we miss www in any URL
		//return type of get method is void
		
		//3. get the title ---//to fetch the title 
		String title=driver.getTitle(); //return type of getTitle is string 
		System.out.println("Actual Title :" + title);
		
		//4. verify the title ---Actual vs Expected Result/Verification point/Check Point/
		if(title.equals("Google")) {
			System.out.println("Correct title");
		}
		else
		{
			System.out.println("Incorrect title");
		}
		
		//Automation testing---Automation Steps + CheckPoint (Verification )(Actual Vs Expected )
		
		//5. Close the Browser--driver.quit and driver.close methods
		driver.quit();
		
		
	}

}
