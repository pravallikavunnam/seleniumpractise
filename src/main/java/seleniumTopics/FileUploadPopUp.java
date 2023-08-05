package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		//File Upload Pop-up is we have to upload a file and it will starts giving a pop-up to upload file
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//input type =file --type attribute should be file
		//create web element
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\Pravallika\\Documents\\toast.txt"); 
		//give the path of file name in sendKeys

		//this hack will work only when type=file should be available
		
		
		//if type=file is not available
		//1. ask developers to add this attribute
		//2. you can use Robot Class---not recommended ---because works only---
			//---only for windows. wont work for linux, mac, docker, cloud, jenkins, headless, grid
		//3. AutoIt tool----can be integrated with selenium-----Not recommended-only for windows. 
			//----wont work for linux, mac, docker, cloud, jenkins, headless, grid
		//4. sikuli -- not recommended -- coz its based image ---not provided by selenium
		    //it is a third party library ---need to take screenhsot of each and every steps and save in a file 
			//---and need to give that file path
		
		//we have other types of pop-ups also
		//1. Advertising pop-up -->pop-up along with x icon ---which is a web element --we can --locate the xpath and close it
		//--no need to switch to alert---it is a webelement only--we can see this pop-up in production environment 
		//---only for advertising purpose
		//we cannot see this pop-up in lower environment like QA/STAGE/DEV/UAT Environments .test environment
		//Also called as Random pop-ups --because we don't know when it comes 
		//can we automate Random pop-ups?
		//-never automate
		
		
		//2. Browser window pop-up
		
		//for cookies also ---no need to switch to cookie pop-up  --we need to inspect the element and click on it
		
		
		
		
		
		
		
		
	}

}

