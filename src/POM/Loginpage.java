package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	private WebElement username;
	private WebElement pass;
	private WebElement button;
	
	public Loginpage(WebDriver driver) 
	{
		username=driver.findElement(By.id("txtUsername"));
		pass=driver.findElement(By.id("txtPassword"));
		button=driver.findElement(By.id("btnLogin"));
	}
	  public void login() {
		  
		username.sendKeys("Admin");
		pass.sendKeys("admin123");
		button.click();
		
	}
}
	


