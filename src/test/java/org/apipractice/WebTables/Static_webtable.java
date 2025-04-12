package org.apipractice.WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Static_webtable {
    @Description
    @Test
    public void test_webtable_login() throws Exception {

        ChromeDriver driver = new ChromeDriver();
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--guest");
        driver.manage().window().maximize();

        driver.get("https://awesomeqa.com/webtable.html");
        //table[@id="customers"]/tbody/tr[2]/td

        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

        for(int i=2;i<=row;i++){
            for(int j=1;j<=col;j++){

                String dynamic_path = first_part +i+second_part+j+third_part;
                //System.out.println(dynamic_path);

                String data = driver.findElement(By.xpath(dynamic_path)).getText();
               //System.out.println(data);

                if(data.contains("Helen Bennett")){
                    String Country_path = dynamic_path+"/following-sibling::td";
                    String value = driver.findElement(By.xpath(Country_path)).getText();
                    System.out.println(value);
                }
            }
        }
  driver.quit();
    }

}
