@smokeTest @regressionTest
Feature:  Confirm login and log out in Orange HRM 
	Scenario:  User able to login in with no issue
	Given user go to open browser and browse to log in section
	#Then user go to page and verify title "OrangeHRM"
	And user enter valid username and valid password 
	Then  user press Login button
	#Then user navigate on human icon button next to arrow 
	Then user click log out button