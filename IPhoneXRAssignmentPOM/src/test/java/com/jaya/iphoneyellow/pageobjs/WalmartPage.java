package com.jaya.iphoneyellow.pageobjs;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.jaya.iphoneyellow.testbase.TestBase;

public class WalmartPage extends TestBase {

	WebDriverWait wait = new WebDriverWait(driver, 20);
	Logger logger;
		
	public WalmartPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='global-search-input']")
	WebElement WalmartProductSearchTextbox;

	@FindBy(xpath = "//button[@id= 'global-search-submit']")
	WebElement WalmartSearchButton;

	@FindBy(xpath = "//span[text() = ' (T-Mobile) Refurbished A+']")
	WebElement WalmartSearchResultFirstItem;

//	@FindBy(xpath = "//span[@id= 'price']")
	@FindBy(xpath = "//span[@id= 'price']/div/span[1]/span/span[1]")
	WebElement WalmartSearchResultFirstItemRate;
	

	@FindBy(xpath = "//span[@id= 'price']")
	WebElement WalmartSearchResultFirstItemRate1;
	
	
	public void enterProductNameToSearchInWalmart() throws InterruptedException {
		Thread.sleep(5000);
//		WalmartLoginCloseButton.click();

		Assert.assertTrue(WalmartProductSearchTextbox.isDisplayed());
		WalmartProductSearchTextbox.sendKeys("iPhone XR (64GB) - Yellow");
	}

	public void clickOnSearchButtonInWalmart() {
		
		wait.until(ExpectedConditions.elementToBeClickable(WalmartSearchButton));
		
		/*
		 * try { Thread.sleep(5000); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */

		Assert.assertTrue(WalmartSearchButton.isEnabled());
		WalmartSearchButton.click();
	}

	public void clickOnSearchResultFirstItem() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WalmartSearchResultFirstItem.click();
	}
	
	public void getProductRateInWalmart() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
			String productRateInWalmart = WalmartSearchResultFirstItemRate.getText();
		
	//		System.out.println(" ===========>>>>>>> Walmart Rate : " + productRateInWalmart.replace("$", ""));
			String walmartRate = productRateInWalmart.replace("$", "");
			logger.debug("Walmart Rate");
			try {
				TestBase.walmartProductRate = Double.valueOf(walmartRate);
			} catch (Exception e) {
				e.printStackTrace();
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
