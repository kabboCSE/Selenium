package com.selenium.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CrossBrowser {

    String url = "https://www.google.com/";
    WebDriver driver;
//    String browser = System.getProperty("browser", "firefox");

    @BeforeSuite
    public void startBrowser() {
        String browser = System.getProperty("browser", "firefox");
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();

        }else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();

        }else {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        }


    }

    @Test
    public void openURL() throws InterruptedException {
        driver.get("https://www.google.com");
        Thread.sleep(5000);

    }

    @AfterSuite
    public void closeChromeBrowser() {

        driver.close();

    }



}
