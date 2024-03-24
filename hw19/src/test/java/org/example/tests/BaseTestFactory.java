package org.example.tests;

import org.example.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTestFactory {

    protected WebDriver driver;
    protected HomePageFactory homePageFactory;
    protected CardPageFactory cardPageFactory;
    protected RadioButtonPageFactory radioButtonPageFactory;
    protected DropdownPageFactory dropdownPageFactory;
    protected DropdownPageFactory1 dropdownPageFactory1;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        homePageFactory = new HomePageFactory(driver);
        cardPageFactory = new CardPageFactory(driver);
        radioButtonPageFactory = new RadioButtonPageFactory(driver);
        dropdownPageFactory  = new DropdownPageFactory(driver);
        dropdownPageFactory1  = new DropdownPageFactory1(driver);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}
