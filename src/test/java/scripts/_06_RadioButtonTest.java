package scripts;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class _06_RadioButtonTest extends Base{

    /*
    Go to https://www.facebook.com/
    Click on "Create New Account" link
    Validate "Female", "Male", and "Custom" radio buttons are displayed, enabled and not selected
    Select "Female" and validate it is selected
    Select "Male" radio button and validate "Male" is selected and "Female" is deselected
     */

    @Test(priority = 1, description = "TC234: Validate Facebook gender radio buttons")
    public void testFacebookGenderRadioButtons(){
        driver.get("https://www.facebook.com/");

        Waiter.pause(2);
        facebookPage.createNewAccountLink.click();
        Waiter.pause(2);

        for (WebElement element : facebookPage.genderRadioButton) {
            softAssert.assertTrue(element.isDisplayed(), "Element IS NOT displayed");
            softAssert.assertTrue(element.isEnabled(), "Element IS NOT enabled");
            softAssert.assertFalse(element.isSelected(), "Element IS selected");
        }
        Waiter.pause(2);

        facebookPage.genderRadioButton.get(0).click();
        Assert.assertTrue(facebookPage.genderRadioButton.get(0).isSelected());
        Waiter.pause(2);

        facebookPage.genderRadioButton.get(1).click();
        Assert.assertTrue(facebookPage.genderRadioButton.get(1).isSelected());

        Assert.assertFalse(facebookPage.genderRadioButton.get(0).isSelected());


        /*
        for(int i = 0; i <= 1; i++){
            facebookPage.genderRadioButton.get(i).click();
            Assert.assertTrue(facebookPage.genderRadioButton.get(i).isSelected());
        }
         Assert.assertFalse(facebookPage.genderRadioButton.get(0).isSelected());
         */

    }


}
