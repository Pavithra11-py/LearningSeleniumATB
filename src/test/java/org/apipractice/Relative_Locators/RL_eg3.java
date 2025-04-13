package org.apipractice.Relative_Locators;

import org.apipractice.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

import static org.apipractice.WaitHelper.WaitHelpers.waitJVM;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RL_eg3 extends TestCaseBoilerPlate {

    @Test
    public void RL_eg3() throws InterruptedException {
        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();

        WebElement search_box = driver.findElement(By.xpath("//input[@placeholder=\"Search\"]"));
        search_box.sendKeys("India");
        Actions action = new Actions(driver);
        action.keyDown(Keys.ENTER).build().perform();
        action.keyUp(Keys.ENTER).build().perform();
        waitJVM(3000);

        //a[@aria-label=\"Visit Bapatla details page\"]/div/p

       // List<WebElement> locations =  driver.findElements(By.xpath("//a[@aria-label=\\\"Visit Bapatla details page\\\"]/div/p"));


        List<WebElement> locations = driver.findElements(By.cssSelector("div.location-name > p"));
        for(WebElement loc:locations){
          String rank =  driver.findElement(with(By.tagName("p")).toLeftOf(loc)).getText();
            String   aqi =   driver.findElement(with(By.tagName("span")).toRightOf(loc)).getText();

            System.out.println(loc.getText());
            System.out.println(rank);
            System.out.println(aqi);

            System.out.println("| +" + rank + " | " + loc.getText() + " | " + aqi + " | ");
        }


    }
}
