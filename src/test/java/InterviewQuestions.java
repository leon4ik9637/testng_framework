public class InterviewQuestions {
    /*
    NoSuchElementException -> one of the reasons is dynamic web element
    once you refresh webpage

    HOW TO HANDLE DYNAMIC WEB ELEMENTS
    Use below methods of XPATH or CSS with stable part of
    the attribute
    1. contains //button[contains(@id, 'u_0_d_')]
    2. starts-with //button[starts-with(@id, 'u_0_d_')]
    3. ends-with
    4. parent-to-child / or //
    5. child-to-parent
    6. use another attribute, tagName, locators


    ALERTS - MODALS - POPUPS
    Restriction o Selenium: Selenium can focus on one
    thing at a time
    - When there is an alert-popup, then we need to change
    driver focus on alert using Alert interface provided by
    selenium.

    1. HOW DO YOU HANDLE ALERTS? (JS ALERTS)
    First, I need to switch driver focus to the Alert
        driver.switchTo().alert();

    Then, I use 4 methods to handle alerts below
        a. accept();
        b. dismiss();
        c. getText();
        d. sendKeys();

    2. WHAT ARE THE DIFFERENT TYPES OF ALERTS?
        a. Information-Warning alert (only way to handle is
        accepting)
        b. Confirmation alert (Either accept or dismiss)
        c. Prompt alert (Either dismiss or send keys and
        accept)

        Dynamic Web Elements:
        1. Use another locator
        2. Use contains or starts-with or ends-with methods
        3. Move from parent or child

        Alerts - modals - popups - dialog boxes
            1. JS (Java Script) alerts - switch driver focus to the alert
            2. HTML modals - locate web elements and take action

        If no alert:
        driver.switchTo().alert(); -> NoAlertPresentException

        If alert present:
        accept();
        dismiss();
        getText();
        sendKeys();

        1. Warning - Information -> getText(), accept();
        2. Confirmation -> getText(), accept(), dismiss();
        3. Prompt -> getText(), accept(), dismiss(), sendKeys();

        Selenium iFrames
        - iFrame is known as html inside the html
        - In case you have an iFrame and you need to click or
        sendKeys or take any action to the web elements that are
        in the inner html, then you need to switch driver focus
        to inner html
            driver.switchTo().frame(index);
            driver.switchTo().frame(name);
            driver.switchTo().frame(iFrameWebElement);

        If you try to switch to an iframe that does not exist,
        then you will get NoSuchFrameException




     */
}
