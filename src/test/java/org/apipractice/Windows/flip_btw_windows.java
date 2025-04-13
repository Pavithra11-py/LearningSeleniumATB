package org.apipractice.Windows;

import org.apipractice.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class flip_btw_windows extends TestCaseBoilerPlate {

    @Test
    public void window() {


        String url = "https://the-internet.herokuapp.com/windows";
        driver.get(url);

        driver.manage().window().maximize();

        String parent = driver.getWindowHandle();
        System.out.println(parent);

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);

        for(String handle:windowHandles)
        {
            driver.switchTo().window(handle);
             if(driver.getPageSource().contains("New Window")){
                 System.out.println("Test case Passed");
             }
            driver.switchTo().window(parent);
        }
    }

}
