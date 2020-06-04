package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SiteTng {
    WebDriver driver;

@Test(priority = 2)
    void browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/rahul/Desktop/testing/chromedriver");
        driver =new ChromeDriver();
        driver.get("https://www.hotmail.com");
        Thread.sleep(3000);
        driver.close();
    }
@Test(priority = 3)
    void Open2 () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/rahul/Desktop/testing/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.close();

    }
@Test(priority = 1)
    void Open3() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/rahul/Desktop/testing/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.co.uk");
        Thread.sleep(3000);
        driver.close();
    }
}
