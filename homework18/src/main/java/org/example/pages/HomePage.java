package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {


    private WebDriver driver;


    private By mainTitle = By.xpath("//*[@id='content']/div/h2");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getMainTitle() {
        return driver.findElement(mainTitle).getText();
    }


    public void clickOnLoginButton() {
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='radius']"));
        loginButton.click();
    }

    public void enterLogin (String login) {
        WebElement loginInput = driver.findElement(By.xpath("//*[@id='username']"));
        loginInput.sendKeys(login);
    }

    public void enterPassword(String password) {
        WebElement passwordInput = driver.findElement(By.xpath("//*[@id='password']"));
        passwordInput.sendKeys(password);
    }



}
