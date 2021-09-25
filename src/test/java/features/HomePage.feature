Feature: Urban Ladder Site Validations


Scenario: Positive test validating login
Given Initialize the browser with chrome
And Navigate to url site
And Click on Login icon in home page to land on Secure sign in page
When User enters emailAddress and password and click on log in
Then Verify that user is successfully logged in
And close the browser

Scenario: View all availabe stores and navigate to Mumbai-Bandra store
Given Initialize the browser with chrome
And Navigate to url site
And Click on stores
When the user clicks on view details of Mumbai Bandra Store
Then the detailed address of Bandra store is displayed along with google map
And close the browser 

Scenario: Help Page Access
Given Initialize the browser with chrome
And Navigate to url site
When the user clicks on Help
Then then user should land on help page
And clicks on Payments
And close the browser

Scenario: Exploring the Furniture Range
Given Initialize the browser with chrome
And Navigate to url site
When the user clicks on Decor
Then the user should land on decor page
And click on festive lights and verify festive lights page is open
And close the browser

Scenario: Search Operation with invalid data
Given Initialize the browser with chrome
And Navigate to url site
When the user enters an invalid search item
Then the page should display No Products Found
And close the browser

Scenario: Adding Product to wishlist
Given Initialize the browser with chrome
And Navigate to url site
When the user search a valid item
And add it to the wishlist
Then the item should be added to wishlist
And close the browser

Scenario: Sending GiftCards
Given Initialize the browser with chrome
And Navigate to url site
When the user clicks on giftcards
Then the user lands on giftcard page and selects House warming
And fill the details and click on send
And close the browser 

Scenario: Tracking Order Details
Given Initialize the browser with chrome
And Navigate to url site
When the user clicks on track orders
Then the user is navigated to the page to fill order details
And click on submit
And close the browser

Scenario: View Customer Stories
Given Initialize the browser with chrome
And Navigate to url site
When the user clicks on view customer stories 
Then the user can view all the stories and can subscribe by giving email
And close the browser

Scenario: Verify Expected text is displayed on home page
Given Initialize the browser with chrome
And Navigate to url site
When user is on home page the page should diplay expected text
And close the browser
