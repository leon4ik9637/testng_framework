package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EtsySearchPage {

    public EtsySearchPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    // Locate all Etsy Search Page web elements here
    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchInputBox;

    @FindBy(xpath = "//button[@data-id='gnav-search-submit-button']")
    public WebElement searchButton;

    @FindBy(id = "logo")
    public WebElement logo;

    @FindBy(css = ".wt-display-inline-flex-sm>span")
    public WebElement resultTag;

    @FindBy(css = "ul[data-ui='top-nav-category-list'] span")
    public List<WebElement> mainHeaderLinks;

    @FindBy(css = ".signin-header-action ")
    public WebElement signInButton;

    @FindBy(css = ".wt-overlay--animation-done")
    public WebElement signInModal;

    @FindBy(id = "join-neu-overlay-title")
    public WebElement signInHeading1;

    @FindBy(css = "ul[data-node-id='10855']>li")
    public List<WebElement> jewelleryAndAccessoriesItems;
}
