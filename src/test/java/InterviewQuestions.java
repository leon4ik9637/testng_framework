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

        RECAP:
        How do we handle Alerts?
            - JavaScript Alerts
                - Warning-Information
                - Confirmation
                - Prompt
            - Methods
                -accept()
                - dismiss()
                -getText()
                -sendKeys()
        driver.switchTo().alert()

        How do we handle iframes?
            - it is html inside another html
            - driver.switchTo().frame(index);
            - driver.switchTo().frame(iFrameWebElement);
            - driver.switchTo().frame(id or name);

            Switching back to parent frame
            - driver.switchTo().parentFrame()
            - driver.switchTo().defaultContent()


        How do we handle multiple windows/tabs?
            -driver.switchTo().window(windowHandle);

        driver.close() vs driver.quit()
        - close() is used to close only current window/tab
        - quit() kills the browser session with all tabs,
        popups etc.

        getWindowHandle() vs getWindowHandles()
        - getWindowHandle() retrieves the current window
        id
        - returns a String
        - getWindowHandles() will retrieve and return all
        the existing window handles
        - returns a Set of Strings as each string is a
        unique window handle

        SELENIUM FILE UPLOAD - DOWNLOAD
        - Selenium can handle uploading if you know your
        file's absolute path
        - We need to locate 2 elements usually. First is
        input field to pass path of the file we want to
        upload and 2 is upload button
        - After locating these 2 elements, we will pass
        file path to input field by using sendKeys(path)
        method and click on upload button by click()
        method
        - With that our file will be uploaded, and we can
        validate upload with its text

        - Selenium itself cannot handle file downloads as
        its scope is restricted to browser, and it cannot
        go to our Downloads folder
        - To check if file is downloaded or to verify the
        content of the file, third party tools like Robot
        and AutoIT can be used


        Exceptions
        1. NoSuchElementException

        2. StaleElementReferenceException
            When your element lost reference in the DOM
        3. ElementClickInterceptedException

        1. move to element - moveToElement()(targetElement)
        - This method moves the mouse to the middle of the
        element
        - the element is also scrolled into the view on
        performing this action
        - it is also known as hovering over on the element

        2. click on an element - click()
        - this method performs a mouse move to the location of
        the element and performs the click action

        3. right-click on the element - contextClick()
        - this method performs a mouse move to the location of
        the element and performs the right-click action

        4. click and hold
        - clickAndHold() method is used to click and hold a
        web element until released

        5. release
        - release() method is used to release the
        clicked-and-held element at the existing mouse
        location

        6. Drag and drop
        This method takes 2 argument
            source element
            target element
        - first, it moves to source - element and clicks and
        hold the element
        - then, it moves to target - element and release the
        source element

        actions.moveToElement(source).clickAndHold().moveToElement(target).release().perform();

        Keyboard actions
            sendKeys()
            keyDown()
            keyUp()

        7. send keys - sendKeys()

        What is the fastest driver to do UI testing?
        - headless testing
        A headless browses is a web browser without a
        graphical user interface.
        - Headless browsers provide automated control of a
        webpage in an environment similar to popular web
        browsers, but they are executed via a command-line
        interface or using network communication


























     */
}
