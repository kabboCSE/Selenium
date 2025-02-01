package com.selenium.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ChromeBrowser {

    WebDriver driver;

    @BeforeSuite
    public void startChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @Test
    public void openURL() {
    driver.get("https://www.google.com");

    }

    @AfterSuite
    public void closeChromeBrowser() {

        driver.close();

    }



}
