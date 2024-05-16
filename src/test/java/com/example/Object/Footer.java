package com.example.Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Footer {

    WebDriver driver;
    public Footer(WebDriver driver) {
        this.driver = driver;
    }

    String url = "https://magento.softwaretestingboard.com/";
    By f1 = By.xpath("/html/body/div[2]/footer/div/div/div/ul/li[1]/a");
    By f2 = By.xpath("/html/body/div[2]/footer/div/div/div/ul/li[2]/a");
    By f3 = By.xpath("/html/body/div[2]/footer/div/div/div/ul/li[3]/a");
    By f4 = By.xpath("/html/body/div[2]/footer/div/div/div/ul/li[4]/a");
    By f5 = By.xpath("/html/body/div[2]/footer/div/ul/li[1]/a");
    By f6 = By.xpath("/html/body/div[2]/footer/div/ul/li[2]/a");
    By f7 = By.xpath("/html/body/div[2]/footer/div/ul/li[3]/a");
    By f8 = By.xpath("/html/body/div[2]/footer/div/ul/li[4]/a");

    public void footer1(){
        driver.get(url);
        driver.findElement(f1).click();
        System.out.println("Footer Notes clicked");
    }

    public void footer2(){
        driver.get(url);
        driver.findElement(f2).click();
        System.out.println("Footer Practice API Testing using Magento 2 clicked");
    }

    public void footer3(){
        driver.get(url);
        driver.findElement(f3).click();
        System.out.println("Footer Write for us clicked");
    }

    public void footer4(){
        driver.get(url);
        driver.findElement(f4).click();
        System.out.println("Footer Subscribe Clicked");
    }

    public void footer5(){
        driver.get(url);
        driver.findElement(f5).click();
        System.out.println("Footer Search Terms Clicked");
    }

    public void footer6(){
        driver.get(url);
        driver.findElement(f6).click();
        System.out.println("Footer Privacy and Cookie Policy Clicked");
    }

    public void footer7(){
        driver.get(url);
        driver.findElement(f7).click();
        System.out.println("Footer Advanced Search Clicked");
    }

    public void footer8(){
        driver.get(url);
        driver.findElement(f8).click();
        System.out.println("Footer Orders and Returns Clicked");
    }


}
