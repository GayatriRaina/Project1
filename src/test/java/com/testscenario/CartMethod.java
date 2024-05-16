package com.testscenario;

import com.example.Object.Cart;
import com.example.Object.Login;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CartMethod extends EcomBaseUtilities{
    static WebDriver driver;
    @Test
    public void Cart() throws InterruptedException {
        driver = super.Initialization();
        Cart cart = new Cart(driver);
        Login login = new Login(driver);
        login.validcred();
        cart.checkout();
        cart.removingproduct();
        super.Closure();

    }
}
