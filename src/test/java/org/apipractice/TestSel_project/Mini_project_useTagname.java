package org.apipractice.TestSel_project;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Mini_project_useTagname {

    @Description("verif error msg in another page")
    @Test
    public void test() throws Exception{
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");


        WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("trial"));
        a_tag_partial_match.click();

        System.out.println(driver.getCurrentUrl());

        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");

        WebElement checkbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox_policy.click();

        List<WebElement> buttonList = driver.findElements(By.tagName("button"));
        buttonList.get(0).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // <div
        // class="C($color-red) Fz($font-size-12)
        // Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">
        // The email address you entered is incorrect.
        // </div>

        List<WebElement> error_msg = driver.findElements(By.className("invalid-reason"));
//        Assert.assertTrue(error_msg.isDisplayed());
        Assert.assertEquals(error_msg.get(0).getText(),"The email address you entered is incorrect.");

//      WebElement error_msg = driver.findElements(By.className("invalid-reason"));
//        Assert.assertEquals(error_msg.getText(),"The email address you entered is incorrect.");
        driver.quit();



    }
}
