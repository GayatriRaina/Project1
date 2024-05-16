package com.testscenario;

import com.example.Object.Footer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FooterMethod extends EcomBaseUtilities {

    static WebDriver driver;
    @Test
    public void Footer(){
        driver = super.Initialization();
        Footer footer = new Footer(driver);
        footer.footer1();
        footer.footer2();
        footer.footer3();
        footer.footer4();
        footer.footer5();
        footer.footer6();
        footer.footer7();
        footer.footer8();
        super.Closure();
    }
}
