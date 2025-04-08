package org.apipractice.ex_02Selenium_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Options_class {

    @Description("Options class")
    @Test
    public void test() throws Exception {
        ChromeOptions edgeoptions = new ChromeOptions();
        // FirefoxOptions, ChromeOptions, SafariOptions

        // EdgeOptions -> It will help you set the browser
        // options to browsers
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // add extensions - browsers
        // 100 + others , https , http
        // localstorage, download ?

//        edgeOptions.addArguments("--window-size=1280,720");
//        edgeOptions.addArguments("--window-size=800,600");
//        edgeOptions.addArguments("--incognito");
//        edgeOptions.addArguments("--start-maximized");
        // "--headless" ---> it would run but we can't see any UI testcase would become positive (faster so helpful when we have more no. of testcases)



        ChromeDriver driver = new ChromeDriver();

        Thread.sleep(5000);
        driver.quit();


    }
}
