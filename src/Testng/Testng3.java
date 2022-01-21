package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testng3 {
   @Test(priority=2,description="second tc")
	public void Apple() {
     System.out.println("apple method is running");	
	}
   @Test(priority=-1,description="third tc")
	public void Mangoe() {
	     System.out.println("mangow method is running");	
		}
   @Test(priority=1,description="first tc")
	public void Pinapple() {
	     System.out.println("pinapple method is running");	
		}
   
   @Test(priority=4,description="fourth tc",enabled=true)
	public void chikoo() {
	   Assert.fail();
	     System.out.println("chikoo method is running");	
		}
   
   @Test(priority=5,description="fifth tc",dependsOnMethods="chikoo")
	public void kiwi() {
	     System.out.println("kiwi method is running");	
		}
   @Test(priority=6,description="fifth tc",timeOut=2000)
  	public void promogrante() throws InterruptedException {
  	     System.out.println("promogrante method is running");
  	     Thread.sleep(3000);
  		}
   //org.testng.internal.thread.ThreadTimeoutException:
	//java.lang.AssertionError: null	
   @Test(priority=7,invocationCount=3)
 	public void Banana()  {
 	     System.out.println("Banana method is running");
}}
  
