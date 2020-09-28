#comments. Author: sreelekha
#Xero test cases 1 to 10

Feature: Xero test cases feature

Scenario: TC01_A:Navigate to XERO with correct username and password
Given launch browser and open url
When enter username and password and click on login button
Then verify success or failure
And close browser

Scenario: TC01_B:Navigate to XERO with correct username and incorrect password
Given launch browser and open url
When Login with incorrect password
Then verify error message
And close browser

Scenario: TC01_C:Navigate to XERO with incorrect username and correct password
Given launch browser and open url
When Login with incorrect username
Then verify error message1
And close browser

Scenario: TC01_D:Navigate to XERO forgot password
Given launch browser and open url
When forgotPassword
Then verify reset message
And close browser

Scenario: TC02_A:Sign Up to XDC
Given launch browser and open url
When start free trial and fill page
And close browser

Scenario: TC02_B:Sign Up to XDC
Given launch browser and open url
When start free trial without fill the page
And close browser

Scenario: TC02_C:Sign Up to XDC
Given launch browser and open url
When terms and privacy check
And close browser

Scenario: TC02_D:Sign Up to XDC
Given launch browser and open url
When see full offer details
And close browser

Scenario: TC03_A:Test all tabs page
Given launch browser and open url
When enter username and password and click on login button
When check all tabs
And close browser

Scenario: TC04_A:Test Logout Functionality
Given launch browser and open url
When enter username and password and click on login button
When logout
And close browser

Scenario: TC06_A:Test Upload profile image
Given launch browser and open url
When enter username and password and click on login button
When upload profile picture
And close browser

Scenario: TC08_A:Add another organization Trail version - 1
Given launch browser and open url
When enter with master login
Then Add another organization Trail version
And close browser

Scenario: TC08_B:Add another organization - Paid version 1
Given launch browser and open url
When enter with master login
Then Add another organization - Paid version
And close browser

Scenario: TC08_C:Add another organization - Starter Plan
Given launch browser and open url
When enter with master login
Then Add another organization - Paid version
Then Add another organization - Starter Plan
And close browser

Scenario: TC08_D:Add another organization - Standard Plan
Given launch browser and open url
When enter with master login
Then Add another organization - Paid version
Then Add another organization - Standard Plan
And close browser

Scenario: TC08_E:Add another organization - Premium Plan
Given launch browser and open url
When enter with master login
Then Add another organization - Paid version
Then Add another organization - Premium Plan
And close browser

Scenario: TC08_F:Add another organization with current Quickbooks user
Given launch browser and open url
When enter with master login
Then fill half page
Then Add another organization with current Quickbooks user
And close browser

Scenario: TC10_A:Check for subscription and billing 
Given launch browser and open url
When enter username and password and click on login button
Then Check for subscription and billing
And close browser

