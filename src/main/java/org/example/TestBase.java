package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {

    public static WebDriver driver;
    public static void Initialization() {
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    }
}
