package seleniumTopics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectorsHubWebTableHandle {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException  {
		
		BrowserUtil brUtil=new BrowserUtil();
		driver=brUtil.launchBrowser("chrome");
		brUtil.enterURL("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);
	
		//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']
		
//		driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input")).click();
		//List<WebElement> link=driver.findElements(By.xpath("//a[text()='Joe.Root']/parent::td/following-sibling::td"));
//		selectEmp("Joe.Root");
//		selectEmp("Garry.White");
		
		System.out.println(getEmployeeInfo("Joe.Root"));
		System.out.println(getEmployeeInfo("Garry.White"));
		
		
	}
		
		public static void selectEmp(String empName) {
			driver.findElement(By.xpath("//a[text()='"+empName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		
		}
		
		public static List<String> getEmployeeInfo(String empName) {
			List<WebElement> infoList=driver.findElements(By.xpath("//a[text()='"+empName+"']/parent::td/following-sibling::td"));
			System.out.println(infoList.size());
			List<String> infoValList=new ArrayList<String>();
			for(WebElement e:infoList) {
				String text=e.getText();
				infoValList.add(text);
				
			}
			return infoValList;
		}
}