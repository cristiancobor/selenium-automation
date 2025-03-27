package com.toyota.gpt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AuthenticationPage extends BasePage {

    @FindBy(id = "i0116")  // Email input field
    private WebElement emailBox;

    @FindBy(id = "idSIButton9")  // Next button
    private WebElement nextButton;

    @FindBy(id = "i0118")  // Password input field
    private WebElement passwordBox;

    @FindBy(id = "idSIButton9")  // Sign-in button (same as next)
    private WebElement signInButton;

    @FindBy(id = "passwordError")
    private WebElement passwordError;

    @FindBy(id = "usernameError")
    private WebElement emailError;

    @FindBy(id = "loginHeader")
    private WebElement loginHeader;

    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password) {

        enterText(emailBox, email);
        click(nextButton);
        waitForElement(passwordBox);
        enterText(passwordBox, password);
        click(signInButton);


    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public WebElement getLoginHeader(){
       return loginHeader;
    }

    public void typeUserEmail(String email) {
        enterText(emailBox, email);
        click(nextButton);
    }

    public WebElement getPasswordErrorElement() {
        return wait.until(ExpectedConditions.visibilityOf(passwordError));
    }

    public WebElement getEmailErrorElement() {
        return wait.until(ExpectedConditions.visibilityOf(emailError));
    }

    public void waitForPageToLoad() {
        wait.until(ExpectedConditions.urlContains("login"));
    }
}
