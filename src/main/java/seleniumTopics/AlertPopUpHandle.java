package seleniumTopics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//	Alert : Alert means JS alert or JS pop-up
			
		//console --alert('this is my alert)----that alert is JS alert -because of JS Method Alert it is coming
		//-we cannot inspect it --it is not part of our page --it is not webElement
			
		//It is browser pop-up or it is coming because of JS running in the browser with JS Alert method
		// we cannot use driver.findElement for this elements because no HTML DOM defined for this alerts
			
		//three types of  JS alerts
		//1. Alert
		//2. Prompt Alert---where asks to enter username with OK and Cancel Button ---this alerts are also JS Alerts only
			//on prompt alerts also we cannot use use driver.findElement for this elements 
			//----because no HTML DOM defined for this alerts
			//in prompt alerts we can have only one field
		//3.Confirmation Alerts--	with confirmation message are you sure to delete or something---with OK and Cancel button
			
		//can we have multiple alerts at a time---No,because it will freeze the entire page ,its block any action on the page
		//-----after handling the alert only we can do any actions in the page
			
		//when we click on confirmation pop-up we have ok and cancel buttons which are predefined --
		//click on OK ---Accept the alert
		//Click on Cancel ---Dismiss the alert  or press Escape from Keyboard
			
		//JS Alert is also called as modal dialog 
			
		//1.Normal Alert
//			driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//			//now the driver will be in the pop-up
//    	Alert alert=driver.switchTo().alert(); //switch to the alert
//			String text=alert.getText();  //get text of the alert
//			System.out.println(text);
//			alert.accept();//To Accept the alert 
//			Thread.sleep(2000);
//		//	alert.dismiss();
			
		//2. Confirmation pop-up
//			driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//			Thread.sleep(2000);
//			Alert alert=driver.switchTo().alert();
//			String text=alert.getText();
//			System.out.println(text);
//			//alert.accept();
//			alert.dismiss();
//			
		//3. Prompt Pop-up
			driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
			Thread.sleep(2000);
			Alert alert=driver.switchTo().alert();
			String text=alert.getText();
			System.out.println(text);
			Thread.sleep(2000);
			alert.sendKeys("Test Automation"); //to enter text in the field
			alert.accept();
			Thread.sleep(2000);
			String msg=driver.findElement(By.id("result")).getText();
			System.out.println(msg); //output --You entered: Test Automation
			//To fetch the value which we entered
			//we need to split the string --return type of split is String Array
			String actTextEntered=msg.split(":")[1].trim();
			System.out.println(actTextEntered);
			
			//In JS Alerts We never see
			//1. X icon in the pop-up
			//2. two fields to enter values in the prompt pop-up
			 
			
			
			
			
			
			
			
	}

}
