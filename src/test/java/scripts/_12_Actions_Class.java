package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

import java.time.Duration;
import java.util.List;

public class _12_Actions_Class extends Base{

    /*
    Go to https://crystalgrand.ca/
    Move to address displayed in the footer
    Validate the address is "Crystal Grand Banquet Hall 2110 Dundas St. East unit 4 Mississauga, Ontario L4X 1L9"


     */

    @Test(priority = 1, description = "Actions | move to element 1")
    public void moveToElementPractice1(){
        driver.get("https://crystalgrand.ca/");

        //It must be POM, and we must read it from the page but this is for interview purposes
        WebElement address = driver.findElement(By.xpath("//div[@data-id='5b4862f']//div//div//div//p"));
        actions.moveToElement(address).perform(); // this will not work now
        Waiter.pause(5);
        System.out.println(address.getText());
        Assert.assertEquals(address.getText(), "Crystal Grand Banquet Hall 2110 Dundas St. East unit 4 Mississauga, Ontario L4X 1L9");

    }

    /*
    Go to https://www.carvana.com/
    Hover over "FINANCING" menu item (dropdown)
    Validate below items are displayed:

    WHY FINANCE WITH CARVANA
    GET PREQUALIFIED
    AUTO LOAN CALCULATOR
     */

    @Test(priority = 2, description = "Actions | move to element 2")
    public void moveToElementPractice2(){

        driver.get("https://www.carvana.com/");

        //Not proper
        Waiter.waitForVisibilityOfElement(driver, driver.findElement(By.cssSelector("div[data-cv-test='headerFinanceDropdown']")), 20);
        WebElement financeDropdown = driver.findElement(By.cssSelector("div[data-cv-test='headerFinanceDropdown']"));

        // Move to financeDropdown
        List<WebElement> financeDropdownOptions = driver.findElements(By.cssSelector("a[data-cv-test*='headerFinance']"));

        actions.moveToElement(financeDropdown).perform();

        Waiter.pause(3);
        String[] optionTexts = {"WHY FINANCE WITH CARVANA", "GET PREQUALIFIED", "AUTO LOAN CALCULATOR"};

        for (int i = 0; i < 3; i++) {
            Assert.assertTrue(financeDropdownOptions.get(i).isDisplayed());
            Assert.assertEquals(financeDropdownOptions.get(i).getText(), optionTexts[i]);
            System.out.println(financeDropdownOptions.get(i).getText());
        }
    }


    /*
    Go to https://techglobalschool.com/
    Click on Apply Now link
    Validate the url is "https://www.techglobalschool.com/apply/"
     */
    @Test(priority = 3, description = "Actions | Click")
    public void clickOnElementPractice1(){

        driver.get("https://techglobalschool.com/");

        WebElement applyNowLink = driver.findElement(By.cssSelector("div[class='awb-button-text-transition']"));
//        actions.moveToElement(applyNowLink).perform();
//        Waiter.pause(2);
//        actions.click(applyNowLink).perform();

        actions.moveToElement(applyNowLink).pause(Duration.ofSeconds(2)).click().perform();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.techglobalschool.com/apply/");
    }


    /*
    Go to https://www.techglobalschool.com/
    Right-click on Apply Now link
    Validate the url is "https://www.techglobalschool.com/"
     */

    @Test(priority = 4, description = "Actions | Right click")
    public void rightClickOnElementPractice(){
        driver.get("https://www.techglobalschool.com/");

        WebElement applyNowLink = driver.findElement(By.cssSelector("div[class='awb-button-text-transition']"));

        actions.contextClick(applyNowLink).perform();
        Waiter.pause(5);

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.techglobalschool.com/");

    }

    /*
    Go to https://demoqa.com/droppable/
    Click and hold "Drag me" box and release it on "Drop here" box
    Validate "Drop here" text is replaced with "Dropped!"
     */

    @Test(priority = 5, description = "Actions | Click - hold and release | Drag and drop")
    public void dragAndDropPractice(){

        driver.get("https://demoqa.com/droppable/");


        WebElement dragMeBox = driver.findElement(By.id("draggable"));
        WebElement dropMeBox = driver.findElement(By.id("droppable"));

        //actions.clickAndHold(dragMeBox).moveToElement(dropMeBox).release().perform();
        actions.dragAndDrop(dragMeBox, dropMeBox).perform();

        Assert.assertEquals(dropMeBox.getText(), "Dropped!");
    }


    /*
    1. Go to https://www.google.com/
    2. Enter “Hello” to search input box
    3. Validate value attribute is “Hello”
     */

    @Test(priority = 6, description = "Actions class | send keys to an element\n")
    public void sendKeysToAnElement(){
        driver.get("https://www.google.com/");

        //actions.moveToElement(googleSearchPage.searchInputBox).sendKeys("Hello").perform();
        actions.sendKeys(googleSearchPage.searchInputBox, "Hello").perform();

        Assert.assertEquals(googleSearchPage.searchInputBox.getAttribute("value"), "Hello");

    }

    /*
    1. Go to https://www.google.com/
    2. Enter “techglobal” to search input box with upper cases
    3. Validate the value attribute for search input box is
    “TECHGLOBAL”
    4. Then, copy the text and paste again
    5. Validate the value attribute for search input box is
    “TECHGLOBALTECHGLOBAL”

     */

    @Test(priority = 7, description = "Actions | key down and key up")
    public void practiceKeyDownAndKeyUp(){
        driver.get("https://www.google.com/");

        actions.keyDown(Keys.SHIFT)
                .sendKeys(googleSearchPage.searchInputBox, "techglobal")
                .keyUp(Keys.SHIFT)
                .pause(Duration.ofSeconds(2))
                .keyDown(Keys.COMMAND).sendKeys("a" + "c").keyUp(Keys.COMMAND)
                .sendKeys(Keys.ARROW_RIGHT)
                .keyDown(Keys.COMMAND).sendKeys("v")
                .perform();

        Assert.assertEquals(googleSearchPage.searchInputBox.getAttribute("value"), "TECHGLOBALTECHGLOBAL");




    }





}
