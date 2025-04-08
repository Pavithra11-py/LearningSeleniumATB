package org.apipractice.TestSel_project;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test {

        @Description("verify email id and pswd entered wrong and error msg is shown")
        @Test
        public void test_neg_vwo() throws Exception
        {
            ChromeOptions edgeOptions = new ChromeOptions();
            edgeOptions.addArguments("--start-incognito");
            edgeOptions.addArguments("--start-maximized");

            WebDriver driver = new ChromeDriver(edgeOptions);
            driver.get("https://app.vwo.com");  // we can also use navigate().to()

            // 1. Find the email inputbox and enter the email
            // <input open Tag
            // type="email"
            // class="text-input W(100%)"
            // name="username"
            // id="login-username"
            // data-qa="hocewoqisi"
            // > close Tag

            WebElement input_box = driver.findElement(By.id("login-username"));
            input_box.sendKeys("admin@admin.com");

            // 2. Find the password inputbox and enter the password

            // <input
            // type="password"
            // class="text-input W(100%)"
            // name="password"
            // id="login-password"
            // data-qa="jobodapuxe">


            WebElement passwordInputBox = driver.findElement(By.name("password"));
            passwordInputBox.sendKeys("admin");

            WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
            buttonSubmit.click();

//        waitJVM(3000);

            Thread.sleep(3000);

            // 4. Find the invalid error message and verify.
            // <div
            // class="notification-box-description"
            // data-qa="rixawilomi">
            // Your email, password, IP address or location did not match</div>


            WebElement error_message = driver.findElement(By.className("notification-box-description"));
            Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");




            driver.quit();
        }


    }


