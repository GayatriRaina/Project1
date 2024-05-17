package com.testscenario;

import com.example.Object.ReturnOrder;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ReturnOrderMethod extends EcomBaseUtilities {
    static WebDriver driver;

    @Test
    public void ReturnOrder() throws InterruptedException {
        driver = super.Initialization();
        ReturnOrder rtnodr = new ReturnOrder(driver);
        rtnodr.returnorder();
        super.Closure();
    }
}
