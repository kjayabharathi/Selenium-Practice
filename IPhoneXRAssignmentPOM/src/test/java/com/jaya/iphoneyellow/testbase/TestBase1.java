package com.jaya.iphoneyellow.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.jaya.iphoneyellow.generics.GlobalConfigurations;
import com.jaya.iphoneyellow.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestBase1 {
	/*
	 * public static WebDriver driver; public ExtentReports report; public
	 * ExtentTest test; static GlobalConfigurations gConfigs;
	 * 
	 * public static double amazonProductRate; public static double
	 * walmartProductRate;
	 * 
	 * 
	 * public TestBase() {
	 * 
	 * }
	 * 
	 * @BeforeSuite public void beforeSuiteMethod() {
	 * 
	 * System.out.println(" Before Suite Method Execution...!"); gConfigs = new
	 * GlobalConfigurations();
	 * gConfigs.readPropertiesFile("./res/config/GlobalSettings.properties");
	 * System.out.println(" Peroperty value from file : " +
	 * gConfigs.properties.getProperty("url1"));
	 * 
	 * report = new ExtentReports("./reports/"+Utils.getUniqueID()+".html"); test =
	 * report.startTest("TestBase"); }
	 * 
	 * @AfterSuite public void afterSuiteMethod() {
	 * System.out.println("After suite"); report.flush(); }
	 * 
	 * @BeforeTest // @Parameters("browser") public static WebDriver
	 * getDriverInstance() {
	 * 
	 * // if (browser.equalsIgnoreCase("chrome")) { //
	 * System.setProperty("webdriver.chrome.driver",
	 * "./res/drivers/chromedriver.exe"); // driver = new ChromeDriver(); // } else
	 * if (browser.equalsIgnoreCase("firefox")) { //
	 * System.setProperty("webdriver.gecko.driver",
	 * "./res/drivers/geckodriver.exe"); // driver = new FirefoxDriver(); // } if
	 * (driver == null) { System.setProperty("webdriver.chrome.driver",
	 * "./res/drivers/chromedriver.exe"); driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * driver.get("https://www.healthcare.gov/see-plans/"); }
	 * 
	 * // driver.manage().window().maximize(); //
	 * driver.get(settings.properties.getProperty("AppURL")); return driver; }
	 * 
	 * @BeforeTest
	 * 
	 * @Parameters("browser") public static WebDriver getDriverInstance() {
	 * 
	 * if (browser.equalsIgnoreCase("chrome")) {
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * "./res/drivers/chromedriver.exe"); // driver = new ChromeDriver(); // } else
	 * if (browser.equalsIgnoreCase("firefox")) { //
	 * System.setProperty("webdriver.gecko.driver",
	 * "./res/drivers/geckodriver.exe"); // driver = new FirefoxDriver(); //
	 * 
	 * gConfigs = new GlobalConfigurations(); String browserName =
	 * gConfigs.readPropertiesFile(); prop.getProperty("browser");
	 * 
	 * if (browserName.equals("chrome")) {
	 * System.setProperty("webdriver.chrome.driver",
	 * "./resources/drivers/chromedriver.exe"); driver = new ChromeDriver(); } else
	 * if (browserName.equals("FF")) { System.setProperty("webdriver.gecko.driver",
	 * "./resources/drivers/geckodriver.exe"); driver = new FirefoxDriver(); }
	 * driver.get(prop.getProperty("url1")); driver.manage().window().maximize();
	 * return driver; } }
	 */
	/*
	 * @BeforeClass public void getReport() { report = new
	 * ExtentReports("./resources/reports/"+Utils.getUniqueID()+".html"); test =
	 * report.startTest("TestBase"); }
	 * 
	 * @AfterClass public void afterSuiteMethod() {
	 * System.out.println("After suite"); report.flush(); }
	 */
}
