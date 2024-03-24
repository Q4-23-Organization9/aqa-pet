package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageFactory extends BasePageFactory {


    @FindBy(xpath = "//*[@id='content']/div/h2")
    private WebElement mainTitle;
    @FindBy(xpath = "//button[@class='radius']")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id='username']")
    private WebElement usernameInput;

    @FindBy(xpath = "//*[@id='password']")
    private WebElement passwordInput;

    public HomePageFactory(WebDriver driver) {
        super(driver);
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }


    public void enterLogin(String username) {
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public String getMainTitle() {
        return mainTitle.getText();
    }



}
