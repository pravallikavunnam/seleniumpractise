package seleniumTopics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {   //IW is a method


	static WebDriver driver;
	public static void main(String[] args) {
		
		//Implicitly wait : It is also called a global wait
		//Global wait : which means after Implicitly wait applied after this line --if we create any web element --this implicitly wait will be applied
		//Applicable for all the web elements by default
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
			driver=new ChromeDriver();
			
			//when we apply Implicit wait
			//we apply implicit wait after initializing driver
			
			//Selenium 3 
		//	driver.manage().timeouts().implicitlyWait(long time, TimeUnit unit); //It is from Selenium 3 which is now deprecated 
		//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//Selenium 4
		//	driver.manage().timeouts().implicitlyWait(Duration duration); //In selenium 4 added duration which is the major change
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //duration is class
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.findElement(By.name("username")).sendKeys("Admin"); //Timeout will be 10 sec
			//If no wait is given and locator is wrong/not found  exception will be thrown immediately
			//if wait is given--it will wait for given time and throw the exception if locator is wrong or nor found
			//Element2 --timeout will be 10 sec
			//eleemnt3 --timeout will be 10 sec
			//---------
			//element 100 --timeout will be 10 sec
			
			
			//Homepage will be very slow --requires 20 sec --so here we can over write Implicitlywait
			//that is why it is called as global wait --once it is declared through out script it will applied until it is changed futher
			
			//once we overwrite then that wait will be applied for the rest of the elements
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//so from here for homepage and login page it will wait for 20 sec
			//but login page requires only 10 sec
			
			//logout
			
			//then again login page will come ----latest wait will be 20 so it will wait for 20 sec after logout and login also
			//username
			//paswword
			//login button
			
			
			//for some scenarios we want more time
			//for some scenarios we want less time
			//for some scenarios we want no time
			
			//If 100 elements are there in the page
			//Problem 1:for 100 elements Implicitly Wait will be given timeout like 10 sec--so it will check 100 times for value of IW
			//thats why IW has performance issue
			//we don't use IW in framework
			//Problem 2: everytime we have to keep over writing timeout based on the element 
			
			
			//IW won't work for non Web Elements ----waiting foe Title of page ,URL of page ,Alert of page 
			
			
			
			
			
			
			
			
			
			
			
			
			

	}

}
