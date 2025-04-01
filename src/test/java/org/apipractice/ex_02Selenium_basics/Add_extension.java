package org.apipractice.ex_02Selenium_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Add_extension {

    @Description("Options class")
    @Test
    public void test() throws Exception {

        EdgeOptions edgeoptions = new EdgeOptions();
        edgeoptions
                .addArguments("--window-size=1920,1080");
        edgeoptions.addExtensions(new File("src/test/java/org/apipractice/ex_02Selenium_basics/CRX.crx"));
        WebDriver driver = new EdgeDriver(edgeoptions);
        driver.get("https://www.youtube.com/watch?v=BwTSxsAqlEc");

        // driver.manage().deleteAllCookies();
       driver.quit();

    }
}
