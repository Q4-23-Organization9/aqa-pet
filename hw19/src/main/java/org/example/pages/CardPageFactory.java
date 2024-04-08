package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CardPageFactory extends BasePageFactory {


    @FindBy(xpath = "//*[@id='content']/div/h2")
    private WebElement mainTitle;

    public CardPageFactory(WebDriver driver) {
        super(driver);
    }

    public WebElement getMainTitleElement() {
        return mainTitle;
    }

    public String getMainTitle() {
        return mainTitle.getText();
    }



}
