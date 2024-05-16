package com.testscenario;

import com.example.Object.Login;
import com.example.Object.Tabs;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TabsMethod extends EcomBaseUtilities{
    static WebDriver driver;

    @Test
    public void tab() throws InterruptedException {
        driver = super.Initialization();
        Tabs tab = new Tabs(driver);
        Login login = new Login(driver);
        login.validcred();
        tab.Tab1();
        tab.Tab2();
        tab.Tab3();
        tab.Tab4();
        tab.Tab5();
        tab.Tab6();
        super.Closure();
    }

}
