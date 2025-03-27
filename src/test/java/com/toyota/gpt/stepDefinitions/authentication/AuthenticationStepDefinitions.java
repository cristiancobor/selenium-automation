package com.toyota.gpt.stepDefinitions.authentication;

import com.toyota.gpt.stepDefinitions.Hooks;
import com.toyota.gpt.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.toyota.gpt.pages.AuthenticationPage;
import com.toyota.gpt.pages.ToyotaGptPage;

import static org.testng.Assert.assertTrue;

public class AuthenticationStepDefinitions {

    private final ToyotaGptPage toyotaGptPage;
    private final AuthenticationPage authenticationPage;

    public AuthenticationStepDefinitions() {
        WebDriver driver = Hooks.driver;
        this.authenticationPage = new AuthenticationPage(driver);
        this.toyotaGptPage = new ToyotaGptPage(driver);
    }

    @Given("the user is on the authentication page")
    public void openAuthenticationPage() {
        authenticationPage.visitAuthenticationPage();
    }

    @When("the user enters valid credentials")
    public void loginWithValidCredentials() {
        login(ConfigReader.getProperty("VALID_USERNAME"), ConfigReader.getProperty("VALID_PASSWORD"));
    }

    @When("the user enters invalid credentials")
    public void loginWithInvalidCredentials() {
        login(ConfigReader.getProperty("VALID_USERNAME"), ConfigReader.getProperty("INVALID_PASSWORD"));
    }

    @When("the user leaves the email field empty")
    public void loginWithEmptyEmail() {
        authenticationPage.typeUserEmail(ConfigReader.getProperty("EMPTY_USERNAME"));
    }

    @When("the user enters a valid email but leaves the password field empty")
    public void loginWithEmptyPassword() {
        login(ConfigReader.getProperty("VALID_USERNAME"), ConfigReader.getProperty("EMPTY_PASSWORD"));
    }

    @When("the user clicks the Logout button")
    public void logout() throws InterruptedException {
        toyotaGptPage.logout();
        Thread.sleep(5000);
    }

    @Then("the user should be redirected to the dashboard")
    public void verifyDashboardPage() {
        verifyPageTitle(toyotaGptPage.getPageTitle(), "Toyota GPT");
    }

    @Then("the user should be redirected to the auth page and see {string} status")
    public void verifyUserIsLoggedOut(String title) {
        verifyPageTitle(authenticationPage.getPageTitle(), title);
    }

    @Then("the user should see {string} in the page title")
    public void verifyPageTitle(String expectedTitle) {
        verifyPageTitle(toyotaGptPage.getPageTitle(), expectedTitle);
    }

    @Then("the user should see an error message stating {string}")
    public void verifyErrorMessage(String expectedMessage) {
        WebElement errorElement = expectedMessage.contains("email") || expectedMessage.contains("Skype name")
                ? authenticationPage.getEmailErrorElement()
                : authenticationPage.getPasswordErrorElement();

        assertTrue(errorElement.isDisplayed(), "Error message is not displayed.");
        assertTrue(errorElement.getText().contains(expectedMessage),
                "Expected error message: '" + expectedMessage + "' but got: '" + errorElement.getText() + "'.");
    }

    private void login(String username, String password) {
        authenticationPage.login(username, password);
    }


    private void verifyPageTitle(String actualTitle, String expectedTitle) {
        assertTrue(actualTitle.contains(expectedTitle),
                "Expected page title to contain: '" + expectedTitle + "' but got: '" + actualTitle + "'.");
    }
}
