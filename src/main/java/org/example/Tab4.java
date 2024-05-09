package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tab4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://magento.softwaretestingboard.com/");


        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();

        driver.findElement(By.xpath("//input[@name=\"login[username]\"]")).sendKeys("gayatriraina97@gmail.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.xpath("//input[@name=\"login[password]\"]")).sendKeys("Gayu@567890");
        driver.findElement(By.xpath("//button[@class=\"action login primary\"]")).click();

        Actions actions = new Actions(driver);
        WebElement gear = driver.findElement(By.xpath("//a[@id=\"ui-id-6\"]"));
        actions.moveToElement(gear);

        WebElement watches = driver.findElement(By.xpath("//*[@id=\"ui-id-27\"]"));
        actions.moveToElement(watches);

        actions.click().build().perform();

        js.executeScript("window.scrollBy(0,700)");
        WebElement product = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[3]/div/a/span/span/img"));

        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[1]/div/div/div[3]/div/div[2]/a[2]")).click();


    }
}
