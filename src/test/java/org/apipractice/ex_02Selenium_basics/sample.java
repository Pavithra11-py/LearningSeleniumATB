package org.apipractice.ex_02Selenium_basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sample {

@Test
    public void google_Test(){
            // Selenium Manager will auto-download the ChromeDriver
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com");

            System.out.println("Title: " + driver.getTitle());
            driver.quit();
        }
    }

