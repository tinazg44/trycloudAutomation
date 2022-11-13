

Feature: As a user, I should be able to delete a file/folder.
@wip
  Scenario Outline: Verify login with valid credentials, and Verify users delete a file/folder

    Given user on the login page
    When user use username '<username>' and passcode '<password>'
    And user click the login button
    Then verify the user should be at the dashboard page

    Given user on the dashboard page
  When the user clicks the "Files" module
    And user click action-icon  from any file on the page
    And user choose the "Delete f" option
    When the user clicks the "Deleted files" sub-module on the left side
    Then Verify the deleted file is displayed on the page.
    Examples:
      | username | password    |
      | User21   | Userpass123 |
      | User51   | Userpass123 |
      | User81   | Userpass123 |
      | User111  | Userpass123 |



