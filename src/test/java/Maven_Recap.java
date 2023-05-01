public class Maven_Recap {
    /*

    RECAP:
    report - target - surefire reports
    build management tool - compiling, execution, packaging
    deploying
    dependencies - libraries
    build commands
    organizing folders - folders structure
    framework
    open source
    used with Java-Kotlin


    Maven: it is an open source project build tool that help us create
    a framework
    Similar tools: Gradle - ANT

    MAVEN ADVANTAGES:
    1. Maven provides a simple folder structure that is
    used to differentiate development from tests
        main -> used by developers
        test -> used for testing
    2. pom.xml
        - to centralize (store) all the dependencies, plugins,
        profiles and more
        - it makes maintenance of dependencies with the
        version much easier.
        - target folder: all the reports are stored here

    MAVEN COMMANDS
    mvn clean           -> deletes previous reports (target)
    mvn test-compile    -> compiles test package
    mvn compile         -> compile main package
    mvn test            -> executes all the tests in the test package
    mvn install         -> updates the .m2 folder
    mvn package         -> creates jar or war files
    mvn deploy          -> deploys code to the remote repository
    mvn archetype:generate -> creates a new Maven project

    HOW TO RUN TESTS
    All test package    -> mvn test
    Specific class      -> mvn -Dtest=className test
    Specific test       -> mvn -Dtest=className#testName test

    NOTE: We will name all our class names that has @Test
    annotations as below
    ClassName1Test
    ClassName2Test
    - surefire-plugin - customizes the executable class names

    NOTE: https://mvnrepository.com/ is where we will get the
    dependencies

    WebDriverManager - Boni Garcia
    MANUAL WAY: download chromedriver and set it out for UI
    scripts using System.setProperty("webdriver.chrome.driver", "path to
    the chromedriver");
    - This dependency allows us to set up browser for UI scripts

    WebDriverManager Advantages:
    - No need to download drivers manually
    - No need to set up driver file path for Selenium scripts
    - No need to update browser version each time
    mvn clean test-compile test     -> combining maven commands to do all in one

    CROSS-BROWSER Testing
    - Testing application on different browsers like Chrome,
    Firefox, Edge, Safari

    TESTING
    - TestNG is one of the most widely used open-source testing
    framework used in automation testing suite
    - Both TestNG and JUnit are used to do unit testing for
    developers
    - BUT, as testers we use them to better structure our tests
    - They are going to help us organize our UI and backend
    tests properly with the help of annotations
    - They help prioritize the test script, creating dependency
    between test scripts, creating reports and asserting expected
    script results


    TOP 3 ADVANTAGES OF TESTING
    reporting
    annotations -> @BeforeMethod, @Test, @AfterMethod
    assertions -> assertEquals(), assertTrue(), fail()

    TESTING ANNOTATIONS
    -As testers, we mostly use @BeforeMethod, @Test, @AfterMethod
    annotations
    1. @BeforeMethod
    - it is used to set up all tasks that you need to run before you run
    actual test
    - it is executed before each Test

    2. @AfterMethod
    - it is used to run tearDown tasks like quitting driver or
    clean up
    - it is executed after each Test

    3. @Tes
    - it is actual test script to validate some functionalities
    of the application
    - NOTE: By default, all the tests are running by alphabetical
    order. But this is not the proper way, so we will create our
    own way to put tests in order with priority keywords

    Priority in testing
    - TestNG enables testers to set priority for tests - executing
    pattern can be set by tester with priority
    - NOTE: you can use negative numbers as well. In this case, the
    test that has the smallest priority will execute first
    - if multiple tests have same priority then they will execute
    in alphabetical order again
    - it can only be used with @Test methods

    Description in testing
    -description keyword can be used to associate test cases with
    their related scripts
    - it increases readability for the tests we have and less
    effort for new joiners

    HOW TO IGNORE TEST CASE?
    1. Comment it out
    2. delete or comment out @Test annotation
    THESE 2 WAYS ABOVE ARE NOT PROPER
    3. Use @Ignore annotation on the top of @Test annotation to
    ignore the particular test
    SYNTAX:
    @Ignore
    @Test
    4. use (enabled=false) keyword
    SYNTAX:
    @Test(enabled = false)

    NOTE: The purpose of ignoring test case could be that you
    already know it has a bug and will fail, or it
    could also be not completed yet, and you don't want to run it yet

    Creating dependency between tests
    - we use dependsOnMethods to override priority between test
    scripts
    - The methods that depend on other methods will always be
    executed last

    Testing assertions
    Assert.assertTrue() -> isSelected(), isDisplayed(), isEnabled()
    Assert.assertEquals()   -> comparison of 2 args
                            -> (actual, expected)
    Assert.fail(); // for known issues






     */
}
