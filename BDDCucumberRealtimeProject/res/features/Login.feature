Feature: Govt Health App Login Functionality
  
  Writing the automation cases for login functionality

  Background: 
    Given user is launched Govt Health Application
    When user landed on login page of the application
    Then user enters username as "<username>" and password as <password> in the respecetive fields
    And user click on login button in the login page
    Then user should land on home page of the application

  @LoginWithPosivtiveFlow @Regression @Smoke
  Scenario Outline: Verify Govt Heath App login with valid credentials
    And user search for the location by entering zipcode <zipcode>
    Then user selects the zip code from the dropdown
    And user click on continue button on the home page
    Then verify that the user has landed on information page
    And verify the UI components of the page
    And user logged out from the application
    And user close the application

    Examples: 
      | username                | password  | zipcode |
      #| parellanarayana@gmail.com | Selenium123! |   72712 |
      | jayab.parella@gmail.com | Jaya12345 |   72712 |

# how do we write assert for JSExecutors

  @LoginWithNegativeFlow
  Scenario Outline: Verify Govt Heath App login with valid credentials
    And user search for the location by entering zipcode <zipcode>
    Then user selects the zip code from the dropdown
    And user click on continue button on the home page
    Then verify that the user has landed on information page
    And verify the UI components of the page
    And user logged out from the application
    And user close the application

    Examples: 
      | username            | password    | zipcode |
      #| GD^guayana@gmail.com | &$DH123!    | fW712   |
      | *H)_uella@gmail.com | iun_*?12345 | 72(*J   |
