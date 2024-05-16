package com.testscenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

class EcomBaseUtilities {

    static WebDriver driver;
@BeforeTest
    public WebDriver Initialization() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

        return driver;

    }

    @AfterTest
    public void Closure(){
    driver.quit();
    }

}
