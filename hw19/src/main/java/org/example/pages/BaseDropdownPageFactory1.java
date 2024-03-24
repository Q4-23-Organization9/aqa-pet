package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseDropdownPageFactory1 {

    protected WebDriver driver;

    public BaseDropdownPageFactory1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
