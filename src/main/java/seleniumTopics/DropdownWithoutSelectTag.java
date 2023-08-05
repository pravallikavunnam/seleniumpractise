package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownWithoutSelectTag {

	//How to handle Dropdwon when select tag is not available
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://demoqa.com/select-menu");
			Thread.sleep(3000);
			
			//Elements->Event Listeners->Blur->remove blur properties
			
			//Blur property is responsible for disappearing and blurring the dropdown options
			//so that we can inspect dropdown options
			
			driver.findElement(By.xpath("//div[text()='Select Option']")).click();
			Thread.sleep(1500);
			List<WebElement> optionsList=driver.findElements(By.xpath("//div[contains(@id,'react-select-2-option')]"));
			for(WebElement e:optionsList) {
				String text=e.getText();
					if(text.contains("Group 1, option 2")) {
						e.click();
						break;
					}
				System.out.println(text);
			}
			
			
			
			
			

	}

}
