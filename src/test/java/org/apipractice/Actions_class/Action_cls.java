package org.apipractice.Actions_class;

import org.apipractice.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;

import static org.apipractice.WaitHelper.WaitHelpers.waitJVM;

public class Action_cls extends TestCaseBoilerPlate {

    @Test
    public void Test1(){

        String URL ="https://awesomeqa.com/practice.html";
        driver.get(URL);
        driver.manage().window().maximize();

        //Keys
        WebElement firstname = driver.findElement(By.name("firstname"));

        //Keyboard
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT)
                .sendKeys(firstname,"the testing")
                .keyUp(Keys.SHIFT).build().perform();
        waitJVM(5000);

        driver.quit();
    }


}
