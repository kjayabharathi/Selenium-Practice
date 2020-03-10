package com.jaya.iphoneyellow.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	

	// what happens if we don't mention the method as static?
	public static String getUniqueID() {

		SimpleDateFormat sd = new SimpleDateFormat("yyyymmddhhmmss");
		return sd.format(new Date());

	}

	public static String captureScreenShot(WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("./reports/images/" + getUniqueID() + ".png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
	}
	


	/*
	 * WebDriver driver; Wait<WebDriver> fluentWait;
	 * 
	 * public void explicitWait() { WebDriverWait wait = new WebDriverWait(driver,
	 * 20);
	 * 
	 * // wait.until(ExpectedConditions.) }
	 */
	

	public static void highlightElement(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
				"color: yellow; border: 3px solid red;");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
	}
	

}
