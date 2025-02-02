package com.selenium.browser.browsercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserCommandExample {


    String url = "https://www.startech.com.bd/";
    WebDriver driver;

    @BeforeSuite
    public void StartChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
@Test
    public void getCurrentUrl() {
        driver.get(url);
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        if(url.equals(currentUrl)) {
            System.out.println("Current Url passed");
        } else {
            System.out.println("Current Url not passed");
        }
    }

    @AfterSuite
    public void quit() {

        driver.quit();
    }
}

