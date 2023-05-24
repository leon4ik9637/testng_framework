package scripts;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.AlertHandler;
import utilities.Waiter;

public class _08_Alerts extends Base{
    /*
    Go to "https://www.etsy.com/"
    click on Sign in button
    validate Sign in modal is displayed
    validate heading1 of the modal is Sign in
     */

    @Test(priority = 1, description = "Task-1", groups = "Login")
    public void testEtsySignInModel(){
        driver.get("https://www.etsy.com/");

        etsySearchPage.signInButton.click();
        Assert.assertTrue(etsySearchPage.signInModal.isDisplayed());
        Assert.assertEquals(etsySearchPage.signInHeading1.getText(), "Sign in");

    }

    /*
    Task-2 - Information-Warning alert
    Go to https://the-internet.herokuapp.com/
    click on JavaScript Alerts link
    click on "Click for JS Alerts" button
    Validate the text is "I am a JS Alert"
    click on "OK" button on the alert
    validate "You successfully clicked an alert"

     */

    @Test(priority = 2, description = "Task-2 - Information-Warning alert")
    public void testInformationWarningAlert(){
        driver.get("https://the-internet.herokuapp.com/");

        heroAppPage.clickOnLink("JavaScript Alerts");
        heroAppPage.clickOnAlertButton("Click for JS Alert");

        Assert.assertEquals(driver.switchTo().alert().getText(), "I am a JS Alert");

//        alert.accept(); // Click on OK
        AlertHandler.acceptAlert(driver);

        Assert.assertEquals(heroAppPage.resultParagraph.getText(), "You successfully clicked an alert");

    }


    /*
    Task-3 Confirmation Alert
    Go to https://the-internet.herokuapp.com/
    click on JavaScript Alerts link
    click on "Click for JS Confirm" button
    Validate the text is "I am a JS Confirm"
    click on "Cancel" button on the alert
    validate "You clicked: Cancel" message
    click on "Click for JS Confirm" button again
    click on "OK" button on the alert
    validate "You clicked: OK" message
     */

    @Test(priority = 3, description = "Task-3 Confirmation Alert")
    public void testConfirmationAlert(){
        driver.get("https://the-internet.herokuapp.com/");

        heroAppPage.clickOnLink("JavaScript Alerts");
        heroAppPage.clickOnAlertButton("Click for JS Confirm");

        Assert.assertEquals(AlertHandler.getAlertText(driver), "I am a JS Confirm");

        // driver.switchTo().alert().dismiss(); // Click on Cancel
        AlertHandler.dismissAlert(driver);
        Assert.assertEquals(heroAppPage.resultParagraph.getText(), "You clicked: Cancel");

        heroAppPage.clickOnAlertButton("Click for JS Confirm");
        //driver.switchTo().alert().accept(); //Click on OK
        AlertHandler.acceptAlert(driver);
        Assert.assertEquals(heroAppPage.resultParagraph.getText(), "You clicked: Ok");

    }

    /*
    Task-4-Prompt Alert

     */

    @Test(priority = 4, description = "Task-4-Prompt Alert")
    public void testPromptAlert(){
        driver.get("https://the-internet.herokuapp.com/");

        heroAppPage.clickOnLink("JavaScript Alerts");

        heroAppPage.clickOnAlertButton("Click for JS Prompt");

        Assert.assertEquals(AlertHandler.getAlertText(driver), "I am a JS prompt");

        AlertHandler.dismissAlert(driver);
        Assert.assertEquals(heroAppPage.resultParagraph.getText(), "You entered: null");

        heroAppPage.clickOnAlertButton("Click for JS Prompt");


        AlertHandler.sendKeysToAlert(driver, "Hello");
        AlertHandler.acceptAlert(driver);

        Assert.assertEquals(heroAppPage.resultParagraph.getText(), "You entered: Hello");
    }


    /*
    Task-5 - Amazon Modal
    go to https://www.amazon.com/
    click on “Deliver to Canada” link in the top navigation bar
    validate “Chose your location” modal is displayed
    Enter your zip code to input box
    Click on “Apply” button
    validate the zip code entered displayed in the delivery message
     */

    @Test(priority = 5, description = "Task-5 - Amazon Address Modal")
    public void testAmazonAddressModal(){


        driver.get("https://www.amazon.com/");
        amazonHomePage.deliverToCanadaLink.click();
        Assert.assertTrue(amazonHomePage.chooseYourLocationModal.isDisplayed());

        String zipCode = "60018";

        amazonHomePage.zipCodeInputBox.sendKeys(zipCode);
        amazonHomePage.applyButton.click();
        Waiter.pause(4);

        Assert.assertTrue(amazonHomePage.deliveryMessage.getText().contains(zipCode));
    }

}
