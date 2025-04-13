package org.apipractice.File_upload;


import org.apipractice.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.apipractice.WaitHelper.WaitHelpers.waitJVM;

//selenium supports file upload onl if is=t is created using input tag
public class file_upl extends TestCaseBoilerPlate{

    @Test
    public void file_upload(){

        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));

        String working_dir = System.getProperty("user.dir");
        System.out.println(working_dir);


        uploadFileInput.sendKeys(working_dir+"/src/test/java/org/apipractice/File_upload/TestData.txt");


    }

}
