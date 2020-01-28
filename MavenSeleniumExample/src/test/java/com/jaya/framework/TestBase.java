package com.jaya.framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.jaya.framework.utils.RespositoryParser;

public class TestBase {

	public WebDriver driver;
	public Properties properties;
//	public Properties or;
	public FileInputStream fis;
	public RespositoryParser or;

	@BeforeSuite
	public void beforeSuiteMethod() {

	}

	@AfterSuite
	public void afterSuiteMethod() {
		System.out.println(" After Suite Method Execution...!");
	}

	@BeforeTest
	@Parameters("browser")
	public void beforeTestMethod(String browser) {
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

		or = RespositoryParser.getInstance("./src/test/java/com/jaya/framework/or/OR.properties");
		
//		try {
//			or = new Properties();
//			fis = new FileInputStream("./src/test/java/com/jaya/framework/or/OR.properties");
//			or.load(fis);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./res/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./res/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		System.out.println(" Peroperty value from file : " + properties.getProperty("AppURL"));
		driver.get(properties.getProperty("AppURL"));
//		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

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
