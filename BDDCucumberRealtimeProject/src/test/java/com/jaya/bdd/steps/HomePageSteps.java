package com.jaya.bdd.steps;

import org.openqa.selenium.WebDriver;

import com.jaya.bdd.pages.HomePage;
import com.jaya.bdd.testbase.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

	WebDriver driver;
	HomePage homepage = new HomePage(TestBase.getDriverInstance());

//	@Given("User is able to login to their account")
//	public void user_is_able_to_login_to_their_account() {
//
//	}
//
//	@When("User is able to find his name on the top right corner of application")
//	public void user_is_able_to_find_his_name_on_the_top_right_corner_of_application() {
//
//		homepage.VerifyHeaderDisplayed();
//
//	}
//
//	@Then("verify the name of the user")
//	public void verify_the_name_of_the_user() {
//
//		homepage.verifyHeaderName("Narayana");
//	}
//
//	@When("User locates {String} link to appear and click on it")
//	public void user_locates_link_to_appear_and_click_on_it() {
//
//		homepage.FindMyAppLink();
//
//	}
//
//	@Then("User navigates to the next page of appliation")
//	public void user_navigates_to_the_next_page_of_appliation() {
//
//	}

	/*
	 * @Given("I want to write a step with name{int}") public void
	 * i_want_to_write_a_step_with_name(Integer int1) { // Write code here that
	 * turns the phrase above into concrete actions throw new
	 * cucumber.api.PendingException(); }
	 * 
	 * @When("I check for the {int} in step") public void
	 * i_check_for_the_in_step(Integer int1) { // Write code here that turns the
	 * phrase above into concrete actions throw new cucumber.api.PendingException();
	 * }
	 * 
	 * @Then("I verify the success in step") public void
	 * i_verify_the_success_in_step() { // Write code here that turns the phrase
	 * above into concrete actions throw new cucumber.api.PendingException(); }
	 * 
	 * @Then("I verify the Fail in step") public void i_verify_the_Fail_in_step() {
	 * // Write code here that turns the phrase above into concrete actions throw
	 * new cucumber.api.PendingException(); }
	 */

}
