package org.apipractice.Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Timeout_exception {

    public ChromeDriver driver;

    @BeforeTest
    public void openBrowser(){

        ChromeOptions edgeOptions = new ChromeOptions();
        edgeOptions.addArguments("--guest");
        driver = new ChromeDriver(edgeOptions);

    }

    @Test
    public void test_selenium_exceptions() {


        System.out.println("Start of program");
        driver.get("https://google.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
         //waiting for element which is not found
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='abc']")));


        WebElement input_box = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        input_box.sendKeys("the testing");


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
