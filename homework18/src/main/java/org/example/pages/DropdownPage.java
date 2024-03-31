package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DropdownPage {


    private WebDriver driver;


    private By dropdownTrigger = By.xpath("//*[@id='switcher-store-trigger']/strong");
    private By dropdownOptions = By.xpath("//*[@id='switcher-store-trigger']/strong/span");

    private By first = By.xpath("//*[@id='switcher-store']/div/ul/li[1]");
    private By second = By.xpath("//*[@id='switcher-store']/div/ul/li[1]");
    private By third = By.xpath("//*[@id='switcher-store']/div/ul/li[2]");
    private By fourth = By.xpath("//*[@id='switcher-store']/div/ul/li[3]");
    private By fifth = By.xpath("//*[@id='switcher-store']/div/ul/li[4]");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }



    public List<String> getAllDropdownOptionsText() {
        List<String> actualResult = new ArrayList<>();

        List<By> optionXPaths = new ArrayList<>();
        optionXPaths.add(first);
        optionXPaths.add(second);
        optionXPaths.add(third);
        optionXPaths.add(fourth);
        optionXPaths.add(fifth);

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));

        for (By optionXPath : optionXPaths) {

            driver.findElement(dropdownTrigger).click();


            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //wait.until(ExpectedConditions.visibilityOfElementLocated(optionXPath));

            WebElement option = driver.findElement(optionXPath);

            option.click();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

           // wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownOptions));

            WebElement spanElement = driver.findElement(dropdownOptions);
            String spanText = spanElement.getText();
            actualResult.add(spanText);

        }
        System.out.println("actualResult: " + actualResult);
        return actualResult;
    }

}
