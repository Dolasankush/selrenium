package POM;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovoider {

	@Test(dataProvider="TestData")
	public void login(String value) {
		
		System.out.println(value);
				
	}
	
	@DataProvider(name="TestData")
	public String[] getData() {
		
		String[] data=new String [3];
		data[0]="FisrtValue";
		data[1]="SecondValue";
		data[2]="Thirdvalue"; 
		
		
		return data;
	}
	
	
	
	
	
}



