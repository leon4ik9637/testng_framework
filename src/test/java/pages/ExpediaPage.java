package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpediaPage {

    public ExpediaPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#primary-navigation button")
    public WebElement moreTravelDropdown;

    @FindBy(xpath = "//*[@id='wizardMainRegionV2']/div/div/div/div/ul/li[2]/a")
    public WebElement flights;

    @FindBy(id = "preferred-class-input-trigger")
    public WebElement flightTypesDropdown;

    @FindBy(xpath = "//*[@id='preferred-class-input']/div/div/a[2]")
    public WebElement flightOptions;
}
