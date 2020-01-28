package com.jaya.bdd.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
//@CucumberOptions(features = "./res/features", glue = { "com.jaya.bdd.steps" }, plugin = { "pretty",
//		"html:res/testreports/cucumber-reports" }, monochrome = true, tags = {})
@CucumberOptions(features = "./res/features", glue = { "com.jaya.bdd.steps" }, plugin = { "pretty",
		 "json:target/cucumber-report-html/cucumber.json" }, monochrome = true, tags = {"@LoginWithNegativeFlow"})
public class TestRunner extends AbstractTestNGCucumberTests {
	// *******  use of com.jaya.bdd.config.GlobalSettings.class  ********
}
