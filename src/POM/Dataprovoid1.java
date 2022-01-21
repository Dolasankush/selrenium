package POM;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovoid1 {
	@Test(dataProvider="testdata")
	public void integer (String num) {
	System.out.println(num);	
	}

 @DataProvider(name="testdata")
  public String[] getdata() {
	 String [] data=new String[4];
	data[0]="1234";
    data[1]="5678";
    data[2]="9874";
    data[3]="2121";

	return data;
	
}
}
