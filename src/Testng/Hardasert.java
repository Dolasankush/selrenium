package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardasert {
	@Test
	public void Asser() {
   System.out.println("@Test method is running");
   String s="facebook";
   System.out.println("Title of String" +s);
   Assert.assertEquals(s,"facebookk");
   System.out.println("test case failed");	
   }
}
 
