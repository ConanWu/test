package com.lin.stepDefinitions;

import com.lin.test.framework.AbstractStepDefinition;
import io.cucumber.spring.CucumberContextConfiguration;

/*
@CucumberContextConfiguration注解来指定Spring的配置类。
这个注解是Cucumber特定的，用于在Cucumber测试中指定Spring的上下文配置。
需要配置在glue文件中或者指定在runner文件中
*/
@CucumberContextConfiguration
public class BaseStepDefinitions extends AbstractStepDefinition {
}
