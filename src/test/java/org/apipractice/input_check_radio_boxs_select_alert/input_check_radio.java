package org.apipractice.input_check_radio_boxs_select_alert;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class input_check_radio {
    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        driver.findElement(By.name("firstname")).sendKeys("the testing academy");

        // RADIO Box
        driver.findElement(By.id("sex-1")).click();

        // CheckBox
        driver.findElement(By.id("tool-1")).click();

    }
    }
