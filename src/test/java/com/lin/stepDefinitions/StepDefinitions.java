package com.lin.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;


public class StepDefinitions extends BaseStepDefinitions {
    private int a;
    private int b;
    private int result;

    @Given("I have two numbers {string} and {string}")
    public void i_have_two_numbers_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(service1());
        this.a=Integer.valueOf(string);
        this.b=Integer.valueOf(string2);
    }
    @When("I add them")
    public void i_add_them() {
        // Write code here that turns the phrase above into concrete actions
        this.result=a+b;
    }
    @Then("I should get {string}")
    public void i_should_get(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        assertThat(result).isEqualByComparingTo(Integer.valueOf(string));
    }
}
