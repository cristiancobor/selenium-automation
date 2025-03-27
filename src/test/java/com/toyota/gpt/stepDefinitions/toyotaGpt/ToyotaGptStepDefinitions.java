package com.toyota.gpt.stepDefinitions.toyotaGpt;

import com.toyota.gpt.stepDefinitions.Hooks;
import com.toyota.gpt.pages.ToyotaGptPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static org.testng.Assert.assertTrue;

public class ToyotaGptStepDefinitions {

    private final ToyotaGptPage toyotaGptPage;
    private final WebDriverWait wait;
    private final Actions actions;

    public ToyotaGptStepDefinitions() {

        WebDriver driver = Hooks.driver;
        actions = new Actions(driver);
        this.toyotaGptPage = new ToyotaGptPage(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @And("the user goes to previous chats")
    public void clickOnPreviousChats() {
        toyotaGptPage.openPreviousChats();
    }

    @And("the user uploads {string}")
    public void uploadFile(String fileName) {
        toyotaGptPage.uploadFile(fileName);
    }

    @And("the user updates the chat title to {string}")
    public void renamePreviousConversation(String conversationName) {
        toyotaGptPage.renameConversation(conversationName);
    }

    @When("the user selects the chat as a favorite")
    public void addConversationToFavorites() {
        toyotaGptPage.favoriteConversation();
    }

    @When("the user removes the chat from favorites")
    public void removeConversationFromFavorites() {
        toyotaGptPage.removeConversationFromFavorites();
    }

    @When("the user deletes the chat")
    public void deleteConversation() {
        toyotaGptPage.deleteConversation();
    }

    @When("the user selects the model {string}")
    public void selectModel(String modelName) {
        toyotaGptPage.selectModel();
    }

    @When("the user opens {string} option")
    public void selectInformationMenuOption(String optionName) {
        toyotaGptPage.navigateToInformationMenuOption(optionName);
    }

    @When("the user goes to the {string}")
    public void openSecondStepProductGuide(String step) {
        toyotaGptPage.navigateProductGuide(step);
    }

    @When("the user selects the language {string}")
    public void selectLanguage(String languageName) {
        toyotaGptPage.selectLanguage();
    }

    @And("the user asks the chatbot for {string}")
    public void askQuestion(String question) {
        toyotaGptPage.askQuestion(question);
    }

    @And("the user opens the language list")
    public void openLanguageList() {
        toyotaGptPage.openLanguageList();
    }

    @And("the user opens information menu options")
    public void openInformationMenuOptions() {
        toyotaGptPage.openInformationMenuOption();
    }

    @And("the user open the model list")
    public void openModelList() {
        toyotaGptPage.openListModel();
    }

    @Then("the the chatbot shows the available models")
    public void verifyModelList() {
        List<WebElement> modelButtons = Arrays.asList(
                toyotaGptPage.getFirstModelButton(),
                toyotaGptPage.getSecondModelButton(),
                toyotaGptPage.getThirdModelButton(),
                toyotaGptPage.getFourthModelButton(),
                toyotaGptPage.getFifthModelButton(),
                toyotaGptPage.getSixthModelButton()
        );

        for (WebElement button :modelButtons) {
            assertTrue(button.isDisplayed(), "Element is not displayed");
            assertTrue(button.isEnabled(), "Element is not enabled");
        }
    }

    @Then("chatbot shows all the available information menu options")
    public void verifyInformationMenuOptions() throws InterruptedException {

        List<WebElement> optionButtons = Arrays.asList(
                toyotaGptPage.getProductGuideButton(),
                toyotaGptPage.getTermsPrivacyButton(),
                toyotaGptPage.getGetInTouchButton(),
                toyotaGptPage.getFeedbackReportButton(),
                toyotaGptPage.getFrequentlyAskedQuestionsButton()
        );

        for (WebElement button : optionButtons) {
            assertTrue(button.isDisplayed(), "Element is not displayed");
            assertTrue(button.isEnabled(), "Element is not enabled");
        }
    }

    @Then("the the chatbot shows the available languages")
    public void verifyLanguageList() {
        List<WebElement> languageButtons = Arrays.asList(
                toyotaGptPage.getEnglishLanguageButton(),
                toyotaGptPage.getSpanishLanguageButton(),
                toyotaGptPage.getFrenchLanguageButton(),
                toyotaGptPage.getJapaneseLanguageButton()
        );

        for (WebElement button :languageButtons) {
            assertTrue(button.isDisplayed(), "Element is not displayed");
            assertTrue(button.isEnabled(), "Element is not enabled");
        }
    }

    @Then("the previous conversations appear")
    public void verifyPreviousChats() {
        verifyElement(toyotaGptPage.getSearchConversationsInput());
    }

    @Then("the chatbot shows a window of the {string} with title {string}")
    public void verifyProductGuideWindow(String step, String title) {
        assertTrue(toyotaGptPage.getProductGuideWindow(step).isDisplayed(), "Element is not displayed");
        assertTrue(toyotaGptPage.getProductGuideWindow(step).isEnabled(), "Element is not enabled");
        assertTrue(toyotaGptPage.getProductGuideWindowTitle(step).getText().contains(title), "The text does not match");
    }

    @Then("the chatbot establishes the {string} model as its main model")
    public void verifyModelSelected(String modelName) {
       assertTrue(toyotaGptPage.getModelListButton().getText().contains(modelName), "The text does not match");
    }

    @Then("the chatbot shows a window with title {string}")
    public void verifyInformationMenuOptionWindowTitle(String title) {
        assertTrue(toyotaGptPage.getInformationMenuOptionWindow(title).isDisplayed(), "Element is not displayed");
        assertTrue(toyotaGptPage.getInformationMenuOptionWindow(title).isEnabled(), "Element is not enabled");
        assertTrue(toyotaGptPage.getInformationMenuOptionWindowTitle(title).getText().contains(title), "The text does not match");
        actions.sendKeys(Keys.ESCAPE).perform();
    }

    @Then("the chatbot establishes the {string} as its main language")
    public void verifyLanguageSelected(String languageName) {
        assertTrue(Objects.requireNonNull(toyotaGptPage.getQuestionInput().getDomAttribute("placeholder")).contains("Empezar a buscar"), "The text does not match");
    }

    @Then("the chatbot saves the chat with the title {string}")
    public void verifyConversationTitle(String conversationTitle) {
        verifyElementText(toyotaGptPage.getConversationTitleLabel(), conversationTitle);
    }

    @Then("the chatbot updates the chat title to {string}")
    public void verifyConversationTitleUpdated(String conversationTitle) {
        verifyElementText(toyotaGptPage.getConversationTitleUpdatedLabel(), conversationTitle);
    }

    @Then("the chatbot displays a popup confirming that the chat was added to favorites")
    public void verifyFavoritePopup() {
        verifyPopup(toyotaGptPage.getFavoritePopup());
    }

    @Then("the chatbot displays new conversation button")
    public void verifyNewChatButton() {
        assertTrue(toyotaGptPage.getNewChatButtonButton().isDisplayed(), "Element is not displayed");
        assertTrue(toyotaGptPage.getNewChatButtonButton().isEnabled(), "Element is not enabled");
    }

    @Then("the chatbot displays the 4 search options by default")
    public void verifyDefaultSearch() {
        List<WebElement> defaultButtons = Arrays.asList(
                toyotaGptPage.getFirstDefaultButton(),
                toyotaGptPage.getSecondDefaultButton(),
                toyotaGptPage.getThirdDefaultButton(),
                toyotaGptPage.getFourthDefaultButton()
        );

        for (WebElement button : defaultButtons) {
            assertTrue(button.isDisplayed(), "Element is not displayed");
            assertTrue(button.isEnabled(), "Element is not enabled");
        }
    }



    @Then("the chatbot displays a popup confirming that the chat was removed from favorites")
    public void verifyConversationRemovedFromFavorites() {
        verifyPopup(toyotaGptPage.getRemoveFromFavoritesPopup());
    }

    @Then("the chatbot displays a popup confirming that the chat was deleted")
    public void verifyChatDeleted() {
        verifyPopup(toyotaGptPage.getChatDeletedPopup());
    }

    @Then("the chatbot attaches the file {string} correctly")
    public void verifyFileAttached(String fileName) {
        verifyElementText(toyotaGptPage.getNameFileLabel(), fileName);
    }

    private void verifyElement(WebElement element) {
        assertTrue(element.isDisplayed(), "Element is not displayed");
        assertTrue(element.isEnabled(), "Element is not enabled");
        assertTrue(Objects.requireNonNull(element.getDomAttribute("placeholder")).contains("Search conversations..."), "The text does not match");
    }

    private void verifyElementText(WebElement element, String expectedText) {
        assertTrue(element.isDisplayed(), "Element is not displayed");
        assertTrue(element.getText().contains(expectedText), "The text does not match");
    }

    private void verifyPopup(WebElement popupElement) {
        WebElement element = wait.until(ExpectedConditions.visibilityOf(popupElement));
        assertTrue(element.isDisplayed(), "Popup is not displayed");
        assertTrue(element.isEnabled(), "Popup is not enabled");
    }
}
