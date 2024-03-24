package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseDropdownPageFactory {

    private WebDriver driver;

    public BaseDropdownPageFactory(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


}
