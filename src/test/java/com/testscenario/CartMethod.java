package com.testscenario;

import com.example.Object.Cart;
import com.example.Object.Login;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

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
