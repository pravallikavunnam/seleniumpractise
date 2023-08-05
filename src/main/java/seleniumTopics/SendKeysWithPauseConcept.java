package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithPauseConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			
			WebElement fname=driver.findElement(By.id("input-firstname"));	
			Actions act=new Actions(driver);
			String value="PravallikaVunnam";
			//we have to enter the value with pause --enter character by character
			//sp converting the value to tocharArray----which gives array characters
			char ch[]=value.toCharArray(); // --it will divide entire string into character array --it is like static array
			for(int i=0;i<ch.length;i++) {
				act.sendKeys(fname, String.valueOf(ch[i])+" ").pause(1000).build().perform(); //ch[i] says it not applicable for webelemnt,character
				                            //need to convert the character to string
				
			}
			
			
		//1. Break the string into charArray
		//2. Convert characterArray into String
		//3. put a pause of req sec
		//4. use a loop and do
			
			
			
			
	}

}
