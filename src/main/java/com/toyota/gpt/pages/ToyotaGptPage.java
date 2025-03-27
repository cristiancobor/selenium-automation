package com.toyota.gpt.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.time.Duration;
import java.util.logging.Logger;

public class ToyotaGptPage extends BasePage {

    private static final Logger logger = Logger.getLogger(ToyotaGptPage.class.getName());

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[1]/div/div[1]/button")
    private WebElement previousChatsButton;

    @FindBy(xpath = "//textarea[contains(@class, 'MuiInputBase-input') and contains(@class, 'MuiOutlinedInput-input') and contains(@class, 'chat')]")
    private WebElement questionInput;

    @FindBy(xpath = "//div[contains(@class, 'MuiInputAdornment-positionEnd') and contains(@class, 'css-1nvf7g0')]/button[1]")
    private WebElement sendQuestionButton;

    @FindBy(xpath = "//button[contains(@class, 'MuiButtonBase-root') and contains(@class, 'MuiIconButton-root')]/svg[contains(@class, 'remixicon')]")
    private WebElement stopChatButton;

    @FindBy(id = ":r6:")
    private WebElement searchConversationInput;

    @FindBy(xpath = "//div[contains(@class, 'MuiBox-root') and contains(@class, 'css-6ygt77')]/button[contains(@class, 'MuiIconButton-root') and contains(@class, 'css-1oa71js') and last()]")
    private WebElement userButton;

    @FindBy(xpath = "//*[@id=\"menu-appbar\"]/div[3]/ul/li[3]")
    private WebElement logoutButton;

    @FindBy(xpath = "//*[@id='root']/div/div[2]/div[3]/div[3]/div/div[1]/input")
    private WebElement uploadFileInput;

    @FindBy(xpath = "//div[contains(@class, 'MuiBox-root') and contains(@class, 'css-70qvj9')]/p[text()='Toyota Prado Overview']")
    private WebElement conversationTitleLabel;

    @FindBy(xpath = "//div[contains(@class, 'MuiBox-root') and contains(@class, 'css-70qvj9')]/p[text()='Renamed Conversation']")
    private WebElement conversationTitleUpdatedLabel;

    @FindBy(xpath = "//*[@id='root']/div/div[2]/div[3]/div[3]/div/div[1]/div[1]/div/span")
    private WebElement nameFileLabel;

    @FindBy(xpath = "//li[contains(@class, 'MuiListItem-root') and contains(@class, 'MuiListItem-gutters')]/div[contains(@class, 'MuiBox-root')]")
    private WebElement conversationButtonFromFavorites;

    @FindBy(xpath = "//*[@id='root']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/li[1]/div/div[2]")
    private WebElement conversationButton;

    @FindBy(xpath = "//*[@id='root']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/li[1]/div/div/span/div/div[1]/div/div/button[1]")
    private WebElement confirmationRenameButton;

    @FindBy(xpath = "//*[@id='root']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/li[1]/div/div[2]/span/div/div")
    private WebElement threeDotButton;

    @FindBy(xpath = "//*[@id='root']/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/li/div/div[2]/span/div/div")
    private WebElement threeDotButtonFromFavorites;

    @FindBy(xpath = "//ul[contains(@class, 'MuiMenu-list')]//li[contains(., 'Rename')]")
    private WebElement renameButton;

    @FindBy(xpath = "//li[contains(@class, 'MuiButtonBase-root') and contains(@class, 'MuiMenuItem-root')]/div[contains(@class, 'MuiBox-root') and contains(., 'Remove from Favorite')]")
    private WebElement removeFromFavoritesButton;

    @FindBy(xpath = "//li[.//p[contains(text(), 'Delete')]]")
    private WebElement deleteButton;

    @FindBy(xpath = "//li[contains(@class, 'css-eqqv0b')]")
    private WebElement confirmDeleteButton;

    @FindBy(xpath = "//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9' and @role='menu']/li[@role='menuitem' and contains(., 'Add to Favorite')]")
    private WebElement favoriteButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-body' and @role='alert']/div[contains(., 'Added to favorite')]")
    private WebElement favoritePopup;

    @FindBy(xpath = "//div[@class='Toastify__toast-body' and @role='alert']/div[contains(., 'Removed from favorites')]")
    private WebElement removeFromFavoritesPopup;

