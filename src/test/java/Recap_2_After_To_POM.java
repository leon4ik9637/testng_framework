public class Recap_2_After_To_POM {

    public static void main(String[] args) {

        /*
        RECAP:
        Framework:
        - A set of guidelines and rules used for creating and designing
        test cases. A framework comprises a combination of
        practices and tools that are designed to help QA professionals
        test more efficiently.

        Efficiency of testing: Reusability, time of
        execution, cross-browser testing, reporting,
        eliminating manual effort
        COST-SAVING

        FRAMEWORK:
        1. TDD -> Test-Driven Development Framework
        2. BDD -> Behavior-Driven Development Framework
            with JAVA
            TDD -> TestNG based - Test Next Generation
            BDD -> Cucumber

            with C#
            TDD -> NUnit
            BDD -> SpecFlow

        TDD vs BDD
        TDD -> Test based > @Test annotation

        1. Plan your test scripts based on requirements - AC
        2. Run them -> they will all fail
        3. Developers push their code -> refactor my test
        code
        4. Make sure all of your test scripts are passing

        Test Case Format
        TC007: User should be able to login with valid
        credentials
        Action                      Expected result
        1. Go to application        User should be on app
        2. Enter credentials        User should be able to enter credentials
        3. Click on login btn       User should be logged in

        BDD -> Behavior based - Gherkin
        TEST CASE FORMAT

        Scenario: User should be able to log in with valid credentials
        Given user is on application
        When user enters valid credentials
        And user clicks on log in button
        Then user should be logged in

        DDD -> Data-Driven Development Framework
        Hybrid -> BDD + TDD



        !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!INTERVIEW!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        Tell me about your current framework?
            - My current framework is a TDD one that is utilizing
            Java together with Maven, GIT ad Jenkins.
            - We use Maven as it provides pom.xml to centralize all
            our dependencies with their versions, and it makes it
            easy to maintain libraries or jars. pom.xml also stores
            all our plugins, profiles, builds etc.
            - Maven also provides us surefire reports in the target
            folder after each build.
            - We use Selenium and WebDriverManager together with
            HtmlUnitDriver for UI scripts
            - HtmlUnitDriver enable us to run our suites with
            headless browser
            - We Rest-Assured, Jackson, Lombok, JWay, log4j, and JDBC
            for backend

        Do you have experience creating a framework from scratch?
            - Yes, I can create both BDD and TDD frameworks from
            scratch

        What steps you follow to create framework?
        First, creating a framework is serious and requires
        a team collaboration. After few meetings, we decide the
        language.
        1. Language
        2. Discuss the framework type - pros and cons -> TDD Framework
            BDD -> if non-technical team members are involved - UI
            TDD -> requires high-technical skills - Backend scripts
            Backend = API + Database
        3. Build tool: Maven, Gradle, ANT
        4. Get Dependencies:
            UI: Selenium WebDriver, WebDriverManager, HtmlUnitDriver
            Mobile: Appium
            API: Rest-Assured, Jackson, Lombok, JWay, log4j
            Database: JDBC
            For all: Apache POI, builds, profiles, plugins
        5. Rules and design patterns to implement - best practices
            Singleton: We use it to provide one single Driver
            instance to be used across the project.
            POM - Page Object Model: It is centralizing all the web
            elements in separate object repositories (page classes)
            together with its related methods
            POM provides reusability, readability, and it makes easy
            to maintain all our web elements.
            OOP Principles: We implement all of the OOP Principles
            and concepts to make our framework more readable,
            reusable and efficient.
            Base class: we write all our before and after actions in
            this class and all other script classes are extending to
            the Base.
            Driver: We utilize encapsulation for our  getDriver()
            method to provide a single Driver instance.
            Abstraction: We commonly use interfaces like WebElement,
            WebDriver
            Polymorphism: We instantiate ChromeDriver, FirefoxDriver
            or others in the shape of webDriver which is an interface
            that all these classes implement.
            Collections: I use mostly List, Set and Map for all my
            frontend and backend scripts.

            Utilities: We have the utilities package where we store
            our methods like Driver, Waits, TableHandler, ElementUtils,
            StringUtils, ScreenshotUtils etc.

        6. TestNG: benefit from its annotations, and assertions.
            - it also provides priority and dependsOnMethods keyword
            to organize our scripts in a class
            - it provides xml files to create different suites like
            Smoke and Regression
            - it provides us description keyword to associate our
            test case IDs with their related automated scripts
            - it makes parallel testing easier
            - it provides @DataProvider annotation to achieve DDD

        7. Reports: Surefire reports like html, Emailable reports,
        xml, json etc.
        8. Our framework is integrated with GIT, and we use GitLab as
        a hosting url.
        9. We have 2 suites of now as Smoke and Regression
            We have 8 test cases in Smoke suite, and it runs every day
            in the morning at 6 AM, and it takes 5 minutes.
            We have 400 UI scripts in my Regression, and we run it
            after each sprint, and it takes around 4 hours

            Where do you run your smoke and regression?
            - I can run it on my local anytime with maven commands if
            required.
            - Also, it is integrated with Jenkins and triggered
            automatically with given schedules.
            - Jenkins provides us execution results in our emails.



        - libraries, dependencies, reports, tools, pom.xml

        NOTE: Appium is tool used to conduct automated mobile testing
        and similar to Selenium
        Web -> Selenium
        Mobile -> Appium + Selenium

        Selenium Synchronization - Waits

        1. Implicit Wait
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            - it only prevents NoSuchElementException
            - Implicit wait is used for locating elements, and it only
            waits for certain amount of time for element to be
            loaded in the DOM.
            - it attempts to locate web element in the DOM for every
            500 milliseconds

            NOTE: We usually use implicitWait right after
            instantiating our driver instance.
            This will be implemented for each web element in the
            Page Object Repository

        2. Explicit Wait
            - it is used for any other exception may be
            thrown besides the NoSuchElementException.
            - it attempts to run action for every 500 milliseconds

        3. Fluent Wait
            - it is used for any other exception may be thrown
            besides the NoSuchElementException and can be an
            alternative to Explicit Wait.
            - it attempts to run action for every 500 milliseconds by
            default, but we have chance to modify the attempt duration

        4. Thread.sleep(); // freezes our source code
        This is not proper to use

        driver.get() vs driver.navigate().to()
        - get() waits until the DOM is loaded which means it has some
        implicit wait implemented in the method
        - navigate().to() caches the browser history and makes it to
        navigate forward, backward etc.
        NOTE: get() is safer to use for visiting websites

        // NEW LESSON RADIO BUTTONS +
        Radi Buttons vs Checkboxes
        - Both created with input tag
        <input type="radio button">
        <input type="checkbox">

        isDisplayed(), isEnabled(), isSelected()

        HOW TO VALIDATE radio and checkboxes
        1. Make sure that they are displayed
        2. Make sure that they are enabled
        3. Make sure they are selected after you select them
        4. Deselect them and make sure they are deselected

        Assertions
        - They come from TestNG
        - Assert.assertEquals(actual, expected);
        - Assert.assertTrue(boolean);
        - Assert.assertFalse(boolean);

        - Assert.assertEquals(actual, expected, message);
        - Assert.assertTrue(boolean, message);
        - Assert.assertFalse(boolean, message);

        Assertions can be added a third argument which is a custom
        failure message to be displayed in the console. It will be
        displayed only if the assertion fails.

==============================IMPORTANT====================================
        isDisplayed() -> h1-h6, span, div, p, nav, ul, li,
        ol, table, thead, tbody, tr, td
        ONLY isDisplayed() WILL WORK, isEnabled OR isSelected WILL NOT WORK

        isDisplayed(), isEnabled() -> input boxes, radio buttons, checkboxes, submit,
        reset buttons, date

        isDisplayed(), isEnabled(), isSelected() -> radio buttons, checkboxes,
        dropdowns


==============================IMPORTANT====================================















         */
    }
}
