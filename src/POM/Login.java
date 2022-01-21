package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	private WebElement search;
	




	public  Login (WebDriver driver)
	{
    	
    	search=driver.findElement(By.xpath("//input[@role='combobox']"));
    }
   

    	
    
    public void search() {
    	search.click();
    	search.sendKeys("dilip raut");

    }
	
}



