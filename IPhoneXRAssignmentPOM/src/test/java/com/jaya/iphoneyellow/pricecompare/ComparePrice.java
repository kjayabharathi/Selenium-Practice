package com.jaya.iphoneyellow.pricecompare;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.jaya.iphoneyellow.testbase.TestBase;

public class ComparePrice extends TestBase {

	public WebDriver driver;
	static SoftAssert softAsserts;
	static Logger logger;

	public static void ratesCompare() {

		double amazonPrice = TestBase.amazonProductRate;
		double walmartPrice = TestBase.walmartProductRate;
		if (amazonPrice == walmartPrice) {
			assertEquals(amazonPrice, walmartPrice);
			logger.debug("Amanzon and Wakmart prices are same");
		} else if (amazonPrice != walmartPrice && amazonPrice > walmartPrice) {
			logger.debug("Walmart rate is lesser than Amazon");
		} else {
			logger.debug("Amazon rate is lesser than Walmart");
		}

	}

	/*
	 * public void ratesCompare() { if (TestBase.walmartProductRate ==
	 * TestBase.amazonProductRate) { System.out.println(" Both Rates are same,  " +
	 * " Amazon Rate : " + TestBase.amazonProductRate + " And " + " Walmart Rate : "
	 * + TestBase.walmartProductRate); } else if (TestBase.walmartProductRate <
	 * TestBase.amazonProductRate) {
	 * System.out.println("  Walmart rate is lesser than Amazon, " +
	 * " Amazon Rate : " + TestBase.amazonProductRate + " And " + " Walmart Rate : "
	 * + TestBase.walmartProductRate); } else {
	 * System.out.println("  Amazon rate is lesser than Walmart, " +
	 * " Amazon Rate : " + TestBase.amazonProductRate + " And " + " Walmart Rate : "
	 * + TestBase.walmartProductRate); } }
	 */

}
