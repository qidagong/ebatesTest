package automationTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


import appModules.SignIn;
import pageObjects.HomePage;

public class TestWebTable {
	
	private static WebDriver driver = null;
	private static WebElement element = null;
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  	driver = new FirefoxDriver();
	  	
	  	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  	
	  	driver.manage().window().maximize();
		
		driver.get("http://www.ebates.com");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		HomePage.link_MyAccount(driver).click();
		
		SignIn.Execute(driver);
		
	
  }
  
  @Test
  public void f() throws InterruptedException {
	  
	  Thread.sleep(3000);
	  
	  element.findElement(By.xpath(".//*[@id='nav-tab1']/a"));
	  
	  Actions action = new Actions(driver);
	  
	  action.moveToElement(element).build().perform();
	  
	 driver.findElement(By.xpath(".//*[@id='categ-nav-sub']/ul/li[14]/a")).click();
	  
	  
	  
	 
		
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
	  
	
	  
  }
  
  

}
