package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsSignature {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://signature-generator.com/draw-signature/");
			Thread.sleep(5000);
			WebElement canvas=driver.findElement(By.id("signature-pad"));
			
			Actions act=new Actions(driver);
		 
			//return type of build is action
			Action signature=act.click(canvas).  //click on that element
			moveToElement(canvas, 3, 3)// X and Y offset -Moves the mouse to an offset from the element's in-view center point.
			.clickAndHold(canvas)
			.moveToElement(canvas, -200, -50)
			.moveByOffset(80, -50)
			.moveByOffset(50, -50)
			.moveByOffset(3,3)
			.release(canvas).build();
			signature.perform();

	}
		//MovebyOffset is a method like MoveByElement
		//if we go offset beyond the range it give exception---MoveTargetOutOfBoundException
	
}
