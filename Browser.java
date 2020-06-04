package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    WebDriver driver;

    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "/Users/rahul/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.hotmail.com");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

        public static void main (String[]args)
        {
            Browser obj = new Browser();
            obj.launchBrowser();
        }


    }

