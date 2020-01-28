package org.mp.planselection.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {
	
	WebDriver driver;
	Wait<WebDriver> fluentWait;
	
	public void explicitWait() {
	WebDriverWait wait = new WebDriverWait(driver, 20);
	
//	wait.until(ExpectedConditions.)
	
	}
}
