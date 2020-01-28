package com.jaya.tests;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.internal.Utils;

import com.jaya.pages.LoginPage;
import com.jaya.testbase.TestBase;
import com.jaya.utils.Util;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTest extends TestBase {

	LoginPage login = new LoginPage(TestBase.getDriverInstance());

	@Test(priority = 1)
	public void enterZipcodeValue() throws IOException {
		login.enterZipCodeText("72712");
		test.log(LogStatus.PASS, "zipcode is entered");
		test.addScreenCapture(Util.captureScreenShot(driver));
	}

	@Test(priority = 2)
	public void selectSearchResult() throws InterruptedException {
		login.clickResultDropDown();
		test.log(LogStatus.PASS, "Login", "Selected the drop down element");
	}

	@Test(priority = 3)
	public void clickContinue() throws InterruptedException {
		login.clickOnContinueButton();
		test.log(LogStatus.FAIL, "Clikc on the buttont");
	}
}
