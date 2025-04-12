package org.apipractice.Actions_class;

import org.apipractice.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.apipractice.WaitHelper.WaitHelpers.waitJVM;

public class Actioncls_spicejet extends TestCaseBoilerPlate {

    @Test
    public void testcase()
    {
        String url = "https://www.spicejet.com/";
        driver.get(url);
        driver.manage().window().maximize();
         waitJVM(5000);
        WebElement data = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));

        Actions actions=new Actions(driver);
        actions.moveToElement(data).click().sendKeys("BLR").build().perform();

      waitJVM(3000);
      driver.quit();
    }
}
