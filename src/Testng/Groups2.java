package Testng;

import org.testng.annotations.Test;

public class Groups2 {

	@Test(groups="Sanity", dependsOnMethods="Testng.Groups1.kiwis")    
	public void f() {
		System.out.println("@Test running");
	}

	@Test (groups="Regression", dependsOnMethods="Testng.Groups1.custardapple" )
	public void f1() {
		System.out.println("f1 is running");
	}

	@Test (groups="Sanity", dependsOnMethods="f")
	public void f2() {
		System.out.println("@Test running");
	}

}
   