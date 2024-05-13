package com.testscenario;

import com.example.Object.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestMethodForEcom {
    static WebDriver driver;
   @BeforeTest
    public static void Initialization() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

    }

    @Test
    public static void Initialization1() {
        TestBase testBase = new TestBase(driver);
        testBase.verifypage();
    }
@Test
    public void createaccount(){
        TestBase testBase = new TestBase(driver);
    driver.get("https://magento.softwaretestingboard.com/");
    testBase.enterDetails();
    }
}
