package seleniumTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthenticationPopUp {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		//If a pop-up comes with username and password fields to enter data then that pop-up is Authentication pop-up
		//These alert is not JS Alert --it looks like JS Alert but not JS Alert
		// This is called as Authentication pop-up or Basis Authentication pop-up
		// It is coming because of browser ---whenever we want to hit the URL where login page is not available 
		//---so username and password are provided to login into the page
		//In Basic Authentication need to supply username and password
		//when this pop-up is there in the page ---nothing is displayed in the page and HTML DOM 
		//---page gets freezed
		//from selenium we cannot do like switching driver and ...
		//no option to use sendKeys also
		
		//creating two strings
		String username="admin";
		String password="admin";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");//Congratulations message after entering un and pwd
		//https://username:password@url
		//if the username and password had @ ---it won't work 
		
		//what do you mean by basic Auth
		//-----this type of pop-up is called as Basic Authentication pop-up
		//-----this authentication is called as Basic Authentication
		//--Basic Authentication is using one username:password in this particular string
		//it will combine the strings together and it will create one encoded string
		//this encoded string is created with the help of btoa  method
		//In btoa we have to supply username:password@ this is done by browser internally and generate some random encoded string
		//btoa is a JS function  ---btos("admin:admin")
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
