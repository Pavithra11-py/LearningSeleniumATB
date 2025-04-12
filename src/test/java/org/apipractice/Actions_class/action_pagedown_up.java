package org.apipractice.Actions_class;

import org.apipractice.TestCaseBoilerPlate;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class action_pagedown_up extends TestCaseBoilerPlate {

    @Test
    public void test_actions_p5() {


        driver.get("https://thetestingacademy.com/");
        driver.manage().window().maximize();


        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
    }
}
