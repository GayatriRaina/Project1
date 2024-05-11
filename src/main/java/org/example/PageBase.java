package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class PageBase extends TestBase {

    @BeforeMethod
    public void url(){
        Initialization();

    }

    @Test
    public void verifypage(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "Home Page";
        assertEquals(expectedTitle,actualTitle);
    }

    @Test(priority = 1)
    public void registration() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://magento.softwaretestingboard.com/");
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a")).click();

        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Gayatri");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Raina");
        driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("gayatriraina97@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Gayu@567890");
        driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("Gayu@567890");
        driver.findElement(By.xpath("//button[@class=\"action submit primary\"]")).click();
    }

    @Test(priority = 2)
    public void invalidlogin(){
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();

        driver.findElement(By.xpath("//input[@name=\"login[username]\"]")).sendKeys("gayatriraina97@gmail.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.xpath("//input[@name=\"login[password]\"]")).sendKeys("Gayatri@123");
        driver.findElement(By.xpath("//button[@class=\"action login primary\"]")).click();
        driver.close();
    }

    @Test(priority = 3)
    public void login(){
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();

        driver.findElement(By.xpath("//input[@name=\"login[username]\"]")).sendKeys("gayatriraina97@gmail.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.xpath("//input[@name=\"login[password]\"]")).sendKeys("Gayu@567890");
        driver.findElement(By.xpath("//button[@class=\"action login primary\"]")).click();
    }

    @Test(priority = 4)
    public void Tab1(){
        driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]/span")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[2]/div/div/ul[1]/li[1]/a")).click();
        js.executeScript("window.scrollBy(0,1000)");

        driver.findElement(By.xpath("//img[@alt=\"Phoebe Zipper Sweatshirt\"]")).click();
        js.executeScript("window.scrollBy(0,700)");

        driver.findElement(By.xpath("//div[@index=\"2\"]")).click();
        driver.findElement(By.xpath("//div[@option-label=\"White\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span")).click();

        js.executeScript("window.scrollBy(0,-700)");

    }

    @Test(priority = 5)
    public void Tab2() throws InterruptedException {
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

    @Test(priority = 6)
    public void Tab3(){
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

    @Test(priority = 8)
    public void Tab4(){
        Actions actions = new Actions(driver);
        WebElement gear = driver.findElement(By.xpath("//a[@id=\"ui-id-6\"]"));
        actions.moveToElement(gear);

        WebElement watches = driver.findElement(By.xpath("//*[@id=\"ui-id-27\"]"));
        actions.moveToElement(watches);

        actions.click().build().perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        WebElement product = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[3]/div/a/span/span/img"));

        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[1]/div/div/div[3]/div/div[2]/a[2]")).click();

    }

    @Test(priority = 7)
    public void Tab5() throws InterruptedException {
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
        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-170\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-54\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
    }

    @Test(priority = 9)
    public void Tab6(){
        driver.findElement(By.xpath("//*[@id=\"ui-id-8\"]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[2]/div/div[1]/a[2]/span/span[2]")).click();
        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[2]/div[1]/a/span/span[2]")).click();
        js.executeScript("window.scrollBy(0,2000)");

        Actions actions = new Actions(driver);

        WebElement product = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[2]/div[3]/div/div/ol/li[4]"));
        actions.moveToElement(product);

        actions.click().build().perform();
        js.executeScript("window.scrollBy(0,700)");

        driver.findElement(By.xpath("//*[@id=\"bundle-slide\"]")).click();

        WebElement radio = driver.findElement(By.xpath("//*[@id=\"bundle-option-1-2\"]"));

        radio.click();

        driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
    }

    @Test(priority = 10)
    public void removingProducts() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//input[@name=\"login[username]\"]")).sendKeys("gayatriraina97@gmail.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.xpath("//input[@name=\"login[password]\"]")).sendKeys("Gayu@567890");
        driver.findElement(By.xpath("//button[@class=\"action login primary\"]")).click();

        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@class=\"action showcart\"]")).click();
        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.xpath("//*[@id=\"mini-cart\"]/li[1]/div/div/div[2]/div[2]/a")).click();

        Alert alert = driver.switchTo().alert();
        String alertMessage= alert.getText();
        alert.accept();
        System.out.println("Alert msg is : "+alertMessage);

    }

}
