package org.apipractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCaseBoilerPlate {

    ChromeDriver driver;
    @BeforeTest
    public void openBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--guest");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @Test
    public void test() throws Exception{


    }



    @AfterTest
    public void cloaseBrowser() {

        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();

    }
}
