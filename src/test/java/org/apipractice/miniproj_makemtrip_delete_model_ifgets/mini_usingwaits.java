package org.apipractice.miniproj_makemtrip_delete_model_ifgets;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class mini_usingwaits {

    @Description("Verify make m trip")
    @Test
    public void testclose_modal() throws Exception{

        ChromeOptions edgeot = new ChromeOptions();
        edgeot.addArguments("--incognito");
        edgeot.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(edgeot);
        driver.navigate().to("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|Brand-BrandExact_DT|B_M_Makemytrip_Search_Exact|RSA|673383350845&s_kwcid=AL!1631!3!673383350845!e!!g!!makemytrip%20.com&gad_source=1&gclid=EAIaIQobChMIs_f5lZ7NjAMVocY8Ah1hHxu4EAAYASAAEgJO6_D_BwE");
        System.out.println(driver.getTitle());

        // XPath---->  //span[@data-cy="closeModal"]
        // CSS Selector ----> span[data-cy="closeModal"]

        //condition:
        WebDriverWait driverwait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driverwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));

        WebElement closemodal = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        closemodal.click();

     Thread.sleep(2000);
        driver.quit();

    }
}
