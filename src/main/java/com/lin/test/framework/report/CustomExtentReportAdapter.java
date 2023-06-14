package com.lin.test.framework.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.EventListener;
import io.cucumber.plugin.event.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.File;

/**
使用@Component，并使用@Scope注解来指定作用域。你可以选择singleton作用域，这样在整个应用程序的生命周期内只会创建
一个CustomExtentReportAdapter实例，或者选择prototype作用域，这样每次注入时都会创建一个新的实例。
 * **/
@Component
@Scope("prototype")
public class CustomExtentReportAdapter implements ConcurrentEventListener {

    private ExtentReports extent;
    private ExtentTest currentTest;
    private ExtentHtmlReporter extentHtmlReporter;
    private ExtentSparkReporter extentSparkReporter;

    @Override
    public void setEventPublisher(EventPublisher publisher) {
        publisher.registerHandlerFor(TestRunStarted.class, this::handleTestRunStarted);
        publisher.registerHandlerFor(TestRunFinished.class, this::handleTestRunFinished);
        publisher.registerHandlerFor(TestCaseStarted.class, this::handleTestCaseStarted);
        publisher.registerHandlerFor(TestCaseFinished.class, this::handleTestCaseFinished);
        publisher.registerHandlerFor(TestStepStarted.class, this::handleTestStepStarted);
        publisher.registerHandlerFor(TestStepFinished.class, this::handleTestStepFinished);

    }

    private void handleTestRunStarted(TestRunStarted event) {
        extent = new ExtentReports();
        File file = new File("test-output/SparkReport/Spark4.html");
        extentSparkReporter = new ExtentSparkReporter(file);
        extentHtmlReporter = new ExtentHtmlReporter("test-output/SparkReport/Spark2.html");
        // 指定自定义CSS样式
//        extentHtmlReporter.config().setCss("E:\\moving\\GIT\\test\\src\\main\\resources\\extent.css");

        extentHtmlReporter.config().enableOfflineMode(true);
        extentSparkReporter.config().enableOfflineMode(true);
        extent.attachReporter(extentSparkReporter);
//        extent.setReportUsesManualConfiguration(true);
        // 在测试运行开始时初始化ExtentReports对象
    }

    private void handleTestRunFinished(TestRunFinished event) {
        extent.flush();
        // 在测试运行结束时刷新ExtentReports对象并生成报告
    }

    private void handleTestCaseStarted(TestCaseStarted event) {
        currentTest = extent.createTest(event.getTestCase().getName());
        // 在每个测试用例开始时创建ExtentTest对象
    }

    private void handleTestCaseFinished(TestCaseFinished event) {
        // 在每个测试用例结束时更新测试结果等信息
        if (event.getResult().getStatus().is(Status.PASSED)) {
            currentTest.pass("Test passed");
        } else if (event.getResult().getStatus().is(Status.FAILED)) {
            currentTest.fail("Test failed");
        }
    }

    private void handleTestStepStarted(TestStepStarted event) {
        // 在每个测试步骤开始时记录信息
    }

    private void handleTestStepFinished(TestStepFinished event) {
        // 在每个测试步骤结束时记录信息
    }

    public ExtentTest getCurrentTest() {
        return currentTest;
    }
}
