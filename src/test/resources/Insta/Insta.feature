
@SignUp
Feature: Sign Up new Insta User


  @tag1
  Scenario: Create New Account
    Given Open browser, enter Instagram url.
    When user enters Mobile No. , Fulname , Username , Password
    And user clicks the signup button
    Then Successful sign up message should be displayed

