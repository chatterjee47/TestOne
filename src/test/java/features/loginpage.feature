Feature: Login Feature

  @loginpage
  Scenario: Successful Login with Valid Credentials
    Given User Navigate to LogIn Page
    Then User enters Credentials to LogIn
      | Admin | admin123 |
    Then Message displayed Login Successfully
    And Verify title of the page
