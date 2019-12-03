package com.jaya.framework;

import org.testng.annotations.Test;

public class SampleTestNG {

	@Test(priority = 107)
	public void close() {
		System.out.println("F");
	}

	@Test(priority = 106)
	public void amountVerify() {
		System.out.println("amountVerify ");
	}

	@Test(priority = 100, description = " This is the method we are using for login test", enabled = false)
	public void doLogin() {
		System.out.println("doLogin ");
	}

	@Test(dependsOnMethods = "enterUserDetails", enabled = false)
	public void click() {
		System.out.println("click ");
	}

	@Test( description = "Entering username and password", enabled = false)
	public void enterUserDetails() {
		System.out.println("enterUserDetails ");
	}

	@Test(priority = 105)
	public void moneyTransfer() {
		System.out.println("moneyTransfer ");
	}

	@Test
	public void checkBlalance() {
		System.out.println("checkBlalance ");
	}

}
