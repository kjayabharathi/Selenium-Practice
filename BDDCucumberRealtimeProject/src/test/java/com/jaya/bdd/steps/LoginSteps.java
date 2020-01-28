package com.jaya.bdd.steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.jaya.bdd.pages.LoginPage;
import com.jaya.bdd.testbase.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {

	WebDriver driver = TestBase.getDriverInstance();

	LoginPage login = new LoginPage(driver);

	@Given("user is launched Govt Health Application")
	public void user_is_launched_Govt_Health_Application() {
//		Assert.assertTrue(login.launchTheApplication());
		
		login.launchTheApplication();
		System.out.println("Launched the application");
	}


	@Then("user enters username as (.*) and password as (.*) in the respecetive fields")
	public void user_enters_username_as_name_and_password_as_in_the_respecetive_fields(String userName,
			String password) {
		login.enterCrednetils(userName, password);
	}

	@Then("user click on login button in the login page")
	public void user_click_on_login_button_in_the_login_page() {

		login.clickedLoginButton();
	}

	@Then("user should land on home page of the application")
	public void user_should_land_on_home_page_of_the_application() {

	}

	@Then("user search for the location by entering zipcode (.*)")
	public void user_search_for_the_location_by_entering_zipcode(String zipcode) {

//		System.out.println("zipcode NAME FROM FILE : " + zipcode);
	}

	@Then("user selects the zip code from the dropdown")
	public void user_selects_the_zip_code_from_the_dropdown() {

	}

	@Then("user click on continue button on the home page")
	public void user_click_on_continue_button_on_the_home_page() {

	}

	@Then("verify that the user has landed on information page")
	public void verify_that_the_user_has_landed_on_information_page() {

//		System.out.println("verify that the user has landed on information page");
	}

	@Then("verify the UI components of the page")
	public void verify_the_UI_components_of_the_page() {

	}

	@Then("user close the application")
	public void user_close_the_application() {
		login.tearDowm();
	}


}
