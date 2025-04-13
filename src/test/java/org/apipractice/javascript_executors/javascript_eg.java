package org.apipractice.javascript_executors;

import org.apipractice.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class javascript_eg extends TestCaseBoilerPlate {

    @Test
    public void example_js() {

        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();
 //JavascriptExecutor is an interface we can create object
        // so just typecasting it so that we can use its funcns
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));

        //js.executeScript("arguments[0].scrollIntoView(true);", div_to_scroll);
       // js.executeScript("alert(1);");

        js.executeScript("window.scrollBy(0, 500);");

       String url = js.executeScript("return document.URL;").toString();
       String title = js.executeScript("return document.title;").toString();

        System.out.println(url);
        System.out.println(title);
    }
}
