package org.apipractice.EX_SeleniumBasics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class TestSelenium_01 {

    @Test
    public void test_VerifyVWOLogin(){
        // Write the code which will execute the perform the ui interactions
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getSessionId());
        System.out.println(driver.getTitle());
        driver.quit();
    }

}
