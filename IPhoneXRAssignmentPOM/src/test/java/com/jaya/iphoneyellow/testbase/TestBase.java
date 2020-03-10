package com.jaya.iphoneyellow.testbase;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.jaya.iphoneyellow.generics.GlobalConfigurations;
import com.jaya.iphoneyellow.pageobjs.AmazonPage;
import com.jaya.iphoneyellow.pageobjs.WalmartPage;
import com.jaya.iphoneyellow.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestBase {

	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	static GlobalConfigurations gConfigs;

	public static double amazonProductRate;
	public static double walmartProductRate;
	static Logger logger;

	@BeforeTest
	public static WebDriver getDriverInstance() {

	    logger = Logger.getLogger(TestBase.class);
		gConfigs = new GlobalConfigurations();
		gConfigs.readPropertiesFile("./resources/configs/GlobalSettings.properties");
		String amazonURL = gConfigs.properties.getProperty("url1");
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "./resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(amazonURL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			logger.debug("********");
			
			report = new ExtentReports("./resources/reports/" + Utils.getUniqueID() + ".html");
			test = report.startTest("TestBase");
			
		}
		return driver;
	}
	
	/*
	 * @BeforeClass public AmazonPage navigateToAmazon() { return new AmazonPage();
	 * }
	 */


	@AfterTest
	public void extentReports() {

		// driver.close();
		logger.debug("Reports are generated");
	}

	@AfterSuite
	public void afterSuiteMethod() {
		logger.debug("After Suite");
//		System.out.println("After suite");
		report.flush();
	}

}
