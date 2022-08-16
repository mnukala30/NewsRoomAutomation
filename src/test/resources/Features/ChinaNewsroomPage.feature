@chineeseNewsRoom 
Feature: ChinaNewsroomPage

 Background: 
    Given Open the browser and Launch the application
 
Scenario: Verify the newsroom search and popular topics field are displayed in the Local Nav of Newsroom zh-CN  landing page.
Then User must able to see "newsroom search and popular topics" on LocalNov of Newsroom zh-CN landing page.

Scenario: Validate the popular Topics is displayed beside the Newsroom search field n the Local Nav of Newsroom Uzh-CN landing page.
Then User must able to see popular topics beside Newsroom search field on Local Nav of Newsroom Uzh-CN landing page

Scenario: Validate the Newsroom Hyperlink is displayed beside Newsroom search field on the Local Nav of Newsroom Uzh-CN landing page.
Then User must able to see Newsroom Hyperlink beside Newsroom search field on Local Nav of Newsroom Uzh-CN landing page

Scenario: Validate the Newsroom Hyperlink in local nav is clicked and redirects to Newsroom Uzh-CN landing page.
Then User clicks on "Newsroom Hyperlink"
Then User must see the Newsroom Uzh-CN landing page

Scenario: validate the functionality of the Popular Topic section on the Local Nav of  Newsroom Uzh-CN landing page.
Then User clicks on Popular Topic section
And User clicks on Mac in the Popular Topic section
Then User must able to see articles related to the Mac in the Newsroom Uzh-CN landing page.

Scenario: validate the functionality of the Newsroom search  on the Local Nav of  Newsroom Uzh-CN landing page.
Then User clicks on Search Newsroom
And User should able to enter as " Macbook " keyword in the Search Newsroom
Then User should must able to click on enter
Then User must able to see articles related to the Macbook in the Newsroom Uzh-CN landing page. 

Scenario:  Verify the View archives button  is displayed at the bottom of the Newsroom zh-CN landing page.
Then User must able to see View archives button at the bottom of the Newsroom zh-CN landing page.

Scenario: validate the functionality of the View archives button on the Newsroom zh-CN landing page
And User clicks on View archives button
Then User should directed to newsroom archives page







