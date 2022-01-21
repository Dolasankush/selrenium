package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exelpass {
static String value1 ;
	
	public static int readData (int row, int col) throws IOException {
		
		//step-1
		String fileName="TestData.xlsx";
		String path = "C:\\Users\\DELL\\eclipse-workspace\\Selenuim\\Book1.xlsx";
		
		
		//Step-2
		File file=new File(path);
		
		//Step-3
		FileInputStream fs=new FileInputStream(file);
		
		//Step-4
		XSSFWorkbook wb=new XSSFWorkbook (fs);
		
		//Step-5
		XSSFSheet sheet=wb.getSheetAt(0);
		
		//Step-6
		int value=(int) sheet.getRow(row).getCell(col).getNumericCellValue();
		value1=String.valueOf(value);
		
		return value;
		
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {
	
		System.out.println(readData(2,0));
		
		
		
		
		System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver.exe");
		
		//Step-1
		WebDriver driver =new ChromeDriver();
		
		//Step-2
		driver.manage().window().maximize();
		
		//Step-3-using 
		driver.get("https://www.facebook.com/");
		
		//Step-4-Username
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("abc");
		
		//Step-5-Password
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys(value1);
		
		Thread.sleep(6000);
		//driver.close();

	}

}
 
