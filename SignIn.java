package appModules;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;
import pageObjects.LogIn;

public class SignIn {
	
	public static void Execute (WebDriver driver){
		
		String handle = driver.getWindowHandle();
		
		Set handles  = driver.getWindowHandles();
		
		for (String handle1: driver.getWindowHandles()){
			
			driver.switchTo().window(handle1);
		}

	 
	   LogIn.txtbx_UserName(driver).sendKeys("qidagong@gmail.com");
	 
	   LogIn.txtbx_Password(driver).sendKeys("code1234");
	 
	   LogIn.btn_LogIn(driver).click();
	}
	

}

