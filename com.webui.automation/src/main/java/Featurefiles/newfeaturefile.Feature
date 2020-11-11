Feature: searchflight 
Scenario: look for one-way trip flights
Given user is on the search page
When enters the search details and click on search button
Then list of available flight must be displayed

Scenario: book flight options 

Given List of flights are displayed
And Flights are choosen and book option is clicked
When User select flexifly and baggage insurance is opted
Then verify the choosen flight details and total price payable



 
