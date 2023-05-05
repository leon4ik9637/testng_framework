package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DropdownHandler;
import utilities.Waiter;

public class _07_DropdownTest extends Base{
    /*
    1. Go to https://www.facebook.com/
    2. Click on "Create New Account" link
    3. Enter below information and click on Sign Up button
    First name = John
    Last name = Doe
    Email address = johndoe55555@gmail.com
    Password = abcd1234
    Birthday = April 1, 1990
    Gended= Male
    4. Validate below error message is displayed with expected text
    Please choose a more secure password. It should be longer than 6
    characters, unique to you, and difficult for others to guess.
     */

    @Test(priority = 2, description = "TC235: Validate, after entering information, the error message matches")
    public void testUnsecurePasswordErrorMessage (){
        driver.get("https://www.facebook.com");
        Waiter.pause(2);

        facebookPage.createNewAccountLink.click();
        Waiter.pause(2);

        facebookPage.firstNameInputBox.sendKeys("John");
        facebookPage.lastNameInputBox.sendKeys("Doe");
        facebookPage.emailInputBox.sendKeys("johndoe55555@gmail.com");
        facebookPage.emailReEnterInputBox.sendKeys("johndoe55555@gmail.com");
        facebookPage.passwordInputBox.sendKeys("abcd1234");

        //To be able to select an option from dropdown we need instance of Select class
        //Select monthSelector = new Select(facebookPage.monthDropdown);
        // monthSelector.selectByValue("4"); // selection by value
        // monthSelector.selectByVisibleText("Apr"); // selection by visible text
        //monthSelector.selectByIndex(3); // select by index

        DropdownHandler.selectOptionByIndex(facebookPage.monthDropdown, 3);

//        Select daySelector = new Select(facebookPage.dayDropdown);
//        daySelector.selectByValue("1");
        DropdownHandler.selectOptionByValue(facebookPage.dayDropdown, "1");

//        Select yearSelector = new Select(facebookPage.yearDropdown);
//        yearSelector.selectByValue("1991");
        DropdownHandler.selectOptionByVisibleText(facebookPage.yearDropdown, "1991");

        facebookPage.genderRadioButton.get(1).click();

        facebookPage.signUpButtonLink.click();

        // Waiter.waitForVisibilityOfElement(driver, facebookPage.errorMessage,15);

        String expectedMessage = "Please choose a more secure password. It should be longer than 6 characters, unique to you, and difficult for others to guess.";

        // new WebDriverWait(driver, 30).until(ExpectedConditions.textToBePresentInElement(facebookPage.errorMessage, expectedMessage));
        Waiter.waitUntilTextToBePresentInElement(driver, 60, facebookPage.errorMessage, expectedMessage);
        Assert.assertEquals(facebookPage.errorMessage.getText(), expectedMessage, "Error message has issues!!!");

    }

    /*
        Go to https://www.expedia.com
        Select "Flights" from "MoreTravel" dropdown
        Select "Premium economy" from "Economy" dropdown
        Validate "Premium economy" is selected
         */

    @Test(priority = 2, description = "TC578: Validate Expedia dropdowns")
    public void testExpediaDropdowns(){
        driver.get("https://www.expedia.com");
        expediaPage.flights.click();
        expediaPage.flightTypesDropdown.click();
        Waiter.pause(3);
        expediaPage.flightOptions.click();

        Assert.assertEquals(expediaPage.flightTypesDropdown.getText(), "Premium economy");

    }

    /*
    Go to https://www.ebay.com/
    Select "Art" from "All Categories" dropdown
    Click on "Search" button
    Validate "Welcome to eBay Art" heading1
    Validate "Find Prints, Paintings, Posters, and More." heading2
     */

    @Test(priority = 3, description = "TC242: Validate Ebay dropdown")
    public void testEbayDropdown(){

        driver.get("https://www.ebay.com/");
        DropdownHandler.selectOptionByVisibleText(ebayPage.allCategories, "Art");

        ebayPage.searchButton.click();

        Assert.assertEquals(ebayPage.heading1.getText(), "Welcome to eBay Art");
        Assert.assertEquals(ebayPage.heading2.getText(), "Find Prints, Paintings, Posters, and More.");


    }


}
