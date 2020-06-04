package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    class varia {
    WebDriver driver;

    void browser() throws InterruptedException {

        driver =new ChromeDriver();
        driver.get("https://www.hotmail.com");
        Thread.sleep(3000);
        driver.close();
    }
}
    class Open extends varia {
    void opengoogle() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.close();

    }
}
    class Open1 extends Open {
    void openamazon() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.co.uk");
        Thread.sleep(3000);
        driver.close();
    }

    public static class MultilevelInhertiance {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "/Users/rahul/Desktop/testing/chromedriver");
            Open1 obj = new Open1();
            obj.browser();
            obj.opengoogle();
            obj.openamazon();

        }
    }
}