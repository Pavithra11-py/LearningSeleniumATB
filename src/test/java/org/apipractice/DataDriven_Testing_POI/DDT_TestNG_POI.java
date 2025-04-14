package org.apipractice.DataDriven_Testing_POI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DDT_TestNG_POI {

    public ChromeDriver driver;

    @BeforeTest
    public void openBrowser(){

        ChromeOptions edgeOptions = new ChromeOptions();
        edgeOptions.addArguments("--guest");
        driver = new ChromeDriver(edgeOptions);

    }

    @Test(dataProvider = "getData")
    public void DDT(String email, String password) {

        System.out.println(email +"-->"+ password);

    }
 @DataProvider
    public Object[][] getData()
    {
return new Object[][] {
//3X 2 matrix
        new Object[]{"admin@gmail.com","pass"},
        new Object[]{"admin123@gmail.com","pass123"},
        new Object[]{"admin1234@gmail.com","pass124"}
};

    }

    @DataProvider
    public Object[][] getDataxlsx(){
        // READ THE DATA FROM THE EXCEL FILE
        // GIVE THEM IN THE 2D ARRAY
        return new Object[][]{};
    }



    @AfterTest
    public void closeBrowser(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

}
