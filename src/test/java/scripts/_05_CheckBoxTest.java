package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class _05_CheckBoxTest extends Base{

    @Test(priority = 1, description = "TC001: Validate checkbox in hero app")
    public void testCheckBoxInHeroApp(){
        driver.get("https://the-internet.herokuapp.com/");

        Waiter.pause(2);
        heroAppPage.clickOnLink("Checkboxes");

        // Validate both checkboxes are displayed and enabled
        for(WebElement element : heroAppPage.checkboxes){
            Assert.assertTrue(element.isDisplayed());
            Assert.assertTrue(element.isEnabled());
        }

        //Validate checkbox 1 is not selected and checkbox 2 is selected
        Assert.assertFalse(heroAppPage.checkboxes.get(0).isSelected());
        Assert.assertTrue(heroAppPage.checkboxes.get(1).isSelected());

        // Select "checkbox 1" and validate it is selected
        heroAppPage.checkboxes.get(0).click();
        Assert.assertTrue(heroAppPage.checkboxes.get(0).isSelected());

        // Deselect both "checkbox 1" and "checkbox 2" and validate they are deselected
        for (WebElement element : heroAppPage.checkboxes) {
            element.click();
            Assert.assertFalse(element.isSelected());
        }


    }

}
