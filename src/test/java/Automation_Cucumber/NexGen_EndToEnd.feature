Feature: Testing the Demo WebSite End To End

  Scenario: launch the Application and Navigate to all Pages
    Given navigate to homePage
    Then get all links in seleniumPage
    When navigate to demoPage
    And register the formPage
    Then get the transactioId
    And move to dynamicaPage
    Then navigate to mouseEventPage
    And navigate to alertPage
    Then naviagte to multiWindowsPage
    And navigate to iframePage
    Then navigate to webTablePage
    And navigate to progressBarPage
