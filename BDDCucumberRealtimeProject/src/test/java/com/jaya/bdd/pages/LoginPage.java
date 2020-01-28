package com.jaya.bdd.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	public WebDriver driver;
	public Properties properties;
	public FileInputStream fis;

	@FindBy(xpath = "//input[@id = 'autocomplete_2']")
	WebElement zipCodeText;

	@FindBy(xpath = "//li[@id = 'downshift-0-item-0']")
	WebElement searchResultSelection;

	@FindBy(xpath = "//button[text() ='Continue']")
	WebElement conitnueButton;

	@FindBy(xpath = "//input[starts-with(@id, 'Password-aria-id')]")
	WebElement passwordField;

	@FindBy(xpath = "//input[starts-with(@id, 'Username-aria-id')]")
	WebElement userNameField;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean launchTheApplication() {
		try {
			properties = new Properties();
			fis = new FileInputStream("./res/config/GlobalSettings.properties");
			properties.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.get(properties.getProperty("AppURL"));
		return false;

	}

	

	public void enterCrednetils(String userName, String password) {

		userNameField.clear();
		passwordField.clear();

		userNameField.sendKeys(userName);
		passwordField.sendKeys(password);
	}

	public void clickedLoginButton() {
		Assert.assertTrue(loginButton.isEnabled());
		loginButton.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
	
	public void tearDowm() {
//		driver.close();
//		driver = null;
	}
	

}
