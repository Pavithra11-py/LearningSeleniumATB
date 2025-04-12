package org.apipractice.Actions_class;

import org.apipractice.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

import static org.apipractice.WaitHelper.WaitHelpers.waitJVM;

public class Actioncls_makemtrip_closemodal extends TestCaseBoilerPlate {
    @Test
    public void test() {

        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

        // WaitHelpers.checkVisibility(driver,By.xpath("//span[@data-cy='closeModal']"));
        WebElement modal = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        modal.click();

        WebElement fromCity = driver.findElement(By.id("fromCity"));

        Actions actions = new Actions(driver);
        actions.moveToElement(fromCity).click().sendKeys("HYD").build().perform();

        waitJVM(7000);

//        actions.moveToElement(fromCity).
//                keyDown(Keys.ARROW_DOWN).keyUp(Keys.ENTER).build().perform();

        List<WebElement> lists = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));

        for (WebElement element : lists) {
            if (element.getText().contains("Chandigarh")) {
                element.click();
            }
        }
    }
}


