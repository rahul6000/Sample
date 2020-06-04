package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.interactions.MouseMoveToLocation;
import org.openqa.selenium.support.ui.Select;

import javax.xml.ws.WebEndpoint;
import java.awt.event.MouseEvent;

public class Search {
    WebDriver driver;

    public void launchBrowser() throws InterruptedException {
        //try {
            System.setProperty("webdriver.chrome.driver", "/Users/rahul/Desktop/testing/chromedriver");
            //driver = new ChromeDriver();
            //driver.get("https://www.hotmail.com");
            driver = new ChromeDriver();
            driver.get("https://www.google.com"); // Browser launch started
            driver.manage().window().maximize();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("apple uk");
            Thread.sleep(1000);
            // Sending data to  google to search
            //driver.findElement(By.cssSelector ("#tsf > div:nth-child(2) > div.A8SBwf > div.FPdoLc.tfB0Bf > center > input.gNO89b")).click();
            driver.findElement(By.className("gNO89b")).click();
            driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div.r > a > h3")).click();
            driver.findElement(By.cssSelector("#ac-globalnav > div > ul.ac-gn-list > li.ac-gn-item.ac-gn-item-menu.ac-gn-mac > a")).click();
            driver.findElement(By.xpath("//*[@id=\"main\"]/section[1]/div/div/div[2]/p[1]/a")).click();
            driver.findElements(By.xpath("//*[@id=\"model-selection\"]/bundle-selection/div[3]/sticky/div/fieldset/div/span/button[1]"));
            driver.findElement(By.className("label")).click();
            driver.findElement(By.className("button")).click(); // selecting the product (Mac book)
            driver.findElement(By.cssSelector("#summaryheader-form > div > span > button > span")).click();
            driver.findElement(By.xpath("//*[@id=\"shoppingCart.actions.navCheckout\"]")).click();
            Thread.sleep(5000);
            driver.findElement(By.id("guest-checkout")).click(); // product has been added to the cart and guest checkout has been completed
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"checkout.fulfillment.deliveryTab.delivery.deliveryLocation.address.postalCode\"]")).sendKeys("HA8 6HA");
            Thread.sleep(3000);
            driver.findElement(By.cssSelector("#rr-accordion-checkout\\.fulfillment\\.deliveryTab\\.delivery\\.deliveryLocation\\.address_inlineEditor\\.open > div > div.column.as-inlineeditor-container > div > div > button > span:nth-child(1)")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[6]/div[1]/div[2]/div/div/div[3]/div/div/div/div/button")).click();
            driver.findElement(By.className("form-button")).click();
            driver.findElement(By.className("column form-selector-left-col")).click();
            driver.findElement(By.cssSelector("#rs-checkout-continue-button-bottom")).click();
            driver.findElement(By.cssSelector("#checkout\\.shipping\\.addressSelector\\.newAddress\\.address-title")).click();
        //} catch(Exception e){
          //  System.out.println("All ok");
        //}
        driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[5]/div[1]/div[2]/div/div/div/div[1]/div[2]/fieldset/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/select")).click();
        //Select prefix = new Select(driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[5]/div[1]/div[2]/div/div/div/div[1]/div[2]/fieldset/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/select")));
        //Thread.sleep(3000);
        //prefix.selectByVisibleText("Mr");
    }
    public static void main (String[]args) throws InterruptedException {
        Search obj = new Search();
        obj.launchBrowser();
    }
}
