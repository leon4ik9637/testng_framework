package scripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class _04_GoogleSearchTest extends Base{

    @Test(priority = 1, description = "TC765: Validate Google Search")
    public void testGoogleSearch(){
        driver.get("https://www.google.com/");

        googleSearchPage.searchInputBox.sendKeys("Selenium" + Keys.ENTER);

        String results = googleSearchResultPage.resultTag.getText();


        Assert.assertTrue(Integer.parseInt(results.substring(results.indexOf(" ") + 1, results.indexOf("results")-1).replaceAll(",", "")) > 0);
    }

    @Test (priority = 2, description = "TC123: Validate Google Store Link")
    public void testGoogleStoreLink(){
        driver.get("https://www.google.com/");


        //explicitWait.until(ExpectedConditions.visibilityOf(googleSearchPage.storeLink));
        Waiter.waitForVisibilityOfElement(driver, googleSearchPage.storeLink, 30);
        googleSearchPage.storeLink.click();

        //Throw exception - Use explicit wait to prevent
        //explicitWait.until(ExpectedConditions.titleIs("Google Store for Google Made Devices & Accessories"));
        Waiter.waitUntilTitleIs(driver, 30, "Google Store for Google Made Devices & Accessories");

        Assert.assertEquals(driver.getTitle(), "Google Store for Google Made Devices & Accessories");
    }

}
