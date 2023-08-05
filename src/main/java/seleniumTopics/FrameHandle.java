package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	static WebDriver driver;
	
	//Frames
	//In a webpage we have number of elements
	//Inside the webpage we have frames where inside frames also we have frame webelements
	//By default when we launch a webpage driver is available in the web page and interact 
	//----with the page elements present on the page
	//if driver want to interact with frame elements --driver cannot interact 
	//we have to move the driver into frame
	//then only driver can interact with frame elements
	//for that we use drievr.swichto.frame
	
	//how to recognize frames are present on the page?--
	//----by seeing UI we cannot say frames are available or not,we have to see HTML DOM
	//We get NoSuchElementException even after locating the element correctly
		//then check for frame is available in the page
	//what is Frame: Frame is also a webElement ,frame has its own DOM ,html tag,src properties a kind of DOM/HTML element
	//
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//File Upload Pop-up is we have to upload a file and it will starts giving a pop-up to upload file
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
//		String header=driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);    //We get NoSuchElementException 
		
		//using frame Index
//		driver.switchTo().frame(2); //second index frame or third number frame ---index starting with 0
									//driver switch into frame and interact with frame elements
//		String header=driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);
		
		//using frame Name or ID
//		driver.switchTo().frame("main");
//		String header=driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);
		
		//using frame WebElement ---Xpath if Name and ID not available----
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
		String header=driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
		//After switching to frame current position of driver is inside the frame --
		//--now can we interact with page elements --no?
		//here we have move the driver from frame to webpage
		
		driver.switchTo().defaultContent(); //moving back from frame to webpage
		
		
		
		
}
}