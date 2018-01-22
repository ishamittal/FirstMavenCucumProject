package com.test.java;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstJavaClass {

	@Given("^all the plugins$")
	public void all_the_plugins() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("plugins check");
	}

	@Given("^some other precondition$")
	public void some_other_precondition() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("preconditions check");
	}

	@When("^I write first program$")
	public void i_write_first_program() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("first program done");
	}

	@Then("^I get the desired outcome$")
	public void i_get_the_desired_outcome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("outcome validated");
	}

	@Then("^print the result$")
	public void print_the_result() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Pass");
	}


}
