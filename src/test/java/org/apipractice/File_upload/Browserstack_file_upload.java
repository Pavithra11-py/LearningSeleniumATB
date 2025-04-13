package org.apipractice.File_upload;

import org.apipractice.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.apipractice.WaitHelper.WaitHelpers.waitJVM;


public class Browserstack_file_upload  extends TestCaseBoilerPlate{

    @Test
    public void test_file() {

        //pavithranaya1108@gmail.com
        //Pav12345
        //src/test/java/org/apipractice/File_upload/testdroid-sample-app.apk
        driver.get("https://app-automate.browserstack.com/dashboard/v2/getting-started");
        waitJVM(3000);
        WebElement username =  driver.findElement(By.id("user_email_login"));
        username.sendKeys("pavithranaya1108@gmail.com");

        WebElement passw = driver.findElement(By.id("user_password"));
        passw.sendKeys("Pav12345");

        WebElement sign_mein = driver.findElement(By.xpath("//input[@data-faitracker-input-id=\"form-1.field-6\"]"));
        sign_mein.click();
        waitJVM(5000);

        WebElement input = driver.findElement(By.xpath("//form[@id=\"upload_form\"]/input"));
        input.click();

        String working_dir = System.getProperty("user.dir");
        System.out.println(working_dir);

        input.sendKeys(working_dir+"/src/test/java/org/apipractice/File_upload/testdroid-sample-app.apk");
        WebElement check = driver.findElement(By.xpath("//div[@class=\"prism-snippet__container\"]"));
         Assert.assertTrue(check.getText().contains("bs"));

    }

}
