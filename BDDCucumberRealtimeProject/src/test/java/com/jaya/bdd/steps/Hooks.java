package com.jaya.bdd.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.jaya.bdd.testbase.TestBase;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

	@BeforeStep
	public void beforeStep() {
		System.out.println("============ Before Step ==============");
	}

	@AfterStep
	public void afterStep(Scenario scenario) throws InterruptedException {
		System.out.println("============ After Step ==============");
		
		if (scenario.isFailed()) {
			try {
				byte[] screenShot = ((TakesScreenshot) TestBase.driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenShot, "image/png");
			} catch (WebDriverException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Before
	public void beforeScenario() {
		System.out.println("============ Before Sceanrio ==============");
	}

	@After
	public void afterScenario() {
		System.out.println("============ After Scenario ==============");
	}
}
