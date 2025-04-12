package org.apipractice.WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Dynamic_webtable {

    @Description
    @Test
    public void test_webtable_dyn() throws Exception {

        ChromeDriver driver = new ChromeDriver();
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--guest");
        driver.manage().window().maximize();

        driver.get("https://awesomeqa.com/webtable1.html");

        WebElement table = driver.findElement(By.xpath("//table[@summary=\"Sample Table\"]/tbody"));

        List<WebElement> rows_table = table.findElements(By.tagName("tr"));
        for(int i=0;i<rows_table.size();i++){
            List<WebElement> col = rows_table.get(i).findElements(By.tagName("td"));
            for (WebElement c:col){

                System.out.println(c.getText());
            }
        }

    driver.quit();
    }
}
