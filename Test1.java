package automationTest;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


import appModules.SignIn;
import pageObjects.HomePage;


public class Test1 {

	private static WebDriver driver = null;
	private static WebElement element = null;

	public static void main(String[] args) {
		
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.ebates.com");
		
		HomePage.link_MyAccount(driver).click();
		
		SignIn.Execute(driver);
		
		System.out.println("Successfully log in");
		
		element = driver.findElement(By.xpath(".//*[@id='header-main']/div[1]/div/div/div/ul/li/a/span[1]"));
		
		element.click();
		
		
		
		

		HomePage.link_logout(driver);
		
		driver.close();
		
		
		
		
	}

}
