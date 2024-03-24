package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RadioButtonPageFactory extends BaseRadioButtonPageFactory {


    @FindBy(xpath = "//input[@name='group1']")
    private List<WebElement> radioButtonGroup1;

    @FindBy(xpath = "//input[@name='group2']")
    private List<WebElement> radioButtonGroup2;

    public RadioButtonPageFactory(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getRadioButtonsGroup1() {
        return radioButtonGroup1;
    }

    public List<WebElement> getRadioButtonsGroup2() {
        return radioButtonGroup2;
    }



}
