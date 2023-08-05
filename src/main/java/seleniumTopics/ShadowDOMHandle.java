package seleniumTopics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMHandle {
	
	//ShadowDOM --element is available inside ShadowDOM
	//why dev created shadow dom element --for security purpose
	//xpath won't work for Shadow DOM Elements
	//only CSS Selector is used
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
			driver=new ChromeDriver();
		//	driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		//	Thread.sleep(4000); //4 sec
		//	driver.findElement(By.id("pizza")).sendKeys("mushroom"); //not entering because element is present inside shadow-root
			//shadow-root (open) should be always open --otherwise we cannot automate if it is close
		
			//Browser-page-Shadow DOM-Shadow DOM-Element
			//no direct method is available to handle shadow DOM -so we use JavaScript
//		
//		String script="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
//		
			JavascriptExecutor js=(JavascriptExecutor)driver;
//		//getting HTML element and now need to convert to WebElement
//		WebElement pizza_ele=(WebElement)js.executeScript(script);    
//		pizza_ele.sendKeys("Veg Pizza");
//		
		//Browser-Page-Shadow DOM-Iframe-element
		
		
		//entering in chrome settings page
			Thread.sleep(4000);
		driver.get("chrome://settings/");
		WebElement search=(WebElement)js.executeScript("return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")");    
		search.sendKeys("Notification");
		
		
		
	//shadow DOM is also a WebElement
	//Iframe is available in the form of Web Element
		//shadow root is not available in the form of web element ,but it is associated with existing web Element
		//SVG is a WebElement ---yes it has its own properties and html tag
		//can we use normal xpath with SVG --No
		//can we use css selector with SVG ---No
		
		
		
		
		
		//	JavascriptExecutor js=(JavascriptExecutor)driver; --how to explain this line
		//one child class has two parent interfaces
		//two parent interfaces want to communicate with each other
		//reference type check will be failed if we use driver
		//so converting driver to JS
		
		
		
		

	}

}
 