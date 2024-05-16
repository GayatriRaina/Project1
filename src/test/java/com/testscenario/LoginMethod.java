package com.testscenario;

import com.example.Object.Login;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginMethod extends EcomBaseUtilities{
    static WebDriver driver;

    @Test
    public void login() throws InterruptedException {
        driver = super.Initialization();
        Login login = new Login(driver);
        login.enterDetails();
        login.invalidcred();
        login.validcred();
        login.forgetpassword();
        login.logout();
        super.Closure();
    }
}
