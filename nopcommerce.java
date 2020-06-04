package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;


/*
* Open Browser
Open nocommerce
Log in as Admin
Select Category Mobile
Add new product with Image
Add description (dummy data)
Add price to it
Add quantity restriction
Checkout
Add address and email details
Buy the product

*/
public class nopcommerce {
    WebDriver driver;

    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver", "/Users/rahul/Desktop/testing/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

    }

    public void findElement() throws InterruptedException {
        driver.findElement(By.id("Email")).sendKeys("");
        driver.findElement(By.id("Password")).sendKeys("");
        Thread.sleep(3000);

        try{
            WebElement webElement = driver.findElement(By.cssSelector("body > div.master-wrapper-page > div > div > div > div > div.page-body > div.customer-blocks > div > form > div.buttons > input"));
            Actions builder = new Actions(driver);
            builder.moveToElement(webElement).click(webElement);
            builder.perform();


            /*WebElement webElement = driver.findElement(By.cssSelector("body > div.master-wrapper-page > div > div > div > div > div.page-body > div.customer-blocks > div > form > div.buttons > input"));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", webElement);*/
        }catch (Exception e){
            System.out.println("Element not found");
        }
    }

    public void SelectMobileCategory() throws InterruptedException {
        WebElement m = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/ul/li[2]/a"));
        Thread.sleep(4000);
        m.click();
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/ul/li[2]/ul/li[1]/a/span")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/form[1]/div[1]/div/a")).click();
        driver.findElement(By.id("Name")).sendKeys("Samsung S10 Lite");
        Thread.sleep(3000);

        //driver.findElement(By.xpath("//*[@id=\"product-info\"]/div[2]/div/div[3]/div[2]/div/div")).click();
        Thread.sleep(4000);


        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"product-info\"]/div[2]/div/div[3]/div[2]/div/div"));
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.elementToBeSelected(elm));
        dropdown.click();


        Select selectEle = new Select(driver.findElement(By.id("SelectedCategoryIds")));
        //selectEle.selectByValue("5");

        List<WebElement> elements = selectEle.getOptions();


        //System.out.println(elements.size());
        //for(WebElement web : elements){
        //  System.out.println(web.getText());
        //}

        //selectEle.selectByVisibleText("Computers");
        //dd_menu.selectByValue("7");

        /*for(int i=0; i<dd_menu.size();i++){
            WebElement element = dd_menu.get(i);
            String innerhtml = element.getAttribute("innerHtml");
            System.out.println("values from dropdown is" + innerhtml);

        }*/

       /* WebElement element = driver.findElement(By.xpath("//*[@id=\"SelectedCategoryIds\"]"));

        Select dd_menu = new Select(element);
        dd_menu.selectByValue("7");*/

    }
    public static void main (String args[]) throws InterruptedException {
        nopcommerce obj = new nopcommerce();
        obj.launchBrowser();
        obj.findElement();
        obj.SelectMobileCategory();
    }
}
