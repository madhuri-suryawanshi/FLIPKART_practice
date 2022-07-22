Feature: Login functionality

Background: Application opens successfully
Given user open browser with its "webdriver.chrome.driver" and "C:\\Users\\mahim\\Desktop\\Madhuri\\AUTOMATION TASKBAR\\SELENIUM\\chromedriver.exe"
Given user enter url as "https://www.flipkart.com/"

@SmokeTest
Scenario: Login functionality with valid credentials
When user cancle on initial login page
When user navigate on login button
When user click on My Profile
When user enter username "8149221168"
When user enter password "madhuri123"
When user click on Login button
Then Application shows login successfully

