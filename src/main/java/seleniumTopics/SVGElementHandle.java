package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	//SVG - normal xpath wont work
	//parent svg: local-name()
	//child scg: name()
	//css selector: no support
	//can we user other attributes: yes we can use it

public class SVGElementHandle {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://petdiseasealerts.org/forecast-map");
			Thread.sleep(4000); //4 sec
			
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
			List<WebElement> statesList= driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']"));
			System.out.println(statesList.size());
			
		//	Actions act=new Actions(driver);
			
			for(WebElement e:statesList) {
				Thread.sleep(500);
			//	act.moveToElement(e).build().perform();
				String text=e.getAttribute("name");
				System.out.println(text);
					if(text.equals("Maryland")) {
						e.click();
						break;
					}
			}
	}

}

//1. Shadow DOM
//2. SVG Element
//3. Pseudo Elements ---special type of elements which are available on the web page
//There is no direct support available with selenium .we have to solve with different mechanism like JavaScript Executor
//SVG element also --normal xpath won't work whenever we are interacting with SVG Elements
//SVG -Scalar Vector Graphs --flipkart --search icon
