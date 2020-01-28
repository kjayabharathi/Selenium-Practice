package com.jaya.bdd.testbase;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.jaya.bdd.config.GlobalSettings;

public class TestBase {

	public static WebDriver driver;
	public static GlobalSettings settings;

	public static final String USERNAME = "kjayabharathi";
	public static final String ACCESS_KEY = "c2030ade-8a1d-430b-b79f-d1dd0d08e02e";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	public static String runMode;

	public void beforeSuiteMethod() {
		System.out.println(" Before Suite Method Execution...!");
		settings = new GlobalSettings();
		settings.readGlobalSettings("./res/config/GlobalSettings.properties");
		System.out.println(" Peroperty value from file : " + settings.properties.getProperty("AppURL"));
		runMode = settings.properties.getProperty("RunMode");
	}

	/*
	 * // it is a singleton pattern which creates an object and uses as a single
	 * reference for every execution instead // creating an object for every
	 * execution which is for memory saving public static RespositoryParser
	 * getInstance(String repositoryFile) { if (parserInstance == null) try {
	 * parserInstance = new RespositoryParser(repositoryFile); } catch (IOException
	 * e) { e.printStackTrace(); } return parserInstance; }
	 * 
	 */

//	@ Before
//	@After
	public void afterSuiteMethod() {
		System.out.println("After suite");
	}

	public static WebDriver getDriverInstance() {

		if (driver == null) {
			if (runMode.equalsIgnoreCase("Local")) {

				runningThroughLocalConfig();
				System.out.println(" Scripts are running local...!");

			} else if (runMode.equalsIgnoreCase("Remote")) {
				sauceLabConfig();
				System.out.println(" Scripts are running remote ...!");
			}
		}

		return driver;
	}

	public void aftereTestMethod() {
		System.out.println(" After Test Method Execution...!");
	}

	public static void sauceLabConfig() {
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 8.1");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("version", "77");
		caps.setCapability("build", "build-1234");
		caps.setCapability("test", "Cucumber Test");

		try {
			driver = new RemoteWebDriver(new URL(URL), caps);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public static void runningThroughLocalConfig() {
		System.setProperty("webdriver.chrome.driver", "./res/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
