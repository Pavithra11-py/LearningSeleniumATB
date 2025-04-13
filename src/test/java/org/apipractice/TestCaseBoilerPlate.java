package org.apipractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCaseBoilerPlate {

     public   ChromeDriver driver;
    public  ChromeOptions options;
    @BeforeTest
    public void openBrowser() {
       options = new ChromeOptions();
        options.addArguments("--guest");
       // options.addArguments("--incognito");
        options.addArguments("start-maximized");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }




    @AfterTest
    public void closeBrowser() {

        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();

    }
}
