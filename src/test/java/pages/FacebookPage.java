package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FacebookPage {

    public FacebookPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[id^='u_0_']")
    public WebElement createNewAccountLink;


    //Sign Up Form
    @FindBy(css = "._8esa")
    public List<WebElement> genderRadioButton;

    @FindBy(css = "input[name='firstname']")
    public WebElement firstNameInputBox;

    @FindBy(css = "input[name='lastname']")
    public WebElement lastNameInputBox;

    @FindBy(xpath = "//input[@name='reg_email__']")
    public WebElement emailInputBox;

    @FindBy(xpath = "//input[@name='reg_email_confirmation__']")
    public WebElement emailReEnterInputBox;

    @FindBy(css = "input[name='reg_passwd__']")
    public WebElement passwordInputBox;

    @FindBy(id = "month")
    public WebElement monthDropdown;

    @FindBy(id = "day")
    public WebElement dayDropdown;

    @FindBy(id = "year")
    public WebElement yearDropdown;

    @FindBy(id = "reg_error_inner")
    public WebElement errorMessage;

    @FindBy(css = "button[name='websubmit']")
    public WebElement signUpButtonLink;


}
