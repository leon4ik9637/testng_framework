package scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
import utilities.Waiter;

public class _14_Scrolling extends Base{

    @Test
    public void testScrolling(){
        driver.get("https://football.ua/");
        Waiter.pause(3);

        // actions.moveToElement(tgApplicationPage.applyNowButton).perform();
        // actions.sendKeys(Keys.PAGE_DOWN).perform();

        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", footballUAHomePage.faceBookIcon);
        Waiter.pause(3);



    }

}
