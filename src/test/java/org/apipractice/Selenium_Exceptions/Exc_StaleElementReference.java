package org.apipractice.Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exc_StaleElementReference {


    public ChromeDriver driver;

    @BeforeTest
    public void openBrowser(){

        ChromeOptions edgeOptions = new ChromeOptions();
        edgeOptions.addArguments("--guest");
        driver = new ChromeDriver(edgeOptions);

    }

    @Test
    public void test_selenium_exceptions() {

        driver.get("https://google.com");
        System.out.println("Start of program");

        WebElement search_input_box  = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        System.out.println(driver.getWindowHandle());

        driver.navigate().refresh();

        try {
            search_input_box.sendKeys("the testing academy"+ Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            System.out.println("StaleElementReferenceException");
        }
        // org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found


        System.out.println(driver.getWindowHandle());
        System.out.println("End of program");



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
