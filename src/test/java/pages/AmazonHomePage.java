package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {

    public AmazonHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "nav-global-location-popover-link")
    public WebElement deliverToCanadaLink;

    @FindBy(css = ".a-popover-wrapper")
    public WebElement chooseYourLocationModal;

    @FindBy(id = "GLUXZipUpdateInput")
    public WebElement zipCodeInputBox;

    @FindBy(css = "#GLUXZipUpdate input")
    public WebElement applyButton;

    @FindBy(id = "GLUXHiddenSuccessSelectedAddressPlaceholder")
    public WebElement deliveryMessage;




}
