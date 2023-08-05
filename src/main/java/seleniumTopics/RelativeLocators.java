package seleniumTopics;

import static org.openqa.selenium.support.locators.RelativeLocator.with; //static imports won't come directly
//if no static import we need to use classname.method each time RelativeLocator.with as with is a static method

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RelativeLocators {
		
		//In Selenium 4 they have added one feature -RelativeLocators 
		//RelativeLocator ----like relatives of particular element
		//An element is available -- from center of an element we can go left or right of an element 
		 //                         --from center of an element we can go above or below of an element 
		//				Near --we have near from one element to near element in HTML DOM
		//We are looking for specific element without using any siblings concept or complex Xpaths
		
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("https://www.aqi.in/dashboard/canada");
				
				WebElement ele=driver.findElement(By.linkText("Sudbury, Canada"));
				
				//If we want to move right of ele
				String rightIndex=driver.findElement(with(By.tagName("P")).toRightOf(ele)).getText();
				//with is a static method in RelativeLocator class
				System.out.println(rightIndex);
				
				//1.with is a method available in RelativeLocator Class
				//2. with method says you have to give me by locator
				//3. but we are going to give RelativeBy
				//4. RelativeBy is a class and By is parent class of RelativeBy class
				//5. so when we write with in class findElement is expecting By locator but with method is giving RealtiveBy
				//6. As RelativeBy parent is By so findelement will accept when with is giving RelativeBy instead By
				//7. RelativeBy is also a By
				 
				
				//return type of with method is relativeBy ---relativeBy is another class which is child of By Class
				//so with method will return By in the form of relativeBy
				
				
				//If we want to move left of ele
				String leftIndex=driver.findElement(with(By.tagName("P")).toLeftOf(ele)).getText();
				System.out.println(leftIndex);
				
				//If we want to move below of base ele
				String belowIndex=driver.findElement(with(By.tagName("P")).below(ele)).getText();
				System.out.println(belowIndex);
				
				//If we want to move above of base ele
				String aboveIndex=driver.findElement(with(By.tagName("P")).above(ele)).getText();
				System.out.println(aboveIndex);
				
				//If we want to move to near of base ele
				String nearIndex=driver.findElement(with(By.tagName("P")).near(ele)).getText();
				System.out.println(nearIndex);
				
				//default distance of near is 100 pixels
				
				//We can use RelativeLocator to find List of WebElements also
				List<WebElement> belowElements=driver.findElements(with(By.xpath("//div[@id='most_pollutedCitiesRank']/p")).below(ele));
				System.out.println(belowElements.size());
				for(WebElement e:belowElements) {
					String text=e.getText();
					System.out.println(text);
				}
				
				
				
		
	}

}
