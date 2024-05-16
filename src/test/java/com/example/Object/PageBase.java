package com.example.Object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PageBase {

    WebDriver driver;
    public PageBase(WebDriver driver) {
        this.driver = driver;
    }
    String url = "https://magento.softwaretestingboard.com/";
    By srch = By.xpath("//input[@id=\"search\"]");
    By srchbutton = By.xpath("//*[@id=\"search_mini_form\"]/div[2]/button");
    By sort = By.xpath("//*[@id=\"sorter\"]");
    By navigatebutton = By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[3]/div[2]/ul/li[4]/a");

    public void search() throws InterruptedException {
        driver.get(url);
        Thread.sleep(4000);
        driver.findElement(srch).sendKeys("Pant for Women");
        Thread.sleep(4000);
        driver.findElement(srchbutton).click();
        Thread.sleep(4000);
        Select dropdown = new Select(driver.findElement(sort));
        dropdown.selectByVisibleText("Price");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        driver.findElement(navigatebutton).click();
        Thread.sleep(4000);

    }

}
