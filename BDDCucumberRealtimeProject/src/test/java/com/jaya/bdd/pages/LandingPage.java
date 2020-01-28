package com.jaya.bdd.pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	WebDriver driver;

	@FindBy(xpath = "//a[text() = 'Log in']")
	WebElement headerLoginButton;

	@FindBy(xpath = "//button[@class='prefix-overlay-close prefix-overlay-action-later']")
	WebElement overLayCrossButton;
	
	@FindBy(xpath = "//a[@id ='logout']")
	WebElement loggedOutButton;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void headerLoginButttonClick() {
		try {
			overLayCrossButton.click();
		} catch (Exception e) {
			System.out.println("Login Pop up is not showing");
		}

		headerLoginButton.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}

	public void loggedOut() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Assert.assertTrue(true);
		executor.executeScript("arguments[0].click();", loggedOutButton);
	}
}
