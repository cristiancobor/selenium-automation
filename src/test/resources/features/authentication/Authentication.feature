Feature: User Authentication

  As a Toyota GPT user,
  I want to securely log in and log out of the system,
  so that I can access chatbot features and ensure session security.

  Background:
    Given the user is on the authentication page

  @Login @Positive
  Scenario: User logs in successfully with valid credentials
    When the user enters valid credentials
    Then the user should be redirected to the dashboard
    And the user should see "Toyota GPT" in the page title

  @Login @Negative
  Scenario: User fails to log in with incorrect credentials
    When the user enters invalid credentials
    Then the user should see an error message stating "Your account or password is incorrect."

  @Login @Negative
  Scenario: User attempts login with an empty email field
    When the user leaves the email field empty
    Then the user should see an error message stating "Enter a valid email address, phone number, or Skype name."

  @Login @Negative
  Scenario: User attempts login with an empty password field
    When the user enters a valid email but leaves the password field empty
    Then the user should see an error message stating "Please enter your password."

  @Logout @Positive
  Scenario: User logs out successfully
    When the user enters valid credentials
    When the user clicks the Logout button
    Then the user should be redirected to the auth page and see "Sign out" status


