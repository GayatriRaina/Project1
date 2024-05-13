package com.example.Object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestBase {
    WebDriver driver;
    public TestBase(WebDriver driver) {
        this.driver = driver;
    }
    By serchBox = By.xpath("https://magento.softwaretestingboard.com/");
    By createaccount = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a");
    By firstname = By.xpath("//input[@id='firstname']");
    By lastname = By.xpath("//input[@id='lastname']");
    By emailId = By.xpath("//input[@id='email_address']");
    By password = By.xpath("//input[@id='password']");
    By confirmpass = By.xpath("//input[@id='password-confirmation']");
    By submit = By.xpath("//button[@class=\"action submit primary\"]");





    public void verifypage(){

        String actualTitle = String.valueOf(serchBox);
        String expectedTitle = "By.xpath: https://magento.softwaretestingboard.com/";
        assertEquals(expectedTitle,actualTitle);
    }

public void enterDetails(){
    driver.findElement(createaccount).click();
    driver.findElement(firstname).sendKeys("Gayatri");
    driver.findElement(lastname).sendKeys("Raina");
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,500)");
    driver.findElement(emailId).sendKeys("gayatriraina97@gmail.com");
    driver.findElement(password).sendKeys("Gayu@567890");
    driver.findElement(confirmpass).sendKeys("Gayu@567890");
    driver.findElement(submit).click();

}

}
