package com.company;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;


import java.io.File;

public class Screenshot {

    public void TakeScreenShot() throws Exception {

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://twitter.com/explore");

        Thread.sleep(10000);

        this.takeSnapShot(driver, "D:\\test.png");
        System.out.println("Screenshot successful");
        driver.quit();


    }

    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{


        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        File DestFile=new File(fileWithPath);

        FileUtils.copyFile(SrcFile, DestFile);

    }
}