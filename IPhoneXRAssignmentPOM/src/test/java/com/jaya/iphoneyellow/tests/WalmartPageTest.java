package com.jaya.iphoneyellow.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jaya.iphoneyellow.generics.GlobalConfigurations;
import com.jaya.iphoneyellow.pageobjs.AmazonPage;
import com.jaya.iphoneyellow.pageobjs.WalmartPage;
import com.jaya.iphoneyellow.testbase.TestBase;
import com.jaya.iphoneyellow.utils.Utils;
import com.relevantcodes.extentreports.LogStatus;

public class WalmartPageTest extends TestBase {

	GlobalConfigurations gConfigs;
	WalmartPage walmartPage;
	AmazonPage amazonPage;

	public WalmartPageTest() {
		super();

		/*
		 * driver.navigate().to("https://www.Walmart.com/");
		 * walmartPage.enterProductNameToSearchInWalmart();
		 */
		gConfigs = new GlobalConfigurations();
		gConfigs.readPropertiesFile("./resources/configs/GlobalSettings.properties");
		String walmartURL = gConfigs.properties.getProperty("url2");
		System.out.println(" Peroperty value from file : " + gConfigs.properties.getProperty(walmartURL));
		driver.navigate().to(gConfigs.properties.getProperty(walmartURL));

	}

	@Test(priority = 6)
	public void enterProductNameToSearchInWalMart() throws Exception {

		walmartPage.enterProductNameToSearchInWalmart();
		test.log(LogStatus.PASS, "Product name entered");
		try {
			test.addScreenCapture(Utils.captureScreenShot(driver));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 7)
	public void productSearchButtonClickInWalmart() {
		walmartPage.clickOnSearchButtonInWalmart();
		test.log(LogStatus.PASS, "Clicked on search buttoon after entering value");
		try {
			test.addScreenCapture(Utils.captureScreenShot(driver));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 8)
	public void firstItemClick() {
		walmartPage.clickOnSearchResultFirstItem();
	}

	@Test(priority = 9)
	public void readProductRateInWalmart() {
		walmartPage.getProductRateInWalmart();
	}

	@BeforeMethod
	public void setup() {
		walmartPage = new WalmartPage();
		amazonPage = new AmazonPage();
		walmartPage = amazonPage.navigateToWalmart();
	}

	/*
	 * @Test(priority = 10) public void compareRatesAndRultDisplay() {
	 * walmartPage.ratesCompare(); }
	 */
}
