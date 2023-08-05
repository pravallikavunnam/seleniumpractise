package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonFooterColumnCheck {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil brUtil=new BrowserUtil();
		driver=brUtil.launchBrowser("chrome");
		brUtil.enterURL("https://www.amazon.com/");
		Thread.sleep(4000);
		
//		String footerHeaderText=
//				driver.
//				findElement(By.xpath("//a[text()='Amazon Science']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div ")).getText();
//		System.out.println(footerHeaderText);
		getFooterHeaderText("Blog");
		getFooterHeaderText("Amazon Science");
		getFooterHeaderText("Sell apps on Amazon");
		getFooterHeaderText("Reload Your Balance");
		getFooterHeaderText("Help");
		driver.findElement(By.className(""));
		
		
		//xpath : 
		//1. //a[text()='Blog']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div
		//2. //a[text()='Blog']/ancestor::ul/parent::div/div
		//3. //a[text()='Blog']/parent::li/parent::ul/parent::div/div
		//4. //a[text()='Blog']/parent::li/ancestor::div[@class='navFooterLinkCol navAccessibility']/div
		
		//two types of sibling
		//1. preceding --if tag is behind the current tag
		//2. following  --if tag is after the current tag
		
		//5. //a[text()='Blog']/parent::li/ancestor::ul/preceding-sibling::div
	}
	
	public static String getFooterHeaderText(String footerText) {
		String footerHeaderText=
				driver.
				findElement(By.xpath("//a[text()='"+footerText+"']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div ")).getText();
		System.out.println(footerHeaderText);
		return footerHeaderText;
		//to append string in xpath we use ' "+text+"'
		
	}

}

