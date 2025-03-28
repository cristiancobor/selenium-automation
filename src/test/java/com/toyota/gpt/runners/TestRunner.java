package com.toyota.gpt.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.toyota.gpt.stepDefinitions",
        plugin = {"pretty",
                "json:target/cucumber-reports.json",
                "rerun:target/rerun.txt"  // Save failed tests
        },
        monochrome = true,
        tags = "@Positive or @Negative"
)

public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
