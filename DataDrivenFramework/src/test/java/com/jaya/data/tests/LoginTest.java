package com.jaya.data.tests;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jaya.data.TestBase;

public class LoginTest extends TestBase {
	
	String filePath = "./res/data/TestData.xlsx";
	FileInputStream orFile;

	@DataProvider(name = "testData")
	public Object[][] dataSource() {
		return getData(filePath, "Sheet1");
	}

	@Test(priority = 1, dataProvider = "testData")
	public void doLogin(String username, String password) throws Exception {
		System.out.println("variable1:-" + username);
		System.out.println("variable2:-" + password);

		try {
			driver.findElement(or.getbjectLocator("PopupCloseButton")).click();
		} catch (Exception e) {
			System.out.println("Login Pop up is not showing");
		}
		
		driver.findElement(or.getbjectLocator("LoginValue")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement userNameField = driver.findElement(or.getbjectLocator("UsernameValue"));
		WebElement passwordField = driver.findElement(or.getbjectLocator("PasswordValue"));

		userNameField.clear();
		passwordField.clear();

		userNameField.sendKeys(username);
		passwordField.sendKeys(password);

		driver.findElement(or.getbjectLocator("LoginButtonValue")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(or.getbjectLocator("LogoutButton")).click();

	}


}
