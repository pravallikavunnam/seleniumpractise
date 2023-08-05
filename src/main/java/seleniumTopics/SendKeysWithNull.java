package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendKeysWithNull {

	static WebDriver driver;
	public static void main(String[] args) {
		
		BrowserUtil brUtil=new BrowserUtil();
		driver=brUtil.launchBrowser("chrome");
		brUtil.enterURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By forgot_password=By.linkText("Forgotten Password");	
		By logoImage=By.className("img-responsive");
		By firstName=By.id("input-firstname");
		
	//	driver.findElement(firstName).sendKeys("null");//passing null with double quotes --it will enter null --as it considers null as string

	//	driver.findElement(firstName).sendKeys(null); //IllegalArgumentException: Keys to send should be a not null CharSequence
		
	//	driver.findElement(firstName).sendKeys("");//passing blank value
		
	//	driver.findElement(firstName).sendKeys(" "); //entering space 
		
	//	driver.findElement(firstName).sendKeys("1234");
		//charSequenece is an interface in Java --all classes String ,StringBuffer and StringBuilder are children of CharSequence Interface
		
		String str="Pravallika";
		StringBuilder sb=new StringBuilder("Vunnam");
		StringBuffer sf=new StringBuffer("Chowdary"); 
		
	//	driver.findElement(firstName).sendKeys(args)//charSequnce...KeysToSend ---this 3 dots after charSequence are called as dot parameter
		//we can pass multiple values in the sendKeys method
		
	//	driver.findElement(firstName).sendKeys(str+sb+sf); //
		
	//	driver.findElement(firstName).sendKeys(str+" " +sb +" "+sf);
		
	//	driver.findElement(firstName).sendKeys(sb); //can supply only sb --yes because sendKeys is not only applicable to string ...
		//but also applicable to charSequence---->where charSequence can take StrinBuffer and StringBuilder
		
		driver.findElement(firstName).sendKeys(str,sb,sf); //yes we can pass with comma seperated also it will work
		
		
		
		
		
	}

}
