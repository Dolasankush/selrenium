package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	//WebDriver driver;
		//Early initalization using Pagefactory
		@FindBy(id="txtUsername")
		private WebElement username;
		
		@FindBy(id="txtPassword")
		private WebElement pass;
		
		@FindBy (id="btnLogin")
		private WebElement button;
		
		public LoginPage1(WebDriver driver) {
			
			
			PageFactory.initElements(driver, this);
			
		}
		


		public void login() {
			
			username.sendKeys("Admin");
			pass.sendKeys("admin123");
			button.click();
			
		}
	}


