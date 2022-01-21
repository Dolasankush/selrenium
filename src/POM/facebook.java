package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class facebook {
	private WebElement user;
	private WebElement pass;
	private WebElement button;


 
	public facebook (WebDriver driver)
	{
    	user=driver.findElement(By.cssSelector("input#email"));
    	pass=driver.findElement(By.id("pass"));
    	button=driver.findElement(By.name("login"));
    	//search=driver.findElement(By.xpath("//input[@role='combobox']"));
    }
    public void login() {
    	user.sendKeys("9604747754");
    	pass.sendKeys("Ankush@1410");
    	button.click();

    	
    }
//    public void search() {
//    	search.click();
//    	search.sendKeys("dilip raut");

    }
	


