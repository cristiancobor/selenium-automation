package com.toyota.gpt.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class WebDriverManagerUtil {
    private static WebDriver driver;
    private static final Logger logger = Logger.getLogger(WebDriverManagerUtil.class);

    public static WebDriver getDriver() {
        if (driver == null) {
            String browser = ConfigReader.getProperty("browser");
            logger.info("Initializing WebDriver for browser: " + browser);

            switch (browser.toLowerCase()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                default:
                    logger.error("Invalid browser specified: " + browser);
                    throw new RuntimeException("Invalid browser specified in config.properties");
            }

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            logger.info("WebDriver initialized successfully.");
        }
        return driver;
    }
    public static void quitDriver() {
        if (driver != null) {
            logger.info("Closing WebDriver...");
            driver.quit();
            driver = null;
            logger.info("WebDriver closed successfully.");
        }
    }
}
