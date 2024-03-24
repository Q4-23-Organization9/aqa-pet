package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class DropdownPageFactory extends BaseDropdownPageFactory{


    @FindBy(xpath = "//*[@id='switcher-store-trigger']/strong")
    private WebElement dropdownTrigger;

    @FindBy(xpath = "//*[@id='switcher-store-trigger']/strong/span")
    private WebElement dropdownOptions;

    @FindBy(xpath = "//*[@id='switcher-store']/div/ul/li[1]")
    private WebElement firstOption;

    @FindBy(xpath = "//*[@id='switcher-store']/div/ul/li[1]")
    private WebElement secondOption;

    @FindBy(xpath = "//*[@id='switcher-store']/div/ul/li[2]")
    private WebElement thirdOption;

    @FindBy(xpath = "//*[@id='switcher-store']/div/ul/li[3]")
    private WebElement fourthOption;

    @FindBy(xpath = "//*[@id='switcher-store']/div/ul/li[4]")
    private WebElement fifthOption;

    public DropdownPageFactory(WebDriver driver) {
        super(driver);
    }

    public List<String> getAllDropdownOptionsText() {
        List<String> actualResult = new ArrayList<>();

        List<WebElement> options = new ArrayList<>();
        options.add(firstOption);
        options.add(secondOption);
        options.add(thirdOption);
        options.add(fourthOption);
        options.add(fifthOption);



        for (WebElement option : options) {
            dropdownTrigger.click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            option.click();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            actualResult.add(dropdownOptions.getText());
        }

        System.out.println("actualResult: " + actualResult);
        return actualResult;
    }



}
