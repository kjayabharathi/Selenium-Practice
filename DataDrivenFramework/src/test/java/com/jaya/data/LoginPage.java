package com.jaya.data;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.jaya.utils.Utils;

public class LoginPage extends TestBase {

	@Test(priority = 1)
	public void clickLogin() {
		WebElement logIn = driver.findElement(or.getbjectLocator("LoginValue"));
		Utils.highlightElement(logIn, driver);
		logIn.click();
	}

	@Test
	public void enterUserName() {
		WebElement userName = driver.findElement(or.getbjectLocator("UsernameValue"));
		Utils.highlightElement(userName, driver);
		userName.sendKeys("");
	}

	@Test
	public void enterPassword() {
		WebElement loginPassword = driver.findElement(or.getbjectLocator("PasswordValue"));
		Utils.highlightElement(loginPassword, driver);
		loginPassword.sendKeys("");
	}

	@Test
	public void clickButton() {
		WebElement loginButton = driver.findElement(or.getbjectLocator("ButtonValue"));
		Utils.highlightElement(loginButton, driver);
		if (loginButton.isEnabled()) {
			assertTrue(true);
		}
		loginButton.click();

	}

}
