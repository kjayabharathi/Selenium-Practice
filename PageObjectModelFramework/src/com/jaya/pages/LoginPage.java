package com.jaya.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	public WebDriver driver;
	
	
	@FindBy(xpath = "//input[@id = 'autocomplete_2']")
	WebElement zipCodeText;

	@FindBy(xpath = "//li[@id = 'downshift-0-item-0']")
	WebElement searchResultSelection;

	@FindBy(xpath = "//button[text() ='Continue']")
	WebElement conitnueButton;
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterZipCodeText(String zipCodeValue) {
		zipCodeText.sendKeys(zipCodeValue);
	} 

	public void clickResultDropDown() throws InterruptedException {
		Thread.sleep(3000);
		searchResultSelection.click();
	}

	public void clickOnContinueButton() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(conitnueButton.isEnabled());

		if (conitnueButton.isEnabled()) {
			conitnueButton.click();
		} else {
			System.out.println("Continue button is not enabled...!");
		}

	}

}
