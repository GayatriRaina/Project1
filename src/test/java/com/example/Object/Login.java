package com.example.Object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {
    WebDriver driver;
    public Login(WebDriver driver) {
        this.driver = driver;
    }

    String url = "https://magento.softwaretestingboard.com/";

    By createaccount = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a");
    By firstname = By.xpath("//input[@id='firstname']");
    By lastname = By.xpath("//input[@id='lastname']");
    By emailId = By.xpath("//input[@id='email_address']");
    By password = By.xpath("//input[@id='password']");
    By confirmpass = By.xpath("//input[@id='password-confirmation']");
    By submit = By.xpath("//button[@class=\"action submit primary\"]");

    By loginpage = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");

    By email = By.xpath("//input[@name=\"login[username]\"]");
    By pass = By.xpath("//input[@name=\"login[password]\"]");
    By submit1 = By.xpath("//button[@class=\"action login primary\"]");
    By frgtpass = By.xpath("//a[@class=\"action remind\"]");
    By frtemail = By.xpath("//*[@id=\"email_address\"]");
    By resetpass = By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button");
    By drpdwn = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button");
    By signoff = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a");


    public void enterDetails(){
        driver.get(url);
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
    public void invalidcred(){
        driver.get(url);
        driver.findElement(loginpage).click();
        driver.findElement(email).sendKeys("gayatriraina97@gmail.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(pass).sendKeys("Gayatri@123");
        driver.findElement(submit1).click();
    }

    public void validcred(){
        driver.get(url);
        driver.findElement(loginpage).click();
        driver.findElement(email).sendKeys("gayatriraina97@gmail.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(pass).sendKeys("Gayu@567890");
        driver.findElement(submit1).click();
    }

    public void forgetpassword() throws InterruptedException {
        driver.get(url);
        driver.findElement(loginpage).click();
        Thread.sleep(4000);
        driver.findElement(frgtpass).click();
        Thread.sleep(4000);
        driver.findElement(frtemail).sendKeys("gayatriraina97@gmail.com");
        Thread.sleep(4000);
        driver.findElement(resetpass).click();
    }

    public void logout() throws InterruptedException {
        driver.get(url);
        driver.findElement(loginpage).click();
        driver.findElement(email).sendKeys("gayatriraina97@gmail.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(pass).sendKeys("Gayu@567890");
        driver.findElement(submit1).click();
        Thread.sleep(4000);
        driver.findElement(drpdwn).click();
        Thread.sleep(4000);
        driver.findElement(signoff).click();
        Thread.sleep(4000);
    }

}
