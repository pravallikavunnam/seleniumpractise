package seleniumTopics;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSessionConcept {

	public static void main(String[] args) {
		//what will be the sessionID after using quit method and again writing code in the program
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\Cdriver\\chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver(); 
//		driver.get("https://www.google.com");
//		String title=driver.getTitle(); 
//		System.out.println("Actual Title :" + title);
//		System.out.println(driver.getCurrentUrl());
//		driver.quit(); //quit the browser and session id will be closed
//	
//		//After using quit() session id =null ,to initiate new session ID again new to launch driver
//		
//		driver=new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		
//		System.out.println(driver.getTitle());//we cannot use driver after calling quit()---gives
		// NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\Cdriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.google.com");
		String title=driver.getTitle(); 
		System.out.println("Actual Title :" + title);
		System.out.println(driver.getCurrentUrl());
		driver.close();  //close the browser and session id will be same but Session ID will becomes Invalid
	//	System.out.println(driver.getTitle());
		//NoSuchSessionException: invalid session ID ie..Expired Session ID so we cannot get the title
		
		driver=new ChromeDriver(); 
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle()); 
		
		
		//calling quit and close methods it will never close server.
		//after calling quit and close --we cannot use any driver methods 
		//---need to launch browser and enter URL then only we can call other methods
		
		
	}

}
