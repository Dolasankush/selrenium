package Testng;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testng4 {
		   @Test(description="apple case")
			public void Apple() {
		     System.out.println("apple method is running");	
			}
		   @Test(description="mangoe case",timeOut=2000)
			public void Mangoe()throws InterruptedException {
			     System.out.println("mangow method is running");
			   Thread.sleep(1000);
				}
		   @Test(description="pinapple tc")
			public void Pinapple() {
			     System.out.println("pinapple method is running");	
				}
		   
//		   @Test//(priority=4,description="fourth tc",enabled=true)
//			public void chikoo() {
//			   Assert.fail();
//			     System.out.println("chikoo method is running")
	}
//		   @Test(priority=5,description="fifth tc",dependsOnMethods="chikoo")
//			public void kiwi() {
//			     System.out.println("kiwi method is running");	
//				}
//		   @Test(priority=6,description="fifth tc",timeOut=2000)
//		  	public void promogrante() throws InterruptedException {
//		  	     System.out.println("promogrante method is running");
//		  	     Thread.sleep(3000);
//		  		}
//		   //org.testng.internal.thread.ThreadTimeoutException:
//			//java.lang.AssertionError: null	
//		   @Test(priority=7,invocationCount=3)
//		 	public void Banana()  {
//		 	     System.out.println("Banana method is running");
//		}}
//		  
//  }
//}
