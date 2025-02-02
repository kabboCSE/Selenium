package com.selenium.browser.Testing;

import org.testng.annotations.*;

public class TestNG {


    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }
    @Test(priority = 3)
    public void testExample(){
        System.out.println("Test Example");

    }
    @Test(priority = 0)
    public void testExample2(){
        System.out.println("Test Example2");

    }
    @Test(priority = 1)
    public void testExample3(){
        System.out.println("Test Example3");

    }
    @BeforeSuite
    public void beforeSuite(){

    System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");

    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }
}