    @FindBy(xpath = "//div[@class='Toastify__toast-body' and @role='alert']/div[contains(., 'Conversation deleted.')]")
    private WebElement chatDeletedPopup;

    @FindBy(xpath = "//div[contains(@class, 'MuiInputBase-root') and contains(@class, 'MuiOutlinedInput-root')]//input[@value='Toyota Prado Overview']")
    private WebElement conversationNameBox;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div/div[1]")
    private WebElement firstDefaultButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div/div[2]")
    private WebElement secondDefaultButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div/div[3]")
    private WebElement thirdDefaultButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div/div[4]")
    private WebElement fourthDefaultButton;

    @FindBy(xpath = "//*[@id=\":r3:\"]/li[1]")
    private WebElement firstModelButton;

    @FindBy(xpath = "//*[@id=\":r3:\"]/li[2]")
    private WebElement secondModelButton;

    @FindBy(xpath = "//*[@id=\":r3:\"]/li[3]")
    private WebElement thirdModelButton;

    @FindBy(xpath = "//*[@id=\":r3:\"]/li[4]")
    private WebElement fourthModelButton;

    @FindBy(xpath = "//*[@id=\":r3:\"]/li[5]")
    private WebElement fifthModelButton;

    @FindBy(xpath = "//*[@id=\":r3:\"]/li[6]")
    private WebElement sixthModelButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[1]/div/div[1]/div/div/div/div")
    private WebElement modelListButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[1]/div/div[1]/div/div/div/div")
    private WebElement newChatButton;

    @FindBy(xpath = "//*[@id=\"language-menu\"]/div[3]/ul/li[1]")
    private WebElement englishLanguageButton;

    @FindBy(xpath = "//*[@id=\"language-menu\"]/div[3]/ul/li[4]")
    private WebElement frenchLanguageButton;

    @FindBy(xpath = "//*[@id=\"language-menu\"]/div[3]/ul/li[3]")
    private WebElement spanishLanguageButton;

    @FindBy(xpath = "//*[@id=\"language-menu\"]/div[3]/ul/li[2]")
    private WebElement japaneseLanguageButton;

    @FindBy(xpath = "//button[contains(@class, 'MuiIconButton-root') and contains(@class, 'translation') and @aria-label='Change Language']")
    private WebElement changeLanguageButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[3]/div[3]/div/div[1]/div/div/div[2]/button[2]")
    private WebElement informationButton;

    @FindBy(xpath = "//ul[contains(@class, 'MuiMenu-list')]//li[contains(., 'Product Guide') and @role='menuitem']")
    private WebElement productGuideButton;

    @FindBy(xpath = "//ul[contains(@class, 'MuiMenu-list')]//li[contains(., 'Terms & Privacy') and @role='menuitem']")
    private WebElement termsPrivacyButton;

    @FindBy(xpath = "//ul[contains(@class, 'MuiMenu-list')]//li[contains(., 'Get in Touch') and @role='menuitem']")
    private WebElement getInTouchButton;

    @FindBy(xpath = "//ul[contains(@class, 'MuiMenu-list')]//li[contains(., 'Feedback & Report a Bug') and @role='menuitem']")
    private WebElement feedbackReportButton;

