package com.jaya.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.jaya.config.GlobalSettings;
import com.jaya.utils.Util;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestBase {

	public static WebDriver driver;
	public static GlobalSettings settings;
	public static ExtentReports report;
	public ExtentTest test;

	@BeforeSuite
	public void beforeSuiteMethod() {

		System.out.println(" Before Suite Method Execution...!");
		settings = new GlobalSettings();
		settings.readGlobalSettings("./res/config/GlobalSettings.properties");
		System.out.println(" Peroperty value from file : " + settings.properties.getProperty("AppURL"));
		
		report = new ExtentReports("./reports/"+Util.getUniqueID()+".html");
		test = report.startTest("TestBase");
	}

	@AfterSuite
	public void afterSuiteMethod() {
		System.out.println("After suite");
		report.flush();
	}

//	@BeforeTest
//	@Parameters("browser")
	public static WebDriver getDriverInstance() {

//		if (browser.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "./res/drivers/chromedriver.exe");
//			driver = new ChromeDriver();
//		} else if (browser.equalsIgnoreCase("firefox")) {
//			System.setProperty("webdriver.gecko.driver", "./res/drivers/geckodriver.exe");
//			driver = new FirefoxDriver();
//		}
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "./res/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.healthcare.gov/see-plans/");	
		}

//		driver.manage().window().maximize();
//		driver.get(settings.properties.getProperty("AppURL"));
		return driver;
	}

	@AfterTest
	public void aftereTestMethod() {
		System.out.println(" After Test Method Execution...!");
//		driver.close();
	}

	@BeforeClass
	public void beforeClassMethod() {
		System.out.println(" Before Class Method Execution...!");
	}

	@AfterClass
	public void afterClassMethod() {
		System.out.println(" After Class Method Execution...!");
	}

}
