package com.toyota.gpt.stepDefinitions;

import com.toyota.gpt.utils.ConfigReader;
import com.toyota.gpt.utils.WebDriverManagerUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Hooks {
    private static final Logger logger = Logger.getLogger(Hooks.class);
    public static WebDriver driver;

    @Before
    public void setup() {
        logger.info("Initializing WebDriver...");
        driver = WebDriverManagerUtil.getDriver();
        if (driver == null) {
            throw new RuntimeException("WebDriver is not initialized");
        }
        String baseUrl = ConfigReader.getBaseUrl();
        if (baseUrl == null || baseUrl.isEmpty()) {
            throw new RuntimeException("Base URL is not set");
        }

        driver.get(baseUrl);
        logger.info("Base URL set to: " + baseUrl);
    }

    @After
    public void teardown() {
        logger.info("Closing WebDriver...");
        WebDriverManagerUtil.quitDriver();
    }
}
