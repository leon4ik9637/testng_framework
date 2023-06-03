package scripts;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_EtsyTest extends Base{
    /*
    1. Go to https://www.etsy.com/
    2. Validate Etsy Logo is displayed
     */


    @Test(priority = 1)
    public void etsyLogoIsDisplayed(){
        driver.get("https://www.etsy.com/");

        // Get searchInputBox and searchButton web elements from EtsyPage
        //WebElement etsyLogo = driver.findElement(By.id("logo"));

        Assert.assertTrue(etsySearchPage.logo.isDisplayed());
    }

    /*
    1. go to https://www.etsy.com/
    2. validate etsy search input box and search button is displayed
     */

    @Test(priority = 3)
    public void testEtsySearch(){
        driver.get("https://www.etsy.com/");

//        WebElement inputBox = driver.findElement(By.id("global-enhancements-search-query"));
//        WebElement searchButton = driver.findElement(By.xpath("//button[@data-id='gnav-search-submit-button']"));

        Assert.assertTrue(etsySearchPage.searchInputBox.isDisplayed());
        Assert.assertTrue(etsySearchPage.searchButton.isDisplayed());
    }

    @Test (priority = 2, dependsOnMethods = "testEtsySearch")
    public void testEtsySearchResult(){
        driver.get("https://www.etsy.com/");

        //Get searchInputBox again from EtsySearchPage
//        WebElement searchInputBox = driver.findElement(By.id("global-enhancements-search-query"));
        etsySearchPage.searchInputBox.sendKeys("canvas painting" + Keys.ENTER);

//        WebElement resultTag = driver.findElement(By.cssSelector(".wt-display-inline-flex-sm>span"));

        Assert.assertTrue(Integer.parseInt(etsySearchPage.resultTag.getText().replaceAll("[^0-9]", "")) > 0);


    }

    @Test(priority = 4, description = "TC905: Validate Etsy main header")
    public void testMainHeader(){
        driver.get("https://www.etsy.com/");

        String[] expectedTexts = {"Father's Day Gifts", "Jewellery & Accessories",
                        "Clothing & Shoes", "Home & Living",
                        "Wedding & Party", "Toys & Entertainment",
                        "Art & Collectibles", "Craft Supplies"};

        for (int i = 0; i < 8; i++) {
            Assert.assertEquals(etsySearchPage.mainHeaderLinks.get(i).getText(), expectedTexts[i]);
        }

    }

}
