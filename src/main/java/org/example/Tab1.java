package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://magento.softwaretestingboard.com/");


        driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]/span")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        driver.findElement(By.xpath("//img[@alt=\"Phoebe Zipper Sweatshirt\"]")).click();
        js.executeScript("window.scrollBy(0,700)");

        driver.findElement(By.xpath("//div[@index=\"2\"]")).click();
        driver.findElement(By.xpath("//div[@option-label=\"White\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span")).click();

        js.executeScript("window.scrollBy(0,-700)");

        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div/a")).click();
        js.executeScript("window.scrollBy(0,500)");


    }
}
