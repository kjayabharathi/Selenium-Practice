package org.mp.planselection.pages;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SaucelabsExample {

	public static final String USERNAME = "kjayabharathi";
	public static final String ACCESS_KEY = "c2030ade-8a1d-430b-b79f-d1dd0d08e02e";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

	public static void main(String[] args) {

		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 8.1");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("version", "77");

		try {
			System.out.println(" Remote URL Value  : "+URL);
			WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
			driver.get("https://www.google.com/");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
