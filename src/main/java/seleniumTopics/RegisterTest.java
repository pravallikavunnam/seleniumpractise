package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterTest {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil=new BrowserUtil();
		WebDriver driver=brUtil.launchBrowser("chrome");
		brUtil.enterURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getCurrentURL());
		
		By firstname=By.id("input-firstname");
		By lastname=By.id("input-lastname");
		By email=By.id("input-email");
		By telephone=By.id("input-telephone");
		By password=By.id("input-password");
		By confirmPassword=By.id("input-confirm");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.doSendKeys(firstname, "Pravallika");
		eleUtil.doSendKeys(lastname, "Vunnam");
		eleUtil.doSendKeys(email, "Pravallika.pras@gmail.com");
		eleUtil.doSendKeys(telephone, "8332847364");
		eleUtil.doSendKeys(password, "Pravallika@automation");
		eleUtil.doSendKeys(confirmPassword, "Pravallika@automation");
		
		
		brUtil.closeBrowser();
}

}
