package org.apipractice.KathalonProjmini_Challen1;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static java.awt.SystemColor.menu;
import static org.apipractice.WaitHelper.WaitHelpers.waitJVM;

public class Kathalon {
    ChromeDriver driver;
    @BeforeTest
    public void openBrowser(){
        ChromeOptions edgeOptions = new ChromeOptions();
        edgeOptions.addArguments("--guest");
        driver = new ChromeDriver(edgeOptions);
        driver.manage().window().maximize();

    }


    @Description("open the kathalon and enter details and verify then logout")
    @Test

    public void verify_test() throws Exception{

        String URL = "https://katalon-demo-cura.herokuapp.com/";
        driver.get(URL);
        driver.manage().window().maximize();
        waitJVM(5000);


        WebElement make_app = driver.findElement(By.id("btn-make-appointment"));
        make_app.click();
        waitJVM(5000);
        WebElement user_nm = driver.findElement(By.xpath("//input[@id=\"txt-username\"]"));
        user_nm.sendKeys("John Doe");

        WebElement pass = driver.findElement(By.xpath("//input[@id=\"txt-password\"]"));
        pass.sendKeys("ThisIsNotAPassword");

        WebElement login_btn = driver.findElement(By.id("btn-login"));
        login_btn.click();

        waitJVM(3000);

        WebElement facility = driver.findElement(By.xpath("//select[@id=\"combo_facility\"]"));
        Select select = new Select(facility);
        select.selectByIndex(2);

      WebElement check = driver.findElement(By.id("chk_hospotal_readmission"));
      check.click();

        WebElement none = driver.findElement(By.id("radio_program_none"));
        none.click();

        WebElement date = driver.findElement(By.id("txt_visit_date"));
        date.sendKeys("10/04/2025");

        WebElement comment = driver.findElement(By.cssSelector("textarea[id=\"txt_comment\"]"));
        comment.sendKeys("A to Z");

        WebElement book_appn = driver.findElement(By.id("btn-book-appointment"));
        book_appn.click();
       waitJVM(3000);

        WebElement appoincon = driver.findElement(By.xpath("//div[@class=\"col-xs-12 text-center\"]/h2"));
         String app = appoincon.getText();
        // Assert.assertTrue(app.contains("Confirmed"));
        WebElement Facility = driver.findElement(By.xpath("//div[@class=\"col-xs-8\"]/p"));
        String Fac = Facility.getText();
       // Assert.assertEquals(Fac,"Seoul CURA Healthcare Center");

        WebElement apply = driver.findElement(By.xpath("//div[@class=\"col-xs-8\"]/p[@id=\"hospital_readmission\"]"));
        String hospadm = apply.getText();
       // Assert.assertEquals(hospadm,"Yes");

        WebElement heathcare = driver.findElement(By.xpath("//div[@class=\"col-xs-8\"]/p[@id=\"program\"]"));
        String program = heathcare.getText();
        //Assert.assertEquals(hospadm,"None");

        WebElement visit = driver.findElement(By.xpath("//div[@class=\"col-xs-8\"]/p[@id=\"visit_date\"]"));
        String datee = visit.getText();
       // Assert.assertEquals(datee,"10/04/2025");

        WebElement commen = driver.findElement(By.xpath("//div[@class=\"col-xs-8\"]/p[@id=\"comment\"]"));
        String comm = commen.getText();

        //Assert.assertEquals(comm,"10/04/2025");

        //a[@id=\"menu-toggle\"]/i[@class=\"fa fa-bars\"]"
        WebElement menu = driver.findElement(By.xpath("//a[@id=\"menu-toggle\"]/i"));
        menu.click();
        //a[@href=\"authenticate.php?logout\"]"    ,"//a[@id=\"sidebar-wrapper\"]/ul/li[5]/a"
        WebElement logout = driver.findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[5]/a"));
        logout.click();

        //a[@href="authenticate.php?logout"]

         waitJVM(5000);

    }

    @AfterTest
    public void closeBrowser(){
        waitJVM(10000);
        driver.quit();
    }
}
