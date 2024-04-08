package org.example.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class PageTestsFactory extends BaseTestFactory {


    @Test
    public void verifyTitleTest() {
        driver.get("https://the-internet.herokuapp.com/login");
        String actualTitle = homePageFactory.getMainTitle();

        assertEquals(actualTitle, "Login Page", "Main title is OK");
    }

    @Test
    public void verifyLogIn() {
        driver.get("https://the-internet.herokuapp.com/login");
        homePageFactory.enterLogin("tomsmith");
        homePageFactory.enterPassword("SuperSecretPassword!");
        homePageFactory.clickOnLoginButton();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5).toMillis());
        WebElement mainTitleElement = wait.until(ExpectedConditions.visibilityOf(cardPageFactory.getMainTitleElement()));

        assertEquals(cardPageFactory.getMainTitle(), "Secure Area", "You are successfully logged");
    }

    @Test
    public void radioTestGroup1() {
        driver.get("https://echoecho.com/htmlforms10.htm");

        List<WebElement> radios = radioButtonPageFactory.getRadioButtonsGroup1();
        System.out.println("Number of radios in group 1: " + radios.size());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30).toMillis());

        radios.forEach(element -> {
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
        });
    }

    @Test
    public void radioTestGroup2() {
        driver.get("https://echoecho.com/htmlforms10.htm");

        List<WebElement> radios = radioButtonPageFactory.getRadioButtonsGroup2();
        System.out.println("Number of radios in group 2: " + radios.size());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30).toMillis());

        radios.forEach(element -> {
            if (element.isEnabled()) {
                System.out.println("Trying to select radio button in group 2.");
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
        });
    }

    @Test
    public void dropdownTest1() {
        driver.get("https://www.enbook.sk/");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<String> actualResult = dropdownPageFactory.getAllDropdownOptionsText();
        List<String> expectedResult = List.of("CZ", "PL", "HU", "RO", "SK");

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void dropdownTest2() {
        driver.get("https://demoqa.com/select-menu");

        dropdownPageFactory1.scroll();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<String> actualResult = dropdownPageFactory1.selectAllOptions();
        List<String> expectedResult = List.of("Group 1, option 1", "Group 1, option 2", "Group 2, option 1", "Group 2, option 2", "A root option", "Another root option");

        assertEquals(expectedResult, actualResult);
    }



}