    @FindBy(xpath = "//ul[contains(@class, 'MuiMenu-list')]//li[contains(., 'Frequently Asked Questions') and @role='menuitem']")
    private WebElement frequentlyAskedQuestionsButton;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-0\"]/div/div/div")
    private WebElement productGuideWindow;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-0\"]/div/div/div/div/p")
    private WebElement productGuideWindowTitle;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-0\"]/div/div/div/div/button")
    private WebElement secondStepProductGuideButton;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-1\"]/div/div/div[1]/div/button[2]")
    private WebElement thirdStepProductGuideButton;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-2\"]/div/div/div[1]/div/button[2]")
    private WebElement fourthStepProductGuideButton;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-3\"]/div/div/div[1]/div/button[2]")
    private WebElement fifthStepProductGuideButton;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-4\"]/div/div/div[1]/div/button[2]")
    private WebElement sixthStepProductGuideButton;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-5\"]/div/div/div[1]/div/button[2]")
    private WebElement seventhStepProductGuideButton;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-6\"]/div/div/div[1]/div/button[2]")
    private WebElement eighthStepProductGuideButton;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-7\"]/div/div/div[1]/div/button[2]")
    private WebElement ninthStepProductGuideButton;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-8\"]/div/div/div[1]/div/button[2]")
    private WebElement tenthStepProductGuideButton;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-9\"]/div/div/div[1]/div/button[2]")
    private WebElement eleventhStepProductGuideButton;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-10\"]/div/div/div[1]/div/button[2]")
    private WebElement twelfthStepProductGuideButton;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-1\"]/div/div/div[1]")
    private WebElement capabilitiesOverviewWindow;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-2\"]/div/div/div[1]")
    private WebElement newSessionWindow;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-3\"]/div/div/div[1]")
    private WebElement chatHistoryWindow;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-4\"]/div/div/div[1]")
    private WebElement translationWindow;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-5\"]/div/div/div[1]")
    private WebElement releaseNotesWindow;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-6\"]/div/div/div[1]")
    private WebElement informationMenuWindow;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-7\"]/div/div/div[1]")
    private WebElement webSearchWindow;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-8\"]/div/div/div[1]")
    private WebElement fileUploadWindow;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-9\"]/div/div/div[1]")
    private WebElement promptLibraryWindow;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-10\"]/div/div/div[1]")
    private WebElement letsChatHereWindow;

    @FindBy(xpath = "//*[@id=\"menu-appbar\"]/div[3]/ul")
    private WebElement informationMenuOptionsList;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-1\"]/div/div/div[1]/div/p")
    private WebElement capabilitiesOverviewWindowTitle;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-3\"]/div/div/div[1]/div/p")
    private WebElement chatHistoryWindowTitle;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-2\"]/div/div/div[1]/div/p")
    private WebElement newSessionWindowTitle;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-4\"]/div/div/div[1]/div/p")
    private WebElement translationWindowTitle;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-5\"]/div/div/div[1]/div/p")
    private WebElement releaseNotesWindowTitle;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-6\"]/div/div/div[1]/div/p")
    private WebElement informationMenuWindowTitle;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-8\"]/div/div/div[1]/div/p")
    private WebElement fileUploadWindowTitle;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-7\"]/div/div/div[1]/div/p")
    private WebElement webSearchWindowTitle;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-9\"]/div/div/div[1]/div/p")
    private WebElement promptLibraryWindowTitle;

    @FindBy(xpath = "//*[@id=\"react-joyride-step-10\"]/div/div/div[1]/div/p")
    private WebElement letsChatHereWindowTitle;

    @FindBy(xpath = "/html/body/div[5]/div[3]/div/div")
    private WebElement termsPrivacyWindow;

    @FindBy(xpath = "//*[@id=\":ra:\"]/p")
    private WebElement termsPrivacyWindowTitle;

    @FindBy(xpath = "/html/body/div[5]/div[3]/div/div")
    private WebElement getInTouchWindow;

    @FindBy(xpath = "//*[@id=\":rb:\"]/p")
    private WebElement  getInTouchWindowTitle;

    @FindBy(xpath = "/html/body/div[5]/div[3]/div/div[1]")
    private WebElement feedbackBugWindow;



    @FindBy(xpath = "/html/body/div[5]/div[3]/div/div/div")
    private WebElement frequentlyAskQuestionsWindow;

    @FindBy(xpath = "//*[@id=\":rc:\"]/p")
    private WebElement  feedbackBugWindowTitle;

    @FindBy(xpath = "//*[@id=\":rd:\"]/p")
    private WebElement  frequentlyAskQuestionsWindowTitle;

    private final WebDriverWait wait;

    private final WebDriver driver;

    public ToyotaGptPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement getQuestionInput() {
        return questionInput;
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public WebElement getNameFileLabel (){
        return nameFileLabel;
    }

    public WebElement getFavoritePopup(){
        return favoritePopup;
    }

    public WebElement getRemoveFromFavoritesPopup(){
        return removeFromFavoritesPopup;
    }

    public WebElement getChatDeletedPopup(){
        return chatDeletedPopup;
    }

    public WebElement getConversationTitleLabel (){
        return conversationTitleLabel;
    }

    public WebElement getConversationTitleUpdatedLabel (){
        return conversationTitleUpdatedLabel;
    }

    public WebElement getSearchConversationsInput(){
        return searchConversationInput;
    }

    public WebElement getFirstDefaultButton() {return firstDefaultButton;}

    public WebElement getSecondDefaultButton() {return secondDefaultButton;}

    public WebElement getThirdDefaultButton() {return thirdDefaultButton;}

    public WebElement getFourthDefaultButton() {return fourthDefaultButton;}

    public void openPreviousChats(){
        click(previousChatsButton);
    }

    public WebElement getFirstModelButton() {
        return firstModelButton;
    }

    public WebElement getSecondModelButton() {
        return secondModelButton;
    }

    public WebElement getThirdModelButton() {
        return thirdModelButton;
    }

    public WebElement getFourthModelButton() {
        return fourthModelButton;
    }

    public WebElement getFifthModelButton() {
        return fifthModelButton;
    }

    public WebElement getSixthModelButton() {
        return sixthModelButton;
    }

    public WebElement getModelListButton() {
        return modelListButton;
    }

    public WebElement getNewChatButtonButton() {
        return newChatButton;
    }

    public WebElement getEnglishLanguageButton() {
        return englishLanguageButton;
    }

    public WebElement getFrenchLanguageButton() {
        return frenchLanguageButton;
    }

    public WebElement getSpanishLanguageButton() {
        return spanishLanguageButton;
    }

    public WebElement getJapaneseLanguageButton() {
        return japaneseLanguageButton;
    }

    public WebElement getChangeLanguageButton() {
        return changeLanguageButton;
    }

    public WebElement getProductGuideButton() {
        return productGuideButton;
    }

    public WebElement getTermsPrivacyButton() {
        return termsPrivacyButton;
    }

    public WebElement getGetInTouchButton() {
        return getInTouchButton;
    }

    public WebElement getFeedbackReportButton() {
        return feedbackReportButton;
    }

    public WebElement getFrequentlyAskedQuestionsButton() {
        return frequentlyAskedQuestionsButton;
    }

    public WebElement getProductGuideWindow() {
        return productGuideWindow;
    }

    public WebElement getProductGuideWindowTitle(String step) {

        return switch (step.toLowerCase()) {
            case "first step" -> productGuideWindowTitle;
            case "second step" -> capabilitiesOverviewWindowTitle;
            case "third step" -> newSessionWindowTitle;
            case "fourth step" -> chatHistoryWindowTitle;
            case "fifth step" -> translationWindowTitle;
            case "sixth step" -> releaseNotesWindowTitle;
            case "seventh step" -> informationMenuWindowTitle;
            case "eighth step" -> webSearchWindowTitle;
            case "ninth step" -> fileUploadWindowTitle;
            case "tenth step" -> promptLibraryWindow;
            case "eleventh step" -> letsChatHereWindowTitle;
            default -> throw new IllegalArgumentException("Option not found: " + step);
        };
    }

    public WebElement getProductGuideWindow(String step) {

        return switch (step.toLowerCase()) {
            case "first step" -> productGuideWindow;
            case "second step" -> capabilitiesOverviewWindow;
            case "third step" -> newSessionWindow;
            case "fourth step" -> chatHistoryWindow;
            case "fifth step" -> translationWindow;
            case "sixth step" -> releaseNotesWindow;
            case "seventh step" -> informationMenuWindow;
            case "eighth step" -> webSearchWindow;
            case "ninth step" -> fileUploadWindow;
            case "tenth step" -> promptLibraryWindow;
            case "eleventh step" -> letsChatHereWindow;
            default -> throw new IllegalArgumentException("Option not found: " + step);
        };
    }

    public WebElement getInformationMenuOptionWindow(String option) {

        return switch (option.toLowerCase()) {
            case "terms & privacy" -> termsPrivacyWindow;
            case "get in touch" -> getInTouchWindow;
            case "feedback & report a bug" -> feedbackBugWindow;
            case "frequently asked questions" -> frequentlyAskQuestionsWindow;
            default -> throw new IllegalArgumentException("Option not found: " + option);
        };
    }

    public WebElement getInformationMenuOptionWindowTitle(String title) {
        return switch (title) {
            case "Terms & Privacy" -> termsPrivacyWindowTitle;
            case "Get in Touch" -> getInTouchWindowTitle;
            case "Feedback & Report a Bug" -> feedbackBugWindowTitle;
            case "Frequently Asked Questions" -> frequentlyAskQuestionsWindowTitle;
            default -> throw new IllegalArgumentException("Option not found: " + title);
        };
    }

    public void openLanguageList() {
        click(changeLanguageButton);
    }

    public void askQuestion(String question){
        enterText(questionInput, question);
        click(sendQuestionButton);
        waitForElementToDisappear(stopChatButton);
    }

    public void uploadFile(String fileName){
        File file = new File(String.format("src/test/resources/testData/%s", fileName));
        String path = file.getAbsolutePath();
        uploadFileInput.sendKeys(path);
    }

    public void renameConversation(String conversationName){
        click(conversationButton);
        click(threeDotButton);
        click(renameButton);
        waitForElementToBeClickable(conversationNameBox);
        enterText(conversationNameBox, Keys.CONTROL + "a");
        enterText(conversationNameBox, Keys.DELETE + conversationName);
        waitForElementToBeClickable(confirmationRenameButton);
        click(confirmationRenameButton);
        waitForElementToDisappear(confirmationRenameButton);
    }

    public void favoriteConversation(){
        click(conversationButton);
        click(threeDotButton);
        click(favoriteButton);
    }

    public void removeConversationFromFavorites(){
        click(conversationButtonFromFavorites);
        click(threeDotButtonFromFavorites);
        click(removeFromFavoritesButton);
    }

    public void deleteConversation(){
        click(conversationButton);
        click(threeDotButton);
        click(deleteButton);
        click(confirmDeleteButton);
    }

    public void openInformationMenuOption() {
        click(informationButton);
        waitForElement(productGuideButton);
    }

    public void navigateProductGuide(String step) {
        switch (step.toLowerCase()) {
            case "second step":
                click(secondStepProductGuideButton);
                waitForElement(capabilitiesOverviewWindow);
                break;
            case "third step":
                click(thirdStepProductGuideButton);
                waitForElement(newSessionWindow);
                break;
            case "fourth step":
                click(fourthStepProductGuideButton);
                waitForElement(chatHistoryWindow);
                break;
            case "fifth step":
                click(fifthStepProductGuideButton);
                waitForElement(translationWindow);
                break;
            case "sixth step":
                click(sixthStepProductGuideButton);
                waitForElement(releaseNotesWindow);
                break;
            case "seventh step":
                click(seventhStepProductGuideButton);
                waitForElement(informationMenuWindow);
                break;
            case "eighth step":
                click(eighthStepProductGuideButton);
                waitForElement(webSearchWindow);
                break;
            case "ninth step":
                click(ninthStepProductGuideButton);
                waitForElement(fileUploadWindow);
                break;
            case "tenth step":
                click(tenthStepProductGuideButton);
                waitForElement(promptLibraryWindow);
                break;
            case "eleventh step":
                click(eleventhStepProductGuideButton);
                waitForElement(letsChatHereWindow);
                break;
            case "twelfth step":
                click(twelfthStepProductGuideButton);
                break;
            default:
                throw new IllegalArgumentException("Option not found: " + step);
        }
    }

    public void navigateToInformationMenuOption(String option) {
        switch (option.toLowerCase()) {
            case "product guide":
                click(productGuideButton);
                waitForElement(productGuideWindow);
                break;
            case "terms & privacy":
                click(termsPrivacyButton);
                waitForElement(termsPrivacyWindow);
                break;
            case "get in touch":
                click(getInTouchButton);
                waitForElement(getInTouchWindow);
                break;
            case "feedback & report a bug":
                click(feedbackReportButton);
                waitForElement(feedbackBugWindow);
                break;
            case "frequently asked questions":
                click(frequentlyAskedQuestionsButton);
                waitForElement(frequentlyAskQuestionsWindow);
                break;
            default:
                throw new IllegalArgumentException("Option not found: " + option);
        }
    }



    public void openListModel(){
      click(modelListButton);
    }

    public void selectModel(){
        click(fourthModelButton);
    }

    public void selectLanguage(){
        click(spanishLanguageButton);
    }

    public void logout() {
        try {
            WebElement userButtonElement = wait.until(ExpectedConditions.elementToBeClickable(userButton));
            userButtonElement.click();
            WebElement logoutElement = wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
            logoutElement.click();

            logger.info("User logged out successfully.");
        } catch (TimeoutException e) {
            logger.warning("Logout failed: Logout button not found.");
        }
    }
}
