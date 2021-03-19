Feature: GoogleTranslate
  As a mobile user
  I want to use Google Translate App
  to translate words between different languages

  @translate
  Scenario: Translate from English to Spanish
    When Susan translate the world cheese from english to spanish
    Then she should see the world queso in the screen

