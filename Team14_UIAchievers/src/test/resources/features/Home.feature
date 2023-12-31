Feature: Home Page Verification 

Scenario: Verify admin is able to land on home page
Given Admin launch the browser
When Admin gives the correct LMS portal URL
Then Admin should land on the home page

Scenario: Verify admin is able to land on home page with invalid URL
Given Admin launch the browser
When Admin gives the invalid LMS portal URL 
Then Admin should recieve 404 page not found error

