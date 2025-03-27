package com.toyota.gpt.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "@target/rerun.txt", // Points to the failed tests recorded
        glue = "com.toyota.gpt.stepDefinitions",
        plugin = {
                "pretty",
                "json:target/cucumber-reports-failed.json"
        },
        monochrome = true)

public class FailedTestRunner extends AbstractTestNGCucumberTests {

}
