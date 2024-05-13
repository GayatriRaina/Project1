package com.example.ElementID;

import org.openqa.selenium.By;

import static org.example.TestBase.driver;

public class ElementIDS {
    public void getRegistrationID(){
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a")).click();
    }
    public void getRegistrationFirstName(){
        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Gayatri");
        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Raina");
    }
    public void enterDetails(){

        driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("gayatriraina97@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Gayu@567890");
        driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("Gayu@567890");
        driver.findElement(By.xpath("//button[@class=\"action submit primary\"]")).click();
    }

}
