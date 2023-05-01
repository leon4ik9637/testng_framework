package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.Key;

public class _03_EtsyTest extends Base{
    /*
    1. Go to https://www.etsy.com/
    2. Validate Etsy Logo is displayed
     */

    @Test(priority = 1)
    public void etsyLogoIsDisplayed(){
        driver.get("https://www.etsy.com/");

        WebElement etsyLogo = driver.findElement(By.id("logo"));
        Assert.assertTrue(etsyLogo.isDisplayed());
    }

    /*
    1. go to https://www.etsy.com/
    2. validate etsy search input box and search button is displayed
     */

    @Test(priority = 3)
    public void testEtsySearch(){
        driver.get("https://www.etsy.com/");

        WebElement inputBox = driver.findElement(By.id("global-enhancements-search-query"));
        WebElement searchButton = driver.findElement(By.xpath("//button[@data-id='gnav-search-submit-button']"));

        Assert.assertTrue(inputBox.isDisplayed());
        Assert.assertTrue(searchButton.isDisplayed());
    }

    @Test (priority = 2, dependsOnMethods = "testEtsySearch")
    public void testEtsySearchResult(){
        driver.get("https://www.etsy.com/");

        WebElement searchInputBox = driver.findElement(By.id("global-enhancements-search-query"));
        searchInputBox.sendKeys("canvas painting" + Keys.ENTER);

        WebElement resultTag = driver.findElement(By.cssSelector(".wt-display-inline-flex-sm>span"));

        Assert.assertTrue(Integer.parseInt(resultTag.getText().replaceAll("[^0-9]", "")) > 0);


    }

}
