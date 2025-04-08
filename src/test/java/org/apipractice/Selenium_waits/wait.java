package org.apipractice.Selenium_waits;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class wait {

    @Description("Waits")
    @Test
    public void test_Wait() throws Exception{

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
     try {
         Thread.sleep(2000);  // Halt the JVM not Webdriver
     } catch (InterruptedException e) {
         throw new RuntimeException(e);
     }




    }
}
