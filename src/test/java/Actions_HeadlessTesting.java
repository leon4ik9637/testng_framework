public class Actions_HeadlessTesting {
    /*
    Mouse actions:
    1. Move - navigate
    2. Click
    3. Right click
    4. Double click
    5. Click & Hold - release
    6. Drag and drop -> source, target

    Keyboard actions:
    1. sendKeys
    2. key down -> press
    3. key up -> release

    Action class
    - is provided by Selenium for handling keyboard
    and mouse events
    - we can use Actions class to perform all
    advanced mouse and keyboard actions

    SYNTAX:
    Actions actions = new Actions(driver);

    -build() and perform() methods
    - build() method is used to get keyboard or mouse
    action to be ready to perform, but it is
    optional with new version
    - perform() method is used to perform ready
    keyboard or mouse action to operate
    - with new versions of Selenium, build() is not
    required to perform a keyboard or mouse action,
    but we must use perform() method after each
    action

    @FindBy(css = ".category-cards>div")
    public List<WebElements> categoryCards;


    public void clickOnCategoryCard(String categoryText){
        for(WebElement element : categoryCards){
            if(element.getText().equals(categoryText){
                element.click();
                break;
            }
        }
    }

    Action class:
    - It allows performing advanced mouse and keyboard
    actions
    - Driver allows us sendKeys(), click(), clear()
    - Actions class also allows dragAndDrop(), doubleClick(),
    contextClick(), moveToElement(), keyDown(), keyUp()

























     */
}
