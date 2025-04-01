package org.apipractice.EX_SeleniumBasics;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestSelenium_02 {
    @Description("Open www.vwo.com and verify the title")
    @Test
    public void test_Selenium02() {
        // Open the URL
           WebDriver driver = new EdgeDriver();
           //Navigate to URL
        driver.get("https://app.vwo.com");
        // Validate and ASsert the url
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");
        driver.quit();
    }
}
