package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class HomePage {
	
	private static WebElement element = null;
	
	public static WebElement link_MyAccount(WebDriver driver){
		
		element = driver.findElement(By.xpath(".//*[@id='header-main']/div[1]/div/div/div/ul/li[2]/a"));
		
		return element;	
	}
	
	
	public static WebElement link_logout(WebDriver driver){
		
		element = driver.findElement(By.xpath(".//*[@id='header-main']/div[1]/div/div/div/ul/li/ul/li[9]/a"));
		
		return element;
		
	}
	

}
