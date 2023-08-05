package seleniumTopics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementHandle {

	//Pseudo Elements are ::before /:: after ---these are called Pseudo classes in HTML
	//any elements associated with it are pseudo elements
	//we check the mandatory field of any element with * --which is 
	//To handle with pseudo elements we use JavaScript Executor
	//whenever we want to execute JS in selenium we use JavaScriptExecutor
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			Thread.sleep(4000); //4 sec
		
//window.getComputedStyle(document.querySelector("label[for='input-firstname']") , '::before').getPropertyValue('content')
			//window is object ,getComputedStyle is a method --give me pseudo element
			//we get pseudo element with the help of document.
			//querySelector is like driver.findElement
			//querySelector is css selector
			// label[for='input-firstname'-----css selector
			
//how to execute above JavaScrip in Selenium--with the hepl of JavaScriptExecutor Interface which is available in a java
//which is used to execute JavaScript Code
			


			
			//we have to convert driver to JavaScriptExecutor and store in reference variable of JavaScriptExecutor 
			//because JavaScriptExecutor is an Interface we cannot create object
			//we cannot use driver directly because driver is object reference of WebDriver Interface
			//we are doing conversion at Interface level
//			JavascriptExecutor js=(JavascriptExecutor)driver  ;
//			String script="return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\") , '::before').getPropertyValue('content')";
//			String man_text=js.executeScript(script).toString(); //gives * which is JS String so convert to string 
//			System.out.println(man_text);
//			if(man_text.contains("*")) {
//				System.out.println("Element is mandatory");
//			}
			
			checkElementIsMandatory("firstname");
//				
		}

	
		public static void checkElementIsMandatory(String value) {
		JavascriptExecutor js=(JavascriptExecutor)driver  ;
		String script="return window.getComputedStyle(document.querySelector(\"label[for='input-"+value+"']\") , '::before').getPropertyValue('content')";
		String man_text=js.executeScript(script).toString(); //gives * which is JS String so convert to string 
		System.out.println(man_text);
		if(man_text.contains("*")) {
			System.out.println(value +" : "+"Element is mandatory");
		}
	}
}
