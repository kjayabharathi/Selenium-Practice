@Homepage
Feature: User is in homepage after login to the account
  
  Automation test scripts for homepage functionality

  @HomepageScreen
  Scenario Outline: Verify user to land in homepage after login
    Given user is launched Govt Health Application
    When user landed on login page of the application
    Then user enters username as <username> and password as <password> in the respecetive fields
    And user click on login button in the login page
    Then user should land on home page of the application
    And user search for the location by entering zipcode <zipcode>
    Then user selects the zip code from the dropdown
    And user click on continue button on the home page
    And user logged out from the application
    And user close the application

    #Given User is able to login to their account
    #When User is able to find his name on the top right corner of application
    #Then verify the name of the user
    #When User locates 'Find My Application' link to appear and click on it
    #And User navigates to the next page of appliation
    Examples: 
      | username                  | password     | zipcode |
      #| parellanarayana@gmail.com | Selenium123! |   72712 |
      | jayab.parella@gmail.com   | Jaya12345    |   72712 |
