package org.mp.planselection.testbase;

import java.util.concurrent.TimeUnit;

import org.mp.planselection.config.GlobalSettings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestBase {

	public static WebDriver driver;
	public static GlobalSettings settings;
	Select select;
	
	public void loadAppUrl() {
		
		settings = new GlobalSettings();
		settings.readGlobalSetting("./resources/config/GlobalSettings.properties");
		System.out.println("Application URL is: "+ settings.properties.getProperty("AppURL"));
		
	}
	
	public static WebDriver getDriverInstance(WebDriver driver) {
		
		if(driver==null) {
			
			System.setProperty("webdriver.chrome.driver", "./resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			/*
			 * Implicitwait WebDriverWait wait = new WebDriverWait(driver, 20);
			 */
		
		}
				
		return driver;
	}

		
}
