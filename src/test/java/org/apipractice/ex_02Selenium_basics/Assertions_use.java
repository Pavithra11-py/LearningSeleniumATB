package org.apipractice.ex_02Selenium_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Assertions_use {
    @Description("open the URL")
    @Test

    public void test_selenium_01() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");
        // we can use AssertJ also directly
         assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com/");

        driver.quit();
    }
}