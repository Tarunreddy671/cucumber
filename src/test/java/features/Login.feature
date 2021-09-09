Feature: Application login


Scenario: Home Page default Login
Given User is on Netbanking Login page
When User login to application with "jin" and password "1234"
Then HomePage is populated
And Cards displayed are "true"


Scenario: Home Page default Login
Given User is on Netbanking Login page
When User login to application with "j12" and password "222"
Then HomePage is populated
And Cards displayed are "false"


