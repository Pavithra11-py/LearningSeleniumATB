package org.apipractice.EX_SeleniumBasics;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class test_https_imp {

        @Test
        public static void main(String[] args) {
            EdgeDriver driver = new EdgeDriver();
            driver.get("bing.com"); // HTTPs is important.


            driver.quit();
        }
    }

