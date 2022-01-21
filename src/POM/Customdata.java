package POM;

import org.testng.annotations.DataProvider;

public class Customdata {
	@DataProvider(name="logintest")
	public String[] getdata()
	{
		String[] data=new String [3];
		data[0]="abc@gmail.com";
		data[1]="xyz@gmail.com";
		data[2]="pqr@gmail.com"; 
		
	return data;
	
	}
}


