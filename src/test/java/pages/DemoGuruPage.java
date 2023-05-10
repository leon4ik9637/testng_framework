package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoGuruPage {
    public DemoGuruPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "uploadfile_0")
    public WebElement chooseFileInputBox;

    @FindBy(id = "terms")
    public WebElement acceptTermsCheckBox;

    @FindBy(xpath = "//h3")
    public WebElement fileUploadedTextHeading3;

    @FindBy(id = "submitbutton")
    public WebElement submitFileButton;
}
