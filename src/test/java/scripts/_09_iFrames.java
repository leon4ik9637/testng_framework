package scripts;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _09_iFrames extends Base{

    /*
    1. Go to http://the-internet.herokuapp.com/
    2. Click on “Frames” link
    3. Click on “iFrame” link
    4. Clear text “Your content goes here.” in the content box
    5. Enter “Hello World” in the content box
    6. Validate the text of the content box is “Hello World”
    7. Validate the heading3 as “An iFrame containing the TinyMCE WYSIWYG Editor”

     */

    @Test(priority = 1)
    public void testIFrame1(){
        driver.get("http://the-internet.herokuapp.com/");

        heroAppPage.clickOnLink("Frames");

        heroAppPage.iFrameLink.click();

        // Switch to inner html - iframe
        // driver.switchTo().frame(0);
        driver.switchTo().frame("mce_0_ifr");
        heroAppPage.iFrameContentBox.clear();
        heroAppPage.iFrameContentBox.sendKeys("Hello World");
        Assert.assertEquals(heroAppPage.iFrameContentBox.getText(), "Hello World");

        // Switch back to parent html - outer
        driver.switchTo().parentFrame();
        Assert.assertEquals(heroAppPage.iFrameHeading3.getText(), "An iFrame containing the TinyMCE WYSIWYG Editor");

    }

    /*
    1. Go to https://www.rediff.com/
    2. Validate money iFrame displayed
    with cell one and cell two
     */

    @Test(priority = 2, description = "Validate money iFrame is displayed")
    public void testIFrame2(){

        driver.get("https://www.rediff.com/");

        System.out.println(rediffHomePage.moneyCells.size()); // 3

        driver.switchTo().frame(rediffHomePage.moneyIFrame);
//        driver.switchTo().frame(0); // index
//        driver.switchTo().frame("moneyiframe"); //id

        System.out.println(rediffHomePage.moneyCells.size()); // 2
        /*2
        LIVE: BSE  61,761.33 -2.92
        NSE  18,265.95 +1.55
        */

        for (WebElement element : rediffHomePage.moneyCells){
            System.out.println(element.getText());
            Assert.assertTrue(element.isDisplayed());
        }




    }
}
