package com.testscenario;

import com.example.Object.PageBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PageBaseMethod extends EcomBaseUtilities {
    static WebDriver driver;

    @Test
    public void PageBase() throws InterruptedException {
        driver = super.Initialization();
        PageBase pb = new PageBase(driver);
        pb.search();
        super.Closure();

    }
}
