public class JUnitVsTestNG {

    /*
    TestNG
        - Testing framework
        - Mainly used for Unit Testing by developers
        - Assertions, annotations which help control the
        flow of the scripts
        - Simple reports
        - description, priority, test, dependsOnMethod,
        enabled, dataProvider
        - Parallel testing
        - xml files -> group together some test scripts and
        execute them
        - Hard and soft assertions
        - Mostly used with TDD framework

    JUnit
        - Testing framework
        - Mainly used for Unit Testing by developers
        - Assertions, annotations which help control the
        flow of the scripts
        - Simple reports
        - JUnit used with BDD framework
        - @Test, @Before, @After, @BeforeClass, @AfterClass
        - It has only hard assertions but not soft assertions
        - JUnit has more assert methods
        - JUnit does provide parallel testing but harder than
        TestNG

    MAVEN COMMANDS
    mvn test        -> runs all scripts in the test package
    annotated with @Test annotations
    mvn compile     -> compiles main package
    mvn test-compile-> compiles test package
    mvn clean       -> clean previous build results
    mvn install     -> updates .m2 file

    HOW WE EXECUTED TESTS BEFORE PROFILES?
    mvn test -> execute every script
    mvn -Dtest=className test -> run a particular class
    mvn -Dtest=className#methodName test -> run a particular method

    HOW WE EXECUTED TESTS WITH PROFILES?
    1. Create the xml file and define your specific group of test
    scripts
    2. Create a build for this in pom.xml using profile
    3. Run your suite with mvn test -P<ProfileID>

    HOW DO YOU RUN ONLY FAILED TEST SCRIPTS AGAIN AFTER YOU EXECUTE
    REGRESSION?
    - You have 300 test scripts, and you executed all of them with
    Regression suite. 10 failed, tell me how do you run these 10
    again?
    ANSWER:
    - My surefire reports already generates .xml file with the failed
    test scripts, so I can run them again separately













    */

}







