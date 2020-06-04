package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;

public class FireF {
    WebDriver driver;


    public void launchBrowser() {
        System.setProperty("webdriver.gecko.driver", "/Users/rahul/Desktop/testing/geckodriver");
        driver = new FirefoxDriver();
        //driver = new GeckoDriverInfo();
        driver.get("https://www.hotmail.com");
        //driver = new GeckoDriverInfo();
        driver = new FirefoxDriver();
        driver.get("https://www.google.com");

    }
    public static void main (String[]args)
    {
        FireF obj = new FireF();
        obj.launchBrowser();

    }
}
