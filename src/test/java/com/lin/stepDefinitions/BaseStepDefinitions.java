package com.lin.stepDefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.lin.test.framework.AbstractStepDefinition;
import com.lin.test.framework.report.CustomExtentReportAdapter;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;

/*
@CucumberContextConfiguration注解来指定Spring的配置类。
这个注解是Cucumber特定的，用于在Cucumber测试中指定Spring的上下文配置。
需要配置在glue文件中或者指定在runner文件中
*/
@CucumberContextConfiguration
public class BaseStepDefinitions extends AbstractStepDefinition {
    protected ExtentTest extentTest = ExtentCucumberAdapter.getCurrentScenario();

}
