Feature: Toyota GPT

  As a Toyota GPT user,
  I want to interact with the chatbot

Background:
  Given the user is on the authentication page
  When the user enters valid credentials

@Attachment @Positive
Scenario Outline: Verify attachment of files
  And the user uploads "<testFile>"
  Then the chatbot attaches the file "<testFile>" correctly

  Examples:
  |testFile               |
  |TestFilePDF.pdf        |
  |TestFileDOCX.docx      |
  |TestFileJPG.jpg        |
  |TestFileGIF.gif        |
  |CorruptedTestFile.xlsx |
  |TestFilePNG.png        |
  |TestFilePPTX.pptx      |
  |TestFileProtected.xlsx |
  |TestFileTXT.txt        |
  |TestFileWEBP.webp      |
  |TestFileXLSX.xlsx      |

@Renaming @Favorites @Deleting @Positive
Scenario: Verify the Rename, Add to Favorites, Remove from Favorites, and Delete Chat buttons
  And the user asks the chatbot for "Toyota Prado"
  And the user goes to previous chats
  Then the chatbot saves the chat with the title "Toyota Prado Overview"
  And the user updates the chat title to "Renamed Conversation"
  Then the chatbot updates the chat title to "Renamed Conversation"
  When the user selects the chat as a favorite
  Then the chatbot displays a popup confirming that the chat was added to favorites
  When the user removes the chat from favorites
  Then the chatbot displays a popup confirming that the chat was removed from favorites
  When the user deletes the chat
  Then the chatbot displays a popup confirming that the chat was deleted

@DefaultOptions @Positive
Scenario: Validate that the user can see the buttons of the 4 options by default
  Then the chatbot displays the 4 search options by default

@ModelList @Positive
Scenario: Validate that the list of models is available
  And the user open the model list
  Then the the chatbot shows the available models
  When the user selects the model "Claude Sonnet 3.5"
  Then the chatbot establishes the "Claude Sonnet 3.5" model as its main model

@StartChat @Positive
Scenario: Verify that the new chat button is available
  Then the chatbot displays new conversation button

@LanguageList @Positive
Scenario: Validate that the list of languages is available
  And the user opens the language list
  Then the the chatbot shows the available languages
  When the user selects the language "Español"
  Then the chatbot establishes the "Español" as its main language

  @InformationMenu @Positive
  Scenario: Validate that the list of information menu options is available
    And the user opens information menu options
    Then chatbot shows all the available information menu options
    When the user opens "product guide" option
    Then the chatbot shows a window of the "first step" with title "Toyota GPT"
    When the user goes to the "second step"
    Then the chatbot shows a window of the "second step" with title "Capabilities Overview"
    When the user goes to the "third step"
    Then the chatbot shows a window of the "third step" with title "New Session"
    When the user goes to the "fourth step"
    Then the chatbot shows a window of the "fourth step" with title "Chat History"
    When the user goes to the "fifth step"
    Then the chatbot shows a window of the "fifth step" with title "Translation"
    When the user goes to the "sixth step"
    Then the chatbot shows a window of the "sixth step" with title "Release Notes"
    When the user goes to the "seventh step"
    Then the chatbot shows a window of the "seventh step" with title "Information Menu"
    When the user goes to the "eighth step"
    Then the chatbot shows a window of the "eighth step" with title "Web Search"
    When the user goes to the "ninth step"
    Then the chatbot shows a window of the "ninth step" with title "File Upload"
    When the user goes to the "tenth step"
    Then the chatbot shows a window of the "tenth step" with title "Prompt Library"
    When the user goes to the "eleventh step"
    Then the chatbot shows a window of the "eleventh step" with title "Let’s chat here"
    When the user goes to the "twelfth step"
    And the user opens information menu options
    When the user opens "terms & privacy" option
    Then the chatbot shows a window with title "Terms & Privacy"
    And the user opens information menu options
    When the user opens "get in touch" option
    Then the chatbot shows a window with title "Get in Touch"
    And the user opens information menu options
    When the user opens "feedback & report a bug" option
    Then the chatbot shows a window with title "Feedback & Report a Bug"
    And the user opens information menu options
    When the user opens "frequently asked questions" option
    Then the chatbot shows a window with title "Frequently Asked Questions"





