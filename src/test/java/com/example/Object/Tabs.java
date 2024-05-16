package com.example.Object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tabs {

    WebDriver driver;
    public Tabs(WebDriver driver) {
        this.driver = driver;
    }

    String url = "https://magento.softwaretestingboard.com/";
    By tab1 = By.xpath("//*[@id=\"ui-id-3\"]/span");
    By main = By.xpath("//*[@id=\"maincontent\"]/div[4]/div[2]/div/div/ul[1]/li[1]/a");
    By sub = By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[6]");
    By sub1 = By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[4]/form/div[1]/div/div/div[1]/div/div[5]");
    By sub2 = By.xpath("//div[@option-label=\"White\"]");
    By sub3 = By.xpath("//*[@id=\"product-addtocart-button\"]/span");

    By tab2 = By.xpath("//a[@id=\"ui-id-4\"]");
    By subMenu = By.xpath("//*[@id=\"ui-id-10\"]/span[2]");
    By selectproduct = By.xpath("//*[@id=\"sorter\"]");
    By product = By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]");
    By productsize = By.xpath("//*[@id=\"option-label-size-143-item-172\"]");
    By produtcolor = By.xpath("//*[@id=\"option-label-color-93-item-56\"]");
    By AddtoCart = By.xpath("//button[@title=\"Add to Cart\"]");

    By tab3 = By.xpath("/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[3]/a");
    By sub4 = By.xpath("//*[@id=\"ui-id-17\"]");
    By sub5 = By.xpath("//*[@id=\"ui-id-20\"]/span");
    By sub6 = By.xpath("//*[@id=\"narrow-by-list\"]/div[9]/div[1]");
    By sub7 = By.xpath("//*[@id=\"narrow-by-list\"]/div[9]/div[2]/ol/li[1]/a");
    By sub8 = By.xpath("//a[@class=\"modes-mode mode-list\"]");
    By tab4 = By.xpath("/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[4]/a");
    By sub9 = By.xpath("//*[@id=\"ui-id-27\"]");
    By sub10 = By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]");

    By tab5 = By.xpath("//*[@id=\"ui-id-7\"]");
    By sub12 = By.xpath("//*[@id=\"ui-id-28\"]");
    By sub13 = By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[3]/div/div/ol/li[2]");
    By sub14 = By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[3]/div/div/ol/li[2]/div/div/div[3]/div[1]/div/div[1]");
    By sub15 = By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[3]/div/div/ol/li[2]/div/div/div[3]/div[2]/div/div[1]");
    By sub16 = By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[3]/div/div/ol/li[2]/div/div/div[4]/div/div[1]/form/button");

    By tab6 = By.xpath("//*[@id=\"ui-id-8\"]");
    By sub17 = By.xpath("/html/body/div[2]/main/div[4]/div[1]/div[1]/div/div[1]/a[2]/span/span[2]");

    public void Tab1() throws InterruptedException {
        driver.get(url);
        driver.findElement(tab1).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(main).click();
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(sub).click();
        js.executeScript("window.scrollBy(0,700)");
        Thread.sleep(4000);
        driver.findElement(sub1).click();
        driver.findElement(sub2).click();
        driver.findElement(sub3).click();
        js.executeScript("window.scrollBy(0,-700)");
    }

    public void Tab2() throws InterruptedException {
        driver.get(url);
        WebElement T2 = driver.findElement(tab2);
        Actions actions = new Actions(driver);
        actions.moveToElement(T2);
        WebElement sm = driver.findElement(subMenu);
        actions.moveToElement(sm);
        actions.click().build().perform();
        Select objselect = new Select(driver.findElement(selectproduct));
        objselect.selectByVisibleText("Product Name");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        WebElement p = driver.findElement(product);
        actions.moveToElement(p);
        actions.click().build().perform();
        driver.findElement(productsize).click();
        driver.findElement(produtcolor).click();
        Thread.sleep(4000);
        WebElement AC = driver.findElement(AddtoCart);
        actions.moveToElement(AC);
        actions.doubleClick().build().perform();

    }

    public void Tab3(){
        driver.get(url);
        Actions actions = new Actions(driver);
        WebElement men = driver.findElement(tab3);
        actions.moveToElement(men);
        WebElement tops = driver.findElement(sub4);
        actions.moveToElement(tops);
        WebElement hoodies = driver.findElement(sub5);
        actions.moveToElement(hoodies);
        actions.click().build().perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        driver.findElement(sub6).click();
        driver.findElement(sub7).click();
        driver.findElement(sub8).click();
    }

    public void Tab4(){
        driver.get(url);
        Actions actions = new Actions(driver);
        WebElement gear = driver.findElement(tab4);
        actions.moveToElement(gear);
        WebElement watches = driver.findElement(sub9);
        actions.moveToElement(watches);
        actions.click().build().perform();
        WebElement product = driver.findElement(sub10);
    }

    public void Tab5() throws InterruptedException {
        driver.get(url);
        Actions actions = new Actions(driver);
        WebElement Training = driver.findElement(tab5);
        actions.moveToElement(Training);
        WebElement video = driver.findElement(sub12);
        actions.moveToElement(video);
        Thread.sleep(4000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        driver.findElement(sub13).click();
        driver.findElement(sub14).click();
        driver.findElement(sub15).click();
        Thread.sleep(4000);
        driver.findElement(sub16).click();
    }

    public void Tab6(){
        driver.get(url);
        driver.findElement(tab6).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(sub17).click();
    }


}
