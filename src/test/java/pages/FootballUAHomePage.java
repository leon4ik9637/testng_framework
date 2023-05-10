package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FootballUAHomePage {

    public FootballUAHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".fb>a")
    public WebElement faceBookIcon;
}
