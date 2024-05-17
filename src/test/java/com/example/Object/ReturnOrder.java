package com.example.Object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ReturnOrder {

    WebDriver driver;
    public ReturnOrder(WebDriver driver) {
        this.driver = driver;
    }

    String url = "https://magento.softwaretestingboard.com/";
    By odrreturn = By.xpath("/html/body/div[2]/footer/div/ul/li[4]/a");
    By ordrid = By.xpath("//input[@id=\"oar-order-id\"]");
    By billinglstnm = By.xpath("//input[@id=\"oar-billing-lastname\"]");
    By mail = By.xpath("//input[@id=\"oar_email\"]");
    By cntnue = By.xpath("//button[@title=\"Continue\"]");

    public void returnorder() throws InterruptedException {
        driver.get(url);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        driver.findElement(odrreturn).click();
        Thread.sleep(4000);
        driver.findElement(ordrid).sendKeys("12345");
        driver.findElement(billinglstnm).sendKeys("Raina");
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(mail).sendKeys("gayatriraina97@gmail.com");
        driver.findElement(cntnue).click();
    }
}
