package org.apipractice.ex_02Selenium_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class chrome_driver_notgive_edge {
    @Description("Open the URL")
    @Test
    public void test_Selenium01() throws Exception {


        ChromeDriver driver = new ChromeDriver();
        //driver = new FirefoxDriver();   here it is not possible to open firefox
        // only chrome it would work

        WebDriver driver1 = new ChromeDriver();
        driver1 = new FirefoxDriver();


    }
}
