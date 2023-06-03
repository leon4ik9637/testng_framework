package scripts;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class _01_AppleTest extends Base{


    @Test(priority = 1, groups = "Functional")
    public void testAppleTitle(){
        driver.get("https://www.apple.com/");

        String expectedTitle = "Apple";
        String actualTitle = driver.getTitle();
        /*
        Instead of if-else validation, we will use TestNG assertion
        if(actualTitle.equals(expectedTitle)) System.out.println("Apple title validation PASSED");
        else System.out.println("Apple title validation FAILED");
         */

        Assert.assertEquals(actualTitle, expectedTitle);
    }



    @Test (priority = 2, description = "TC873")
    public void testAppleURL(){
        driver.get("https://www.apple.com/");

        String expectedURL = "https://www.apple.com/";
        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(actualURL, expectedURL);
    }

    @Test(enabled = false, priority = 3, description = "TC092")
    public void X(){

        //fail() method is used to fail a test on purpose
        // We use this for known issues
        Assert.fail("Failure on purpose");
    }



}
