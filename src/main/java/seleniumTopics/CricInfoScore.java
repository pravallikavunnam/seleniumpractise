package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CricInfoScore {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		brUtil.enterURL("https://www.espncricinfo.com/series/karnataka-in-namibia-2023-1378257/namibia-vs-karnataka-3rd-match-1378260/full-scorecard");

//		By score=By.xpath("//a[@title='Shaun Fouché']/parent::td/following-sibling::td[contains(@class,'ds-min-w-max !ds-pl-[100px]')]");
		
		System.out.println(getWicketTakerName("Shaun Fouché"));
		System.out.println(getWicketTakerName("Nikolaas Davin"));
		
		////a[@title='Shaun Fouché']/parent::td/following-sibling::td[contains(@class,'ds-text-right')]
		
	}
	
	public static String getWicketTakerName(String name) {
		
		return driver.findElement(By.xpath("//a[@title='"+name+"']/parent::td/following-sibling::td[contains(@class,'ds-min-w-max !ds-pl-[100px]')]")).getText();
	}

}
