package org.apipractice.ex_02Selenium_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class commands_imp {
    @Description("open the URL")
    @Test

    public void test_selenium_01(){
         WebDriver driver = new EdgeDriver();
         driver.get("https://www.google.com");

         driver.manage().window(). maximize();
        driver.manage().window(). minimize();


        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        driver.quit();
    }
}
