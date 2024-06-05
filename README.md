# Diplom 3: Web Application Testing

In this assignment, you'll be testing the Stellar Burgers web application. Here's what you need to do:

## Website Link

[Stellar Burgers Website](https://stellarburgers.nomoreparties.site)

## Requirements

1. Describe the elements you'll use in your tests using Page Object.
2. Test the functionality in Google Chrome.
3. Connect Allure report.

## Registration

Check:

- Successful registration.
- Error for an incorrect password. Minimum password length is six characters.

## Sign In

Check:

- Sign in using the "Sign In" button on the homepage.
- Sign in through the "Account" button.
- Sign in through the registration form button.
- Sign in through the password recovery form button.

## Transition to Personal Account

Check transition by clicking on "Personal Account".

## Transition from Personal Account to Builder

Check transition by clicking on "Builder" and on the Stellar Burgers logo.

## Logout

Check logout using the "Logout" button in the personal account.

## Builder Section

Check that transitions to sections work:

- "Buns".
- "Sauces".
- "Fillings".

## How to Complete and Submit the Task

Write code in IDEA and push to the develop3 branch on GitHub. Make a pull request.

## Evaluation Criteria

- Tests in test/java.
- Separate package for Page Object.
- Separate class with Page Object for each page.
- Tests divided by theme or functionality. Separate classes created for tests.
- No unnecessary elements in pom.xml.
- All elements of the pages used in the tests are described in Page Object.
- Page Object class names reflect their contents.
- Locator names are understandable.
- Tests run and do not fail.
- Automated tests run in both browsers.
- @Step annotation is used for all test steps.
- Test names are clear and concise.
- Each test primarily verifies something rather than just performing actions. Each test checks something.
- Necessary test data is created before the test and deleted after it is completed.
- If a test requires a test user, it is created using the API.
- All tests described in the assignment are included.
- Allure report is generated. The report is added to the pull request.
- Project uses Java 11.

## How to run tests

- To run tests in chrome browser
'mvn -Dbrowser=chrome clean test'
- To run tests in firefox browser
  'mvn -Dbrowser=chrome clean test'
- To generate allure report
  'mvn allure:serve'