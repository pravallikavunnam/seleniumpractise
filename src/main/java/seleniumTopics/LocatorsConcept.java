package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		//Every webpage had elements --which are web elements like search,logo,link,footers links,dropdown...
		//whatever we see on webpage are web elements
		//create a webelement + perform action (click,sendKeys,submit,isDisplayed(),getext)
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\Cdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
	
		//Case 1 :find element and perform an action
		
//		driver.findElement(By.id("input-email")).sendKeys("abc123"); //always supply string value with double quotes in sendKeys method
//		//findElement() is coming from searchcontext Interface to webdriver Interface to remotewebdriver class
//		//By is a class in selenium .....//By.id() ---id is a static method
//		
//		driver.findElement(By.id("input-password")).sendKeys("123");
//		
		//Case 2 :  find element and perform an action
		//here we can use weblement ref var any numbers of times and pass different credentials and test
	//	driver.findElement(By.id("input-email")); //findElement method returns webelement --so we store in webelement reference variable
//		WebElement emailID=driver.findElement(By.id("input-email"));
//		WebElement password=driver.findElement(By.id("input-password"));
//		
//		emailID.sendKeys("abcd");
//		password.sendKeys("123");
		
		//Case 3 : find element and perform an action --using By locator approach
//		By email=By.id("input-email"); //return type of id method is By ,so we create reference variable for By class
//		By pwd=By.id("input-password");
//		//we have not created element yet --we create element with driver.findElement
//		
//		//CREATE ELEMENT
//		WebElement email_id=driver.findElement(email); //and store in webelement ref var
//		WebElement pass_ID=driver.findElement(pwd);
//		
//		//PERFORM ACTION
//		email_id.sendKeys("automation");
//		pass_ID.sendKeys("123445");
//		
		//Case 3 is better approach 
		//In Case 1 : everytime we are using driver.findelemnet and sendkeys .... --so there is No reusability
		
		//In Case 2: we are creating web elements and performing action 
		//while creating web elements we are hitting the server ,so further if we are not using created webelements ...\
		//then we had sent unnecessary request to server
		//what if we don't want to perform any action after creating webelements in advance
		
		//In Case 3 : we are not hitting server ,we are just creating By locators like initializing variables where server is not initailized
		//server will be hit when we write any driver specific methods like driver.get,driver.title..... where no session ID is used
		//whenever required we create webelement and perform action instead of creating unnecessary web elements
		
		
		//Case 4 : By locator with web element generic method --we create a generic method
		//here we wrote driver.findElement only once in the method ,so tomorrow if we have 10 locators also we write only once
		//
		
//		By email=By.id("input-email"); 
//		By pwd=By.id("input-password");
		
		//when we call this method, entire email value given to By locator and driver.findelement will create webelement 
		//and return then we perform action
//		getElement(email).sendKeys("seleniumautomation");
//		getElement(pwd).sendKeys("1234");
		
		//Case 5 : By locator with web element and action generic method---generic method to perform action also 
		//here we used two generic methods and we don't need to use sendKeys and driver.findElements multiple times
		//Maintain By locator and call the method and supply values
//		By email=By.id("input-email"); 
//		By pwd=By.id("input-password");
//		
//		doSendKeys(email,"testing");
//		doSendKeys(pwd,"234566");
	
		//Case 6: By locator with web element and action generic method in a Utility Class
		//the Utilities we created can used for any application anywhere and anytime to perform sendKeys
		
		By email=By.id("input-email"); 
		By pwd=By.id("input-password");
		
		//we don't have any default constructor in Elementutil class
//		ElementUtil eleUtil=new ElementUtil(driver);  //ElementUtil method says you have to give me driver 
//		eleUtil.doSendKeys(email, "seleniumautomationUI");  //so when we create object ElementUtil method will be called and supply driver
//		eleUtil.doSendKeys(pwd, "1234567891");	//we have driver in our current class driver =new chromeDriver ,so we supply same driver
//		
		//Case 7 : By locator with web element and action generic method in a Utility Class
		// with a test / called class with brUtil and eleUtil
		
		
	}
	
	//case 4 :------------
	//we take as static method no need to create object of class---own custom method getElement()
	//this method says give me By locator i will give you webElment
	//getElement() says it will help to create webElement
	//for creating webElement we use driver.findElement and same locator we supply there
//	public static WebElement getElement(By locator) { //driver.  --am not getting any options ,driver created at the local level inside main method
//								//so we move driver to class level and make it static --because no need to create object of class to use driver  
//	return driver.findElement(locator); //driver .findElement will return WebElement so return type changed to WebElement
//	}
	
	//case 5 ----------------
	
	//A static method doSendKeys --give me the By locator we enter value
//	public static void doSendKeys(By locator,String value) {
//		getElement(locator).sendKeys(value); //we call getElement method and supplying locator and use sendKeys method and passing value
//	}
//	

}
