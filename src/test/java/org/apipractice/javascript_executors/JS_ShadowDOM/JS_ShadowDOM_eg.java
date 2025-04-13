package org.apipractice.javascript_executors.JS_ShadowDOM;

import org.apipractice.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.apipractice.WaitHelper.WaitHelpers.waitJVM;

public class JS_ShadowDOM_eg extends TestCaseBoilerPlate {

    @Test
    public void testShadowDOM() {

        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();
        waitJVM(4000);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));

        // Shadow DOM -> js.executeCode

        waitJVM(3000);

        WebElement inputboxPizza = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div#app2\").shadowRoot.querySelector(\"#pizza\");");
        inputboxPizza.sendKeys("farmhouse");

//        driver.get("https://selectorshub.com/xpath-practice-page/");
//        driver.manage().window().maximize();
//        waitJVM(3000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));
//
//        // Shadow DOM -> js.executeCode
//
//        waitJVM(3000);
//
//        WebElement inputboxPizza = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div#app2\").shadowRoot.querySelector(\"#pizza\");");
//        inputboxPizza.sendKeys("farmhouse");

    }
}
