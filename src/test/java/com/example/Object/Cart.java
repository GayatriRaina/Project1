package com.example.Object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Cart {

    WebDriver driver;
    public Cart(WebDriver driver) {
        this.driver = driver;
    }


    By c1 = By.xpath("/html/body/div[2]/header/div[2]/div[1]/a");
    By c2 = By.xpath("//a[@data-cart-item=\"34988\"]");
    By c3 = By.xpath("//button[@class=\"action-primary action-accept\"]");
    By c4 = By.xpath("//*[@id=\"top-cart-btn-checkout\"]");
    By c5 = By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button");

    public void removingproduct() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(c1).click();
        Thread.sleep(4000);
        driver.findElement(c2).click();
        Thread.sleep(4000);
        driver.findElement(c3).click();
    }

    public void checkout() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(c1).click();
        Thread.sleep(4000);
        driver.findElement(c4).click();
        Thread.sleep(4000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(c5).click();

    }
}
