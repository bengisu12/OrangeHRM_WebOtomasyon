@OrangeHRM
  Feature: OrangeHRM Check Test Cases

    @AllEmpty
    Scenario: Empty Username and Empty Password
      Given User at login page
      When click login button
      Then Check required message about username and password

    @FalseLogin
    Scenario: False username and false password
      Given User at login page
      When Write username and password
      When click login button
      Then check Invalid credentials message about login

    @CorrectLogin
    Scenario: True username and true password
      Given User at login page
      When Write correct username and password
      When click login button
      Then check dashboard screeen

    @ChangeNameAndSurname
    Scenario: Change name and surname
      Given User at login page
      When Write correct username and password
      When click login button
      Then check dashboard screeen
      When click my info button
      When change name and surname
      When click to save button
      Then check new name and surname

