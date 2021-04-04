

Feature: Search and place order for vegetables
 
@SeleniumTest
  Scenario: Search for items and validate results
  
    Given User is on Greencart Landing page
  
    When User searched for "Cucumber" Vegetable
    
    Then "Cucumber" results are displayed
    
    #=========================================================================
    @SeleniumTest
    Scenario: Search for items and then move to checkout page
  
    Given User is on Greencart Landing page
    When User searched for "Brinjal" Vegetable
    And Added items to cart
    And User proceeded to checkout page
    
    Then verify selected "Brinjal" items are displayed in checkout page   

  
 # Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
   # When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
     # | name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
