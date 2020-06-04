package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

        class various1 {
        WebDriver driver;

        void browser() throws InterruptedException {

        driver =new ChromeDriver();
        driver.get("https://www.hotmail.com");
        Thread.sleep(3000);
        driver.close();
    }
}
        class Open2 extends various1 {
        void opengoogle() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.close();

    }
}
        class Open3 extends various1 {
            void openamazon() throws InterruptedException {
                driver = new ChromeDriver();
                driver.get("https://www.amazon.co.uk");
                Thread.sleep(3000);
                driver.close();
            }

            public static class HieracyInheritance {

                public static void main(String[] args) throws InterruptedException {
                    System.setProperty("webdriver.chrome.driver", "/Users/rahul/Desktop/testing/chromedriver");
                 Open3 obj1=new Open3();
                 Open2 obj2=new Open2();
                 obj1.browser();
                 obj2.opengoogle();





                }
            }
        }