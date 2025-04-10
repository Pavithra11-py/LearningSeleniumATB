package org.apipractice.Selenium_waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSel_project1_use_explicit_wait {

        @Description("verify email id and pswd entered wrong and error msg is shown")
        @Test
        public void test_neg_vwo() throws Exception
        {
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.addArguments("--start-incognito");
            edgeOptions.addArguments("--start-maximized");

            WebDriver driver = new EdgeDriver(edgeOptions);
            driver.get("https://app.vwo.com");  // we can also use navigate().to()
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  --- implicit
            WebElement input_box = driver.findElement(By.id("login-username"));
            input_box.sendKeys("admin@admin.com");

            WebElement passwordInputBox = driver.findElement(By.name("password"));
            passwordInputBox.sendKeys("admin");

            WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
            buttonSubmit.click();

//        waitJVM(3000);

          //  Thread.sleep(3000);

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));


            WebElement error_message = driver.findElement(By.className("notification-box-description"));

         //   wait.until(ExpectedConditions.textToBePresentInElement(error_message,"Your email, password, IP address or location did not match"));

            Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

            driver.quit();
        }

}
