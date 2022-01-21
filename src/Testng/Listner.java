package Testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner extends Testng5  implements ITestListener{


	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On test start from Listeners");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On test Success from Listeners");
		//takeScreenshot(driver,result.getName());
	}

	public static void takeScreenshot(WebDriver driver, String name) {
	TakesScreenshot  screen= (TakesScreenshot) driver;
		
		//Step-b-
		File source =screen.getScreenshotAs(OutputType.FILE);
		
		int no=1;
		//Step-c
		//File destination=new File ("C:\\Users\\LENOVO\\eclipse-workspace\\Katraj-June-26\\Screenshots\\Screen1.png");
		File destination=new File (System.getProperty("user.dir")+"\\Screenshots\\"+name+".png");
		no++;
		
		//Step-d
		try {
			FileHandler.copy(source,destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Screen shot taken");

		
	}
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailure from Listeners");
		takeScreenshot(driver,result.getTestName());
		
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSkipped from Listeners");
	}

	

}

