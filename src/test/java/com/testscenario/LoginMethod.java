package com.testscenario;

import com.example.Object.Login;
import com.example.Object.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginMethod extends EcomBaseUtilities{
    static WebDriver driver;

    @Test
    public void login(){
        driver = super.Initialization();
        Login login = new Login(driver);
        login.enterDetails();
        login.invalidcred();
        login.validcred();
        super.Closure();
    }
}
