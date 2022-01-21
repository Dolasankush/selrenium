package Testng;

import org.testng.annotations.Test;

public class Groups1 {
	@Test (groups="Sanity", priority=3)
	public void apple() {
		System.out.println(" fruite is -Apple");
	}

	@Test(groups="Regression", priority=1)
	public void apple1() throws InterruptedException {
		System.out.println(" fruite is -Apple1");
		Thread.sleep(3000);
	}

	@Test( groups="Sanity", priority=1)
	public void pineapple() {
		System.out.println(" fruite is -Pineapple");
		//Assert.fail();
	}

	@Test(groups="Regression", priority = 3)
	public void custardapple() {
		System.out.println(" fruite is -custardApple");
	}

	@Test( groups="Sanity", priority = 2)
	public void mango() {
		System.out.println(" fruite is -mango");
	}

	@Test(priority = 2,groups="Regression")
	public void pomegranate() {
		System.out.println(" fruite is -pomegranate");
	}

	@Test(priority = 4, groups="Sanity")
	public void kiwis() {
		System.out.println(" fruite is -kiwis");
	}

}