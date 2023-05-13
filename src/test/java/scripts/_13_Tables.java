package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

import java.util.List;

public class _13_Tables extends Base{

    /*
    1. Go to http://the-internet.herokuapp.com/
    2. Click on “Sortable Data Tables” link
    3. Validate the table 1 headers to be displayed as below
    Last Name
    First Name
    Email
    Due
    Web Site
    Action
     */

    @Test(priority = 1, description = "Validate Table Headers")
    public void validateTableHeaders(){
        driver.get("http://the-internet.herokuapp.com/");

        heroAppPage.clickOnLink("Sortable Data Tables");

        String[] table1HeadersText = {"Last Name", "First Name", "Email", "Due", "Web Site", "Action"};

        for (int i = 0; i < 6; i++) {
            Waiter.waitForVisibilityOfElement(driver, heroAppPage.table1Headers.get(i), 30);
            Assert.assertEquals(heroAppPage.table1Headers.get(i).getText(), table1HeadersText[i]);
        }

    }


    /*
    1. Go to http://the-internet.herokuapp.com/
    2. Click on “Sortable Data Tables” link
    3. Validate the table 1 row 1 to be displayed as below
    Smith
    John
    jsmith@gmail.com
    $50.00
    http://www.jsmith.com
    edit delete
     */

    @Test(priority = 2, description = "Validate table row 1")
    public void validateTableRow(){
        driver.get("http://the-internet.herokuapp.com/");

        heroAppPage.clickOnLink("Sortable Data Tables");

        String[] table1Row1Texts = {"Smith", "John", "jsmith@gmail.com",
                "$50.00", "http://www.jsmith.com", "edit delete"};


        List<WebElement> table1Row1Data = driver.findElements(By.cssSelector("#table1 tbody tr:nth-child(1)>td"));

        for (int i = 0; i < 6; i++) {
            Assert.assertEquals(table1Row1Data.get(i).getText(), table1Row1Texts[i]);
        }
    }

    /*
        1. Go to http://the-internet.herokuapp.com/
    2. Click on “Sortable Data Tables” link
    3. Validate the table 1 column 2 (First Name) to be
    displayed as below
    John
    Frank
    Jason
    Tim
         */

    @Test(priority = 3, description = "Validate table column values")
    public void validateTableColumn(){
        driver.get("http://the-internet.herokuapp.com/");

        heroAppPage.clickOnLink("Sortable Data Tables");

        String[] table1Row1Texts = {"John", "Frank", "Jason",
                "Tim"};

        List<WebElement> columnFirstNames = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[2]"));

        for (int i = 0; i < 4; i++) {
            Assert.assertEquals(columnFirstNames.get(i).getText(), table1Row1Texts[i]);
            System.out.println(columnFirstNames.get(i).getText());
        }

    }

    @Test(priority = 4, description = "Tables | all cells")
    public void testAllCells(){

        driver.get("http://the-internet.herokuapp.com/");

        heroAppPage.clickOnLink("Sortable Data Tables");

        List<WebElement> allCells = driver.findElements(By.cssSelector("#table1 td"));
        System.out.println(allCells.size());

        for (WebElement element : allCells) {
            System.out.println(element.getText());
            Assert.assertNotEquals(element.getText(), "");
        }

    }

    /*
     Go to http://the-internet.herokuapp.com/
    • Click on “Sortable Data Tables” link
    • Validate the “Web Site” column data to be
    displayed as below
    http://www.jsmith.com
    http://www.frank.com
    http://www.jdoe.com
    http://www.timconway.com
     */

    @Test(priority = 5, description = "Tables | Validate emails column")
    public void testEmailColumnData(){
        driver.get("http://the-internet.herokuapp.com/");

        heroAppPage.clickOnLink("Sortable Data Tables");

        String[] table1WebSiteColumnTexts = {"http://www.jsmith.com", "http://www.frank.com",
                "http://www.jdoe.com", "http://www.timconway.com"};

        List<WebElement> emailDataColumn = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[5]"));

        for (int i = 0; i < 4; i++) {
            Assert.assertEquals(emailDataColumn.get(i).getText(), table1WebSiteColumnTexts[i]);
        }





    }









































}
