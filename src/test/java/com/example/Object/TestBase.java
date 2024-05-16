package com.example.Object;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import static org.testng.AssertJUnit.assertEquals;

public class TestBase {
    WebDriver driver;
    public TestBase(WebDriver driver) {
        this.driver = driver;
    }
    String url = "https://magento.softwaretestingboard.com/";
    String new1 = "https://magento.softwaretestingboard.com/what-is-new.html";
    String new2 = "https://magento.softwaretestingboard.com/women.html";
    String new3 = "https://magento.softwaretestingboard.com/men.html";
    String new4 = "https://magento.softwaretestingboard.com/gear.html";
    String new5 = "https://magento.softwaretestingboard.com/training.html";
    String new6 = "https://magento.softwaretestingboard.com/sale.html";

    public void verifypage(){
        driver.get(url);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Home Page";
        assertEquals(expectedTitle,actualTitle);
        System.out.println("Verify Home Page");
    }

    public void t1(){
        driver.get(new1);
        String actualTitle = driver.getTitle();
        String expectedTitle = "What's New";
        assertEquals(expectedTitle,actualTitle);
        System.out.println("Verify What's New Tab");
    }

    public void t2(){
        driver.get(new2);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Women";
        assertEquals(expectedTitle,actualTitle);
        System.out.println("Verify Women Tab");
    }

    public void t3(){
        driver.get(new3);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Men";
        assertEquals(expectedTitle,actualTitle);
        System.out.println("Verify Men Tab");
    }

    public void t4(){
        driver.get(new4);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Gear";
        assertEquals(expectedTitle,actualTitle);
        System.out.println("Verify Gear Tab");
    }

    public void t5(){
        driver.get(new5);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Training";
        assertEquals(expectedTitle,actualTitle);
        System.out.println("Verify Training Tab");
    }

    public void t6(){
        driver.get(new6);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Sale";
        assertEquals(expectedTitle,actualTitle);
        System.out.println("Verify Sale Tab");
    }

}
