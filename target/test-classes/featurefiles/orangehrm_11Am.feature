Feature: Checking the login functionality of Orangehrm page

Background: 
Given user launches the orangehrm url

  @smoke @sanity
  Scenario: Login the OrngeHrm page
    
    When user enters username
    And user enters password
    And user clicks on orangelogin button
    Then user should logged in successfully

@sanity
  Scenario: Login the Orangehrm page using parameters
    
    When user enters username "Admin"
    And user enters the password "admin123"
    And user clicks on orangelogin button
    Then user should logged in successfully

  Scenario Outline: Login the orangehrm page with multiple datas
   
    When user enters username "<username>"
    And user enters the password "<password>"
    And user clicks on orangelogin button
    Then user should logged in successfully

    Examples: 
      | username | password |
      | java     |      123 |
      
