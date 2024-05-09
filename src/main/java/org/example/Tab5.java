package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tab5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://magento.softwaretestingboard.com/");


        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();

        driver.findElement(By.xpath("//input[@name=\"login[username]\"]")).sendKeys("gayatriraina97@gmail.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.xpath("//input[@name=\"login[password]\"]")).sendKeys("Gayu@567890");
        driver.findElement(By.xpath("//button[@class=\"action login primary\"]")).click();

        Thread.sleep(4000);
        Actions actions = new Actions(driver);
        WebElement Training = driver.findElement(By.xpath("//*[@id=\"ui-id-7\"]"));
        actions.moveToElement(Training);

        WebElement video = driver.findElement(By.xpath("//*[@id=\"ui-id-28\"]"));
        actions.moveToElement(video);

        actions.click().build().perform();
        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.xpath("//*[@id=\"wishlist-sidebar\"]/li/div/div/div[2]/div[1]/button")).click();
        js.executeScript("window.scrollBy(0,-500)");

        Thread.sleep(4000);
        js.executeScript("window.scrollBy(0,400)");

        driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-169\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-54\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();

    }
}
