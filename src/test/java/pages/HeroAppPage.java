package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HeroAppPage {
    /*
    1. go to "https://the-internet.herokuapp.com/"
     */

    public HeroAppPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//ul/li/a")
    public List<WebElement> links;

    @FindBy(css = "#content a")
    public WebElement multipleWindowsPageClickHereLink;

    @FindBy(css = "#content h3")
    public WebElement windowsH3;

    @FindBy(id = "file-upload")
    public WebElement chooseFileInputBox;

    @FindBy(id = "file-submit")
    public WebElement uploadFileButton;

    @FindBy(xpath = "//h3")
    public WebElement fileUploadedH3;

    @FindBy(id = "uploaded-files")
    public WebElement uploadedFileText;

    @FindBy(linkText = "myFileGron2.xls")
    public WebElement downloadFileLink;

    @FindBy(xpath = "//h3")
    public WebElement newWindowH3;

    @FindBy(css = "#checkboxes>input")
    public List<WebElement> checkboxes;

    @FindBy(xpath = "//ul//button")
    public List<WebElement> alertButtons;

    @FindBy(id = "result")
    public WebElement resultParagraph;

    @FindBy(id = "dropdown")
    public WebElement dropdown;

    @FindBy(xpath = "//a[text()='iFrame']")
    public WebElement iFrameLink;

    @FindBy(css = "#tinymce>p")
    public WebElement iFrameContentBox;

    @FindBy(xpath = "//h3")
    public WebElement iFrameHeading3;

    @FindBy(css = "#table1 th")
    public List<WebElement> table1Headers;

    public void clickOnLink(String linkText){
        for (WebElement link : links) {
            if(link.getText().equals(linkText)){
                link.click();
                break;
            }
        }
    }

    public void clickOnAlertButton(String buttonText){
        for(WebElement element : alertButtons){
            if(element.getText().equals(buttonText)){
                element.click();
                break;
            }
        }
    }

}
