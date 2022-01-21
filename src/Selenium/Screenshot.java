    package Selenium;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

   

public class Screenshot {
 
  public static void main(String[] args) throws IOException, InterruptedException {
			
			

			System.setProperty("webdriver.chrome.driver", "D:\\VELOCITY\\chromedriver.exe");
			
			//Step-1
			WebDriver driver =new ChromeDriver();
			
			//Step-2
			driver.manage().window().maximize();
			
			//Step-3
			driver.get("https://en-gb.facebook.com/");
			
			//Step-4
			driver.findElement(By.xpath("//*[@id='u_0_d_fi']")).click();
			Thread.sleep(4000);
			//*[@id="u_0_d_n2"]	
			//Step-5 Capture screen shot
			
			//step-a
			
			TakesScreenshot  screen= (TakesScreenshot) driver;
			
			//Step-b-
			File source =screen.getScreenshotAs(OutputType.FILE);
			
			String name="Test1";
			//Step-c
			//File destination=new File ("C:\\Users\\LENOVO\\eclipse-workspace\\Katraj-June-26\\Screenshots\\Screen1.png");
			//File destination=new File (System.getProperty("user.dir")+"\\Screenshot\\"+name+".png");
			File destination=new File("C:\\Users\\DELL\\eclipse-workspace\\Selenuim\\Screenshot\\"+name+".png");
		
			//Step-d
			FileHandler.copy(source,destination);
			
			System.out.println("Screen shot taken");
			Thread.sleep(7000);
			driver.close();
			
			
 
		}

	}


