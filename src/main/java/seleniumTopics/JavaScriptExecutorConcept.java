package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	static WebDriver driver;
	//JavaScriptExecutor : Inject JS Script/Code using selenium-java with JavaScriptExecutor
	//hierararcy
	//JavaScriptExecutor is the parent Interface of RemoteWebDriver
	//RemoteWebDriver class had two parent Interfaces---JavaScriptExecutor ,WebDriver
	//we cannot executescript() method with driver which are coming from JavaScriptExecutor Interface
	//we access methods coming from WebDriver Interface
	//so we do conversion driver into JavaScriptExecutor 
	//we cannot create object of interface but we can create ref var
	
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
			driver=new ChromeDriver();
	//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			//casting from one interface to other interface
	//		JavascriptExecutor js=(JavascriptExecutor)driver;//entire r.h.s is JavaScriptExecutor storing in ref var
	//		js.executeScript("alert('hi this is automation')"); //alert method in JS Console
			//through script injecting JS in browser---because of that pop-up will come as browser understands JS
			
			
			//To get title of the page--- we use driver.getTitle() in Selenium
			//In JS document.title()we use which returns JS value 
	//		String title=js.executeScript("return document.title").toString(); //document.title returns JS String 
																	//so we convert to normal string and store
	//		System.out.println(title);
			
			//selenium will give request to server
	//		driver.getCurrentUrl();
	//		driver.getTitle();
			
			JavaScriptUtil jsUtil=new JavaScriptUtil(driver);
//			System.out.println(jsUtil.getTitlebyJS());
//			
//			jsUtil.generateJSAlert("This is my testing alert");
//			driver.switchTo().alert().accept();
			
			
//			driver.get("https://classic.crmpro.com/");
//			String pageText=jsUtil.getPageInnerText();
//			System.out.println(pageText);
//			if(pageText.contains("Deals & Sales Pipeline")) {
//				System.out.println("Pass");
//			}
			
			//Amazon page --has static scrolling --page size is fixed
			//in zomato,linkedin,facebook----Infinite Scrolling
			
//			driver.get("https://www.amazon.com/");
//			Thread.sleep(2000);
//			jsUtil.scrollPageDown();
//			Thread.sleep(1000);
//			jsUtil.scrollPageUp();
//			Thread.sleep(500);
//			jsUtil.scrollPageDown("900");
//			jsUtil.scrollPageDownMiddlePage("1000");
			
		//	WebElement element=driver.findElement(By.xpath("//span[text()='International top sellers']"));
//			jsUtil.scrollToView(element);
			
	//		jsUtil.zoomChromeEdgeSafari("300");
			
	//		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		//	jsUtil.drawBorder(search);
			
			
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//			WebElement register=driver.findElement(By.cssSelector(".form-horizontal"));
//			jsUtil.drawBorder(register);
			
			
			
			
			WebElement fn=driver.findElement(By.id("input-firstname"));
			WebElement ln=driver.findElement(By.id("input-lastname"));
			jsUtil.flash(fn);
			fn.sendKeys("Pravallika");
			jsUtil.flash(ln);
			ln.sendKeys("Vunnam");
			
			
			
			
			
			
			
	}

}
