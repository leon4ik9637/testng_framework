package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class _11_FileUpload extends Base{
    /*
    1. Create a text file in your project called “myFile.txt”
    2. Go to http://the-internet.herokuapp.com/
    3. Click on “File Upload” link
    4. Choose created file to be uploaded to the page
    5. Click on “Upload” button
    6. Validate “File Uploaded!” heading3 text
    7. Validate ”myFile.txt” in the uploaded file list
     */

    @Test(priority = 1, description = "File Upload")
    public void testFileUpload1(){
        driver.get("http://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("File Upload");

        heroAppPage.chooseFileInputBox.sendKeys("/Users/leon.kuchman/IdeaProjects/testng_framework/myFileGron2.xls");

        heroAppPage.uploadFileButton.click();

        // Locate 2 more elements

        Assert.assertEquals(heroAppPage.fileUploadedH3.getText(), "File Uploaded!");
        Assert.assertEquals(heroAppPage.uploadedFileText.getText(), "myFileGron2.xls");
    }


    /*
    1. Go to http://the-internet.herokuapp.com/
    2. Click on “File Download” link
    3. Click on “myFileGron2.xls” link
    4. Validate “myFileGron2.xls” file is downloaded in your “Downloads”
    folder
     */

    @Test(priority = 3, description = "File download")
    public void testFileDownload(){
        driver.get("http://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("File Download");

        heroAppPage.downloadFileLink.click();
        Waiter.pause(10);

    }

    /*
    1. Create a text file in your project called “fruits.txt”
    2. Go to http://demo.guru99.com/test/upload/
    3. Choose created file to be uploaded to the page
    4. Click on “I accept terms of service”
    5. Click on “Submit File” button
    6. Validate “1 file has been successfully uploaded.”
    text

     */

    @Test(priority = 4, description = "File Upload Confirmation")
    public void testUploadFile3(){
        driver.get("http://demo.guru99.com/test/upload/");
        demoGuruPage.chooseFileInputBox.sendKeys("/Users/leon.kuchman/IdeaProjects/testng_framework/fruits.txt");
        demoGuruPage.acceptTermsCheckBox.click();
        demoGuruPage.submitFileButton.click();

        Waiter.pause(5);
        Assert.assertEquals(demoGuruPage.fileUploadedTextHeading3.getText(), "1 file\n" +
                "has been successfully uploaded.");


    }


}
