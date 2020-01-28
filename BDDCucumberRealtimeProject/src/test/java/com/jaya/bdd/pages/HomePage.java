package com.jaya.bdd.pages;

import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

	public WebDriver driver;

	
	
	@FindBy(xpath = "//a[@id = 'linkToCCRApplication']")
	WebElement findAppLink;

	@FindBy(xpath = "//span[@id = 'headerUserName']")
	WebElement headerName;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyHeaderDisplayed() {

		if (headerName.isDisplayed()) {
			assertTrue(true);
		} else {
			System.out.println("Name is not displayed");
		}
	}
	
	public void verifyHeaderName(String UserName) {
		

		if (headerName.equals(UserName)) {
			assertTrue(true);
		} else {
			System.out.println("Wrong username in header");
		}

		
	}
	
	public void FindMyAppLink() {
	
		if(findAppLink.isDisplayed()) {
			assertTrue(true);
			findAppLink.click();
		} else {
			System.out.println("Find Application link is not appeared");
		}
				
		findAppLink.click();
	}
	

	
//	public void landOnHomePage() {
//		
//		headerLoginButton.click();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	}
//
//	public void enterCrednetils(String userName, String password) {
//
//		userNameField.clear();
//		passwordField.clear();
//
//		userNameField.sendKeys(userName);
//		passwordField.sendKeys(password);
//	}
//
//	public void clickedLoginButton() {
//		loginButton.click();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	}
//	public void enterZipCodeText(String zipCodeValue) {
//		zipCodeText.sendKeys(zipCodeValue);
//	}
//
//	public void clickResultDropDown() throws InterruptedException {
//		Thread.sleep(3000);
//		searchResultSelection.click();
//	}
//
//	public void clickOnContinueButton() throws InterruptedException {
//		Thread.sleep(3000);
//		Assert.assertTrue(conitnueButton.isEnabled());
//
//		if (conitnueButton.isEnabled()) {
//			conitnueButton.click();
//		} else {
//			System.out.println("Continue button is not enabled...!");
//		}
//
//	}

	
}
