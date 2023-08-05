package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil brUtil=new BrowserUtil();
		driver=brUtil.launchBrowser("chrome");
		brUtil.enterURL("https://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(4000);
		
		//Drag and drop ---Manually
		//1. Move to source Element
		//2. Click and hold it
		//3. move to target element
		//4. Release/drop the particular element
		
		WebElement sourceElement=driver.findElement(By.id("draggable"));
		WebElement targetElement=driver.findElement(By.id("droppable"));
		
//		Actions act=new Actions(driver); //create an object of Actions class
//		act.clickAndHold(sourceElement); //click and hold source element
//		act.moveToElement(targetElement); //move to target element
//		act.release();   //release the source element
		
		//if i won't use .build and .perform what is the exception selenium throws?---no selenium won't throw any exception 
		
		Actions act=new Actions(driver); 
	//	act.clickAndHold(sourceElement).moveToElement(targetElement).release().perform();   		//works
	//	act.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();   //works 
		//--these actions all methods in one line are called as multiple composite actions
		
		//till selenium 3 .build and .perform was mandatory but from selenium 4 .perform alone we can use
		
		//we have one direct method also
		
		act.dragAndDrop(sourceElement, targetElement).perform() ;//here we have only one action
		
		//drag and drop we can do only from one webElement to another WebElement in selenium
		//we cannot do drag and drop file from drive to browser
		
		

	}

}
