package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class VerifyPageTitle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://magento.softwaretestingboard.com/");
        String Actual = driver.getTitle();
        String Expected = "Home Page";

        if (Actual.equals(Expected)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        driver.close();
    }
}
