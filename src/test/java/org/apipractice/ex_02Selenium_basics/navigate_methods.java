package org.apipractice.ex_02Selenium_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class navigate_methods {
    @Description("Open the URL")
    @Test
    public void test_Selenium01() throws Exception {
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        //Navigate commands
        //driver.get("url")

        // Navigate Methods - we have 2 types
        // get() and to()
        // both are same get we cant refresh, forward,back
        // in to() we can do back, refresh, forward...

        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        Thread.sleep(5000);
    }
}
