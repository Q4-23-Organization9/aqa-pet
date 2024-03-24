package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DropdownPageFactory1 extends BaseDropdownPageFactory1{


    @FindBy(xpath = "//*[@id='withOptGroup']/div/div[2]/div")
    private WebElement dropdown;

    @FindBy(xpath = "//*[@id='react-select-2-option-0-0']")
    private WebElement firstOption;

    @FindBy(xpath = "//*[@id='react-select-2-option-0-1']")
    private WebElement secondOption;

    @FindBy(xpath = "//*[@id='react-select-2-option-1-0']")
    private WebElement thirdOption;

    @FindBy(xpath = "//*[@id='react-select-2-option-1-1']")
    private WebElement fourthOption;

    @FindBy(xpath = "//*[@id='react-select-2-option-2']")
    private WebElement fifthOption;

    @FindBy(xpath = "//*[@id='react-select-2-option-3']")
    private WebElement sixthOption;

    public DropdownPageFactory1(WebDriver driver) {
        super(driver);
    }

    public void scroll() {
        WebElement selectMenuContainer = driver.findElement(By.xpath("//*[@id='selectMenuContainer']/div[8]/div"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectMenuContainer);
    }

    public List<String> selectAllOptions() {
        List<String> actualResult = new ArrayList<>();
        List<WebElement> options = Arrays.asList(firstOption, secondOption, thirdOption, fourthOption, fifthOption, sixthOption);

        for (WebElement option : options) {
            dropdown.click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30).toMillis());
            wait.until(ExpectedConditions.visibilityOf(option));

            actualResult.add(option.getText());
            option.click();
        }

        System.out.println("actualResult: " + actualResult);
        return actualResult;
    }



}
