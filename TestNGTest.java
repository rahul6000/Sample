package Selenium;

import org.testng.annotations.Test;

public class TestNGTest {


    @Test(priority = 1)
    void setup(){
        System.out.println("This is a setup");

    }
@Test(priority = 3)
    void login(){

        System.out.println("this is a login page");

}
@Test(priority = 2)
void close(){

        System.out.println("This is the close page");

}


        }
