package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CardPage {


    private WebDriver driver;
    private By mainTitle = By.xpath("//*[@id='content']/div/h2");

    public CardPage(WebDriver driver) {
        this.driver = driver;
    }

    public By getMainTitleElement() {
        return mainTitle;
    }

    public String getMainTitle() {
        return driver.findElement(mainTitle).getText();
    }



}
