package com.lin.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.lin.stepDefinitions",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html", "json:target/cucumber-report/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//                "com.lin.test.framework.report.CustomExtentReportAdapter"
        },
        monochrome = true)
public class RunCucumberTest {
}
