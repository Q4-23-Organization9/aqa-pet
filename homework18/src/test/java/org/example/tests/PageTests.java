package org.example.tests;

import org.example.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class PageTests {


    private WebDriver driver;
    private HomePage homePage;
    private CardPage cardPage;
    private RadioButtonPage radioButtonPage;
    private DropdownPage dropdownPage;
    private DropdownPage1 dropdownPage1;




    @BeforeTest
    public void initBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        homePage = new HomePage(driver);
        cardPage = new CardPage(driver);
        radioButtonPage = new RadioButtonPage(driver);
        dropdownPage  = new DropdownPage(driver);
        dropdownPage1  = new DropdownPage1(driver);

    }

    @Test
    public void verifyTitleTest() {
        driver.get("https://the-internet.herokuapp.com/login");
        String actualTitle = homePage.getMainTitle();

        assertEquals(actualTitle, "Login Page", "Main title is OK");
    }

    @Test
    public void verifyLogIn() {
        driver.get("https://the-internet.herokuapp.com/login");
        homePage.enterLogin("tomsmith");
        homePage.enterPassword("SuperSecretPassword!");
        homePage.clickOnLoginButton();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(cardPage.getMainTitleElement()));


        cardPage.getMainTitle();

        assertEquals(cardPage.getMainTitle(), "Secure Area", "You are succefully logged");
    }



    @Test
    public void radioTestGroup1() {
        driver.get("https://echoecho.com/htmlforms10.htm");

        List<WebElement> radios = radioButtonPage.getRadioButtonsGroup1();
        System.out.println("Number of radios in group 1: " + radios.size());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        for (int i = 0; i < radios.size(); i++) {
            WebElement element = radios.get(i);
            if (element.isEnabled()) {
                System.out.println("Trying to select radio button in group 1.");
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                try {
                    wait.until(ExpectedConditions.elementToBeClickable(element)).click();
                    System.out.println("Element selected");

                    wait.until(ExpectedConditions.elementSelectionStateToBe(element, true));
                } catch (Exception e) {
                    System.out.println("Failed to select radio button: " + e.getMessage());
                }
            } else {
                System.out.println("Radio button is not enabled.");
            }
        }
    }

    @Test
    public void radioTestGroup2() {
        driver.get("https://echoecho.com/htmlforms10.htm");


        List<WebElement> radios = radioButtonPage.getRadioButtonsGroup2();
        System.out.println("Number of radios in group 2: " + radios.size());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        for (int i = 0; i < radios.size(); i++) {
            WebElement element = radios.get(i);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            if (element.isEnabled()) {
                System.out.println("Trying to select radio button in group 2.");
                try {
                    wait.until(ExpectedConditions.elementToBeClickable(element)).click();
                    System.out.println("Element selected");


                    wait.until(ExpectedConditions.elementSelectionStateToBe(element, true));
                } catch (Exception e) {
                    System.out.println("Failed to select radio button: " + e.getMessage());
                }
            } else {
                System.out.println("Radio button is not enabled.");
            }
        }
    }


    @Test
    public void dropdownTest1() {

        driver.get("https://www.enbook.sk/");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<String> actualResult = dropdownPage.getAllDropdownOptionsText();

        List<String> expectedResult = Arrays.asList("CZ", "PL", "HU", "RO", "SK");

        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void dropdownTest2() {
        driver.get("https://demoqa.com/select-menu");


        dropdownPage1.scroll(driver);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        List<String> actualResult = dropdownPage1.selectAllOptions();

        List<String> expectedResult = Arrays.asList("Group 1, option 1", "Group 1, option 2", "Group 2, option 1", "Group 2, option 2", "A root option", "Another root option");

        assertEquals(expectedResult, actualResult);

    }


    @AfterTest
    public void closeDriver() {
        if(driver != null) {
            driver.quit();
        }
    }




}
