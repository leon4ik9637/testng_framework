package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class _10_WindowHandles extends Base{

    /*
    Test Case 1: Validate FaceBook social media icon for TechGlobalSchool
    1. Go to https://football.ua/
    2. Click on FB icon in the footer
    3. Validate user is routed to https://www.facebook.com/footballua/
     */

    @Test(priority = 1, description = "Test Case 1: Validate FaceBook social media icon for TechGlobalSchool")
    public void testTechGlobalSchoolFaceBookIcon(){
        driver.get("https://football.ua/");

        String footballUAWindowHandle = driver.getWindowHandle();
        footballUAHomePage.faceBookIcon.click();

        //2 tabs
        for(String windowHandle : driver.getWindowHandles()){
            if(!windowHandle.equals(footballUAWindowHandle)) driver.switchTo().window(windowHandle);
        }

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/footballua/");
    }

    /*
    TEST CASE 2: MULTIPLE WINDOWS
    1. Go to http://the-internet.herokuapp.com/
    2. Click on “Multiple Windows” link
    3. Click on “Click Here” link
    4. Validate the heading3 as “New Window”
    5. Navigate back to previous window
    6. Validate the heading3 as “Opening a new window”
     */

    @Test(priority = 2, description = "TEST CASE 2: MULTIPLE WINDOWS")
    public void testWindowHandle2(){

        driver.get("http://the-internet.herokuapp.com/");

        String mainWindow = driver.getWindowHandle();

        heroAppPage.clickOnLink("Multiple Windows");
        heroAppPage.multipleWindowsPageClickHereLink.click();
        Waiter.pause(4);
        for(String windowHandle : driver.getWindowHandles()){
            if(!windowHandle.equals(mainWindow)) driver.switchTo().window(windowHandle);
        }

        Assert.assertEquals(heroAppPage.newWindowH3.getText(), "New Window");
        driver.switchTo().window(mainWindow);

        Assert.assertEquals(heroAppPage.windowsH3.getText(), "Opening a new window");

    }
}
