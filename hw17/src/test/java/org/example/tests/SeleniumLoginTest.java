package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumLoginTest extends BaseTest {

    @Test(testName = "negativeTest",
            description = "negative test for Login")
    public void testIncorrectPassword() {
        driver.get("https://the-internet.herokuapp.com/login");

        WebElement usernameInput = driver.findElement(By.xpath("//*[@id='username']"));
        WebElement passwordInput = driver.findElement(By.xpath("//*[@id='password']"));

        usernameInput.sendKeys("tomsmith");
        passwordInput.sendKeys("invalid_password");

        driver.findElement(By.xpath("//*[@id='login']/button/i")).click();

        WebElement failureMessage = driver.findElement(By.xpath("//*[@id='flash']"));

        String expectedMessage = "Your password is invalid!";
        String actualMessage = failureMessage.getText().trim();


        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test(testName = "positiveTest",
            description = "positive test for Login")
    public void testCorrectLogin() {
        driver.get("https://the-internet.herokuapp.com/login");


        WebElement usernameInput = driver.findElement(By.xpath("//*[@id='username']"));
        WebElement passwordInput = driver.findElement(By.xpath("//*[@id='password']"));

        usernameInput.sendKeys("tomsmith");
        passwordInput.sendKeys("SuperSecretPassword!");

        driver.findElement(By.xpath("//*[@id='login']/button/i")).click();

        WebElement successMessage = driver.findElement(By.xpath("//*[@id='flash']"));

        String expectedMessage = "You logged into a secure area!";
        String actualMessage = successMessage.getText().trim();


        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }

}
