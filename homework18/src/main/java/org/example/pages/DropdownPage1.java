package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DropdownPage1 {


    private WebDriver driver;
    private By dropdown = By.xpath("//*[@id='withOptGroup']/div/div[2]/div");


    private By first = By.xpath("//*[@id='react-select-2-option-0-0']");
    private By second = By.xpath("//*[@id='react-select-2-option-0-1']");
    private By third = By.xpath("//*[@id='react-select-2-option-1-0']");
    private By fourth = By.xpath("//*[@id='react-select-2-option-1-1']");
    private By fifth = By.xpath("//*[@id='react-select-2-option-2']");
    private By sixth = By.xpath("//*[@id='react-select-2-option-3']");


    public DropdownPage1(WebDriver driver) {
        this.driver = driver;

    }


    public void scroll(WebDriver driver) {

        WebElement selectMenuContainer = driver.findElement(By.xpath("//*[@id='selectMenuContainer']/div[8]/div"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectMenuContainer);

    }


    public List<String> selectAllOptions() {


        List<String> actualResult = new ArrayList<>();


        List<By> allOptionXPaths = new ArrayList<>();
        allOptionXPaths.add(first);
        allOptionXPaths.add(second);
        allOptionXPaths.add(third);
        allOptionXPaths.add(fourth);
        allOptionXPaths.add(fifth);
        allOptionXPaths.add(sixth);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        for (By allOption : allOptionXPaths) {

            driver.findElement(dropdown).click();


            wait.until(ExpectedConditions.visibilityOfElementLocated(allOption));

            WebElement option = driver.findElement(allOption);

            String getText = option.getText();

            option.click();

            actualResult.add(getText);

        }

        System.out.println("actualResult: " + actualResult);

        return actualResult;

    }

}
