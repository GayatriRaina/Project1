package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tab3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://magento.softwaretestingboard.com/");
        Actions actions = new Actions(driver);
        WebElement men = driver.findElement(By.xpath("//a[@id=\"ui-id-5\"]"));
        actions.moveToElement(men);
        WebElement tops = driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]"));
        actions.moveToElement(tops);
        WebElement hoodies = driver.findElement(By.xpath("//*[@id=\"ui-id-20\"]/span"));
        actions.moveToElement(hoodies);
        actions.click().build().perform();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");

        driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[9]/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[9]/div[2]/ol/li[1]/a")).click();

        js.executeScript("window.scrollBy(0,700)");

        driver.findElement(By.xpath("//a[@class=\"modes-mode mode-list\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[1]/div/div/div[3]/div[1]/div[2]/a[1]")).click();

        driver.findElement(By.xpath("//input[@name=\"login[username]\"]")).sendKeys("gayatriraina97@gmail.com");
        driver.findElement(By.xpath("//input[@name=\"login[password]\"]")).sendKeys("Gayu@567890");

        driver.findElement(By.xpath("//button[@class=\"action login primary\"]")).click();

        js.executeScript("window.scrollBy(0,700)");
    }
}
