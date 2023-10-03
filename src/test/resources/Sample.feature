Feature: Validate the reqres api
Scenario: Validate theGET request of reqres api
Scenario: Validate the POST request of reqres api 
Scenario: Validate the PUT request of reqres api
Scenario: Validate the DELETE request of reqres api
Given User creates the request object
When User attach the querry prameter
When User attach the path parameter
And Single User Not Found
When List of Resources
When Update the Employee
When Delete the Employee
And User creates  the respnse object
Then User Validates the response code and response body 


