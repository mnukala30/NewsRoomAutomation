@TakeOver
Feature: NewsRoom
 
  Background: 
    Given Open the browser and Launch the application
    

  Scenario: Validate if Latest News heading is displayed on Newsroom US landing page
    Then User must able to see "Latest News" on Newsroom US Landing Page 
    Then User must able to see 11 articles should be displayed under Latest News section on Newsroom US Landing Page 
    
  Scenario: Validate if More from Newsroom heading is displayed on Newsroom US landing page
  Then User must able to see "More from Newsroom" on Newsroom US Landing Page 
  And User must able to see 8 articles should be displayed under More from Newsroom section on Newsroom US Landing Page 
  
  Scenario: Validate Event Branding image  is available on Takeover section of Newsroom US landing page
   Then User must see "Event Branding image"  is available on Takeover section of Newsroom US landing page
   
   Scenario: Validate Localnav is above event branding image and contains Search Newsroom and Popular Topics on Newsroom US landing page
   Then User must see "Localnav" above event branding image and contains Search Newsroom and Popular Topics on Newsroom US landing page
   
   Scenario: Validate Take Over header is available on Takeover section of Newsroom US landing page
   Then User must see "Take Over header" is on Takeover section of Newsroom US landing page
   
  Scenario: Validate if Watch Event CTA  is displayed in Takeover section of Newsroom US landing page
   Then User must see "Watch EventCTA" is on Takeover section of Newsroom US landing page
  Then User must able to click on Watch Event CTA on Takeover section of Newsroom US landing page
   
   Scenario: Validate total number of articles displayed under Takeover sectionare less than 14 in Newsroom US landing page
  Then User must able to see less than 14 articles displayed under Takeover section in Newsroom US landing page
 
   Scenario: Validate the pattern of 14 article are 1Up plus 1Up plus 1Up plus 2Up plus 2Up 2Up plus 2Up plus 3Up in Takeover section of Newsroom US landing page
   Then User must able to see the pattern of fourteen article are OneUp plus OneUp plus OneUp plus TwoUp plus TwoUp TwoUp plus TwoUp plus ThreeUp in Takeover section of Newsroom US landing page
   
   Scenario: Validate Take over section is followed by Latest News section on Newsroom US landing page.
   Then User must able to see the Take over section followed by Latest News section on Newsroom US landing page.   