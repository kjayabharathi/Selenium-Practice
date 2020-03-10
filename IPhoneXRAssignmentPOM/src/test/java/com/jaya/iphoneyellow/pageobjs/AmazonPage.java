package com.jaya.iphoneyellow.pageobjs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.jaya.iphoneyellow.testbase.TestBase;

public class AmazonPage extends TestBase {

	public AmazonPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id = 'twotabsearchtextbox']")
	WebElement productSearchTextbox;

	@FindBy(xpath = "//*[@id='nav-search']/form/div[2]/div/input")
	WebElement searchButton;

//	@FindBy(xpath = "//*[@id='search']/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div")
	@FindBy(partialLinkText = "Apple iPhone XR, 64GB, Yellow - For Sprint (Renewed)")
	WebElement searchResultFirstItem;

	@FindBy(xpath = "//span[@id = 'priceblock_ourprice']")
	WebElement searchResultFirstItemRateinAmazon;

	@FindBy(xpath = "//span[@id = 'priceblock_ourprice']")
	WebElement searchResultFirstItemRateinAmazon1;

	public void enterProductNameToSearch() {

		Assert.assertTrue(productSearchTextbox.isDisplayed());
		productSearchTextbox.sendKeys("iPhone XR Yellow");

	}

	public void clickOnSearchButton() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(searchButton.isEnabled());
		searchButton.click();
	}

	public void clickOnSearchResultFirstItem() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (searchResultFirstItem.getText().equalsIgnoreCase("Apple iPhone XR, 64GB, Yellow - For Sprint (Renewed)")) {

			Assert.assertTrue(true);
//			 logger.
			searchResultFirstItem.click();

		} else {
//			logger.
		}
	}

	public void getProductRateinAmazon() {
		try {
			String productRateInAmazon = searchResultFirstItemRateinAmazon.getText();
			System.out.println(" ===========>>>>>>> Amazon Rate : " + productRateInAmazon);
			TestBase.amazonProductRate = Double.valueOf(productRateInAmazon.replace("$", ""));
		} catch (Exception e) {
			String productRateInAmazon1 = searchResultFirstItemRateinAmazon1.getText();
			System.out.println(" ===========>>>>>>> Amazon Rate : " + productRateInAmazon1);
			TestBase.amazonProductRate = Double.valueOf(productRateInAmazon1.replace("$", ""));
		}

	}

	public WalmartPage navigateToWalmart() {
		return new WalmartPage();

	}

}
