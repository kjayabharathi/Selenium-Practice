package com.jaya.iphoneyellow.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.jaya.iphoneyellow.pageobjs.AmazonPage;
import com.jaya.iphoneyellow.pageobjs.WalmartPage;
import com.jaya.iphoneyellow.testbase.TestBase;
import com.jaya.iphoneyellow.utils.Utils;
import com.relevantcodes.extentreports.LogStatus;

public class AmazonPageTest extends TestBase {

	AmazonPage amazonPage;
	WalmartPage WalmartPage;

	public AmazonPageTest() {
		super();
		TestBase.getDriverInstance();
		amazonPage = new AmazonPage();
	}

	@Test(priority = 1)
	public void productSearch() {
		amazonPage.enterProductNameToSearch();
		test.log(LogStatus.PASS, "Product name entered");

		try {
			test.addScreenCapture(Utils.captureScreenShot(driver));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 2)
	public void productSearchButtonClick() {
		amazonPage.clickOnSearchButton();
		test.log(LogStatus.PASS, "Clicked on search button after entering product value");

		try {
			test.addScreenCapture(Utils.captureScreenShot(driver));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 3)
	public void firstItemClick() {
		amazonPage.clickOnSearchResultFirstItem();
	}

	@Test(priority = 4)
	public void readProductRateinAmazon() {
		amazonPage.getProductRateinAmazon();
	}

	@Test(priority = 5)
	public void moveToWalmart() {
		WalmartPage = amazonPage.navigateToWalmart();
	}

	// @AfterMethod
	// public void tearDown() {
	// // driver.quit();
	// }

}
