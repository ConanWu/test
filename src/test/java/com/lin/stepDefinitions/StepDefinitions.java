package com.lin.stepDefinitions;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.lin.test.framework.report.CustomExtentReportAdapter;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;


public class StepDefinitions extends BaseStepDefinitions {
    private int a;
    private int b;
    private int result;

    @Given("I have two numbers")
    public void i_have_two_numbers_and(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        Map<String, String> input = dataTable.asMap();
        System.out.println(service1());
        this.a=Integer.valueOf(input.get("a"));
        this.b=Integer.valueOf(input.get("b"));
        CustomExtentReportAdapter adapter = new CustomExtentReportAdapter();
//        extentTest.info("asdffasdfasdaaaaaaaaaaaaaaaaaaaaaaaa");
        ExtentCucumberAdapter.addTestStepLog("thisissisidfasd");

    }

    @When("I add them")
    public void i_add_them() {
        // Write code here that turns the phrase above into concrete actions
        this.result=a+b;
    }
    @Then("I should get the sum")
    public void i_should_get() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        assertThat(result).isEqualByComparingTo(Integer.valueOf(9));
    }
}
