package com.company;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        System.out.println("Hello UTk");

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        /* Fb email fill

        driver.get("https://www.facebook.com");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("utkarsha@gmail.com");
        System.out.println("Text Field Set");
        Thread.sleep(10000);
        driver.quit();

         */



        /*  Twitter minimize and maximize
        */
        driver.get("https://twitter.com/explore");
        Point p = new Point(0,3000);
        driver.manage().window().setPosition(p);
        Thread.sleep(10000);
        driver.manage().window().maximize();
        Thread.sleep(10000);
        driver.quit();



        /* Scrreenshot UTkarsha

        Screenshot ss = new Screenshot();
        ss.TakeScreenShot();
        */


    }
}
