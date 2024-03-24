package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButtonPage {


    private WebDriver driver;
    private By radioButtonGroup1 = By.xpath("//input[@name='group1']");
    private By radioButtonGroup2 = By.xpath("//input[@name='group2']");

    public RadioButtonPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getRadioButtonsGroup1() {
        return driver.findElements(radioButtonGroup1);
    }

    public List<WebElement> getRadioButtonsGroup2() {
        return driver.findElements(radioButtonGroup2);
    }



}
