package org.apipractice.Selenium_Exceptions;

import org.apipractice.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class Exc_NoSuchElemetException extends TestCaseBoilerPlate {

    @Test
    public void exceptions_eg() {

        driver.get("https://app.vwo.com/");

        try{
            driver.findElement(By.id("pavi"));
            //org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#pavi"}
        }catch(NoSuchElementException e)
        {
          //  e.printStackTrace();
            System.out.println("Element not found!");
        }

    }
}
