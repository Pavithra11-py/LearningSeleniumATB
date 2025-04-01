package org.apipractice.ex_02Selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class close_vs_quit {
    @Test
    public void test() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");

//        Thread.sleep(5000);
//        driver.close();

        //close() ---> closes particular tab not the whole window (not all tabs will be closed)
        // session id will still alive and session id != null

        Thread.sleep(5000);
        driver.quit();

        //quit() ---> closes whole window all tabs if we open any externally
        // session id won't be alive and session id = null
    }

}
