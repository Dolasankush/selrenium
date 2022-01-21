package POM;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datawithinclass {
	
	@Test(dataProvider="logintest",dataProviderClass=Customdata.class)
	public void Testlogin(String name)
	{
	System.out.println("name is "+name);
		
	}
}
