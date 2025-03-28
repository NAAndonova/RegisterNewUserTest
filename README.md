# Register New User Test

This is a simple UI automated test written in Java using Selenium WebDriver and TestNG.  
The test verifies the successful registration of a new user on the website [https://auto.pragmatic.bg/](https://auto.pragmatic.bg/).

⚠️ This project is created for learning purposes. I am a beginner in test automation and this is one of my first test projects.

## Technologies used
- Java
- Selenium WebDriver
- TestNG
- Maven

## How to run the test
1. Clone the repository:
   git clone https://github.com/NAAndonova/RegisterNewUserTest.git
2. Open the project in IntelliJ IDEA.

3. Make sure you have:
- Java installed
- Maven installed

4. Run the test:
- From IntelliJ: Right-click on the `RegisterNewUserTest` class → **Run 'RegisterNewUserTest'**
- Or from terminal:
  ```
  mvn clean test
  ```

## Test Scenario
The test performs the following steps:
1. Open the website.
2. Go to **My Account** → **Register**.
3. Fill in the registration form.
4. Accept the terms and conditions.
5. Click **Continue**.
6. Verify that the success message is displayed.

## Notes
- This is a beginner project. There may be things to improve, but I am still learning.
- The website used for testing may change over time, so the test might fail if elements are changed.