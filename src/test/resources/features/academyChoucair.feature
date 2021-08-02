@stories
Feature: Academy Choucair
  As s user, I want to register in the uTest page
  @scenario1
  Scenario: Register on the page
    Given than Andres wants to register on the uTest page
    When he goes to the register button and start the process
    #| strFirstName | strLastName | strEmail | strMonth | strDay | strYear | strLenguage |
    #| Carlos Andres | Ceron Gil  | andres@hotmail.com | January | 6 | 1998 | Spanish    |
    Then he finishes the registration process