package org.apipractice.Advance_project_windows_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

import static org.apipractice.WaitHelper.WaitHelpers.waitJVM;

public class Adv_pro {

    public ChromeDriver driver;
    public ChromeOptions options;

    @BeforeTest
    public void openBrowser() {
        options = new ChromeOptions();
        options.addArguments("--guest");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @Test
    public void test_project_interview_imp() {

        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");
        driver.manage().window().maximize();

        waitJVM(5000);

        String parent = driver.getWindowHandle();
        System.out.println("Parent -->" + parent);


        List<WebElement> heat_maps = driver.findElements(By.cssSelector("[data-qa=\"yedexafobi\"]"));

        Actions action = new Actions(driver);
        action.moveToElement(heat_maps.get(1)).click().build().perform();

        waitJVM(15000);

        Set<String> handles = driver.getWindowHandles();
        System.out.println("All windows Handles :" + handles);

        for (String handle : handles) {
            if (!handle.equals(parent)) {
                driver.switchTo().window(handle);

                driver.switchTo().frame("heatmap-iframe");
                WebElement clickmap = driver.findElement(By.cssSelector("[data-qa='liqokuxuba']"));
                clickmap.click();

            }


        }
    }
        @AfterTest
        public void closeBrowser() {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.quit();

        }
    }




