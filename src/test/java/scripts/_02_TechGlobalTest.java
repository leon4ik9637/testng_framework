package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_TechGlobalTest extends Base{
        /*
        1. go to https://www.carvana.com
        2. validate  heading is displayed and the text for it is equal to
        "Register Today"
         */


    @Test (description = "TC123: Validate Application form heading")
    public void testApplicationFormHeading(){
        driver.get("https://www.carvana.com");

        Assert.assertTrue(tgApplicationPage.heading1.isDisplayed());
        Assert.assertEquals(tgApplicationPage.heading1.getText(), "Affordable Cars Available Now");
    }

}
