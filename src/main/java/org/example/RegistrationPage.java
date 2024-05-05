package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegistrationPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://magento.softwaretestingboard.com/");
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a")).click();

        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Gayatri");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Raina");
        driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("gayatriraina97@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Gayu@567890");
        driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("Gayu@567890");
        driver.findElement(By.xpath("//button[@class=\"action submit primary\"]")).click();
    }

}
