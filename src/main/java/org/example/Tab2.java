package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tab2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://magento.softwaretestingboard.com/");

        WebElement mainMenu = driver.findElement(By.xpath("//a[@id=\"ui-id-4\"]"));
        Actions actions = new Actions(driver);

        actions.moveToElement(mainMenu);

        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"ui-id-10\"]/span[2]"));

        actions.moveToElement(subMenu);

        actions.click().build().perform();
        Select objSelect = new Select(driver.findElement(By.xpath("//*[@id=\"sorter\"]")));
        objSelect.selectByVisibleText("Product Name");


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");

        WebElement Product = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[2]/div"));

        //colour and size from hovering
        driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-172\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-56\"]")).click();

        Thread.sleep(4000);

        WebElement addtocart = driver.findElement(By.xpath("//button[@title=\"Add to Cart\"]"));
        actions.moveToElement(addtocart);

        actions.doubleClick().build().perform();

    }
}
