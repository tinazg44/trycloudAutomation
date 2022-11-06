Feature: As a user, I should be able to search any item/ users from the homepage.


  Scenario Outline: Verify users can search any files/folder/users from the search box.
    Given user on the login page
    When user use username '<username>' and passcode '<password>'
    And user click the login button
    Then verify the user should be at the dashboard page
    When the user clicks the magnifier icon on the right top
    And users search any existing file folder user name
    Then verify the app displays the expected result option

    Examples:
      | username | password    |
      | User21   | Userpass123 |
      | User51   | Userpass123 |
      | User81   | Userpass123 |
      | User111  | Userpass123 |