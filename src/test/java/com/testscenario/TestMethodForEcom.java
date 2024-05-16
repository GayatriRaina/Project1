package com.testscenario;

import com.example.Object.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestMethodForEcom extends EcomBaseUtilities{
    static WebDriver driver;

    @Test
    public void Initialization1() {
        driver = super.Initialization();
        TestBase testBase = new TestBase(driver);
        testBase.verifypage();
        testBase.t1();
        testBase.t2();
        testBase.t3();
        testBase.t4();
        testBase.t5();
        testBase.t6();
        super.Closure();
    }
}
