package Testng;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Testng. Listner.class)

public class Testlisten {
	
		
		@Test(priority=0)
		public void method1() {
			System.out.println("method 1 -Pass");
		}
		@Test (priority=1)
		public void method2() {
			System.out.println("method 2 -Fail");
			Assert.assertFalse(true);
		}
		@Test(dependsOnMethods="method2")
		public void method3() {
			System.out.println("method 3 -Skip");
			
		}

	}



