package com.jaya.bdd.steps;

import org.openqa.selenium.WebDriver;

import com.jaya.bdd.pages.LandingPage;
import com.jaya.bdd.testbase.TestBase;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageSteps {

	
	WebDriver driver = TestBase.getDriverInstance();

	LandingPage landing = new LandingPage(driver);
	
	@When("user landed on login page of the application")
	public void user_landed_on_login_page_of_the_application() {
		landing.headerLoginButttonClick();
	}
	
	@Then("user logged out from the application")
	public void user_logged_out_from_the_application() {
		landing.loggedOut();
	}
}

