package org.apipractice.TestSel_project;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.devtools.v132.accessibility.model.AXPropertyName.URL;

public class Katalon_Project2 {

    @Description("verify")
    @Test
    public void test() throws Exception{

        EdgeOptions edgeopt =  new EdgeOptions();
        edgeopt.addArguments("--start-maximize");

      WebDriver driver = new EdgeDriver(edgeopt);
      driver.get("https://katalon-demo-cura.herokuapp.com/");

      //<div class="form-group">
        //                        <label for="txt-username" class="col-sm-4 control-label">Username</label>
        //                        <div class="col-sm-8">
        //                            <input type="text" class="form-control" id="txt-username" name="username" placeholder="Username" value="" autocomplete="off">
        //                        </div>
        //                    </div>


        WebElement username  = driver.findElement(By.id("txt-username"));
         username.sendKeys("John Doe");
//        <div class="form-group">
//                <label for="txt-password" class="col-sm-4 control-label">Password</label>
//                <div class="col-sm-8">
//                <input type="password" class="form-control" id="txt-password" name="password" placeholder="Password" value="" autocomplete="off">
//                </div>
//                </div>
        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        //<div class="form-group">
        //                        <div class="col-sm-offset-4 col-sm-8">
        //                            <button id="btn-login" type="submit" class="btn btn-default">Login</button>
        //                        </div>
        //                    </div>

        WebElement loginbut = driver.findElement(By.id("btn-login"));
        loginbut.click();

        Thread.sleep(2000);

       Assert.assertTrue(driver.getCurrentUrl().contains("https://katalon-demo-cura.herokuapp.com/#appointment"));


//        //<div class="col-sm-12 text-center">
//                <h2>Make Appointment</h2>
//                <hr class="small">
//            </div>
        WebElement make_app = driver.findElement(By.className("col-sm-12 text-center"));
        Assert.assertEquals(make_app.getText(),"Make Appointment");

        driver.quit();
    }

}
