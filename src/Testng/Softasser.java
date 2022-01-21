package Testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softasser {
  @Test
  public void Soft() {
	  SoftAssert sa=new SoftAssert();
		sa.assertEquals("soft","Soft");
		  System.out.println("hi after assert");
		  System.out.println("Second statement after assert");
		  sa.assertAll();
		  System.out.println("Second statement after assert");
		
  }
  
}
