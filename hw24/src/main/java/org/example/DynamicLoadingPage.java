package org.example;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class DynamicLoadingPage {

    private final SelenideElement startLink1 = $(byXpath("//a[@href='/dynamic_loading/1']"));
    private final SelenideElement startLink2 = $(byXpath("//a[@href='/dynamic_loading/2']"));
    public final SelenideElement startButton = $(byXpath("//div[@id='start']/button"));
    private SelenideElement loadingIndicator = $(byXpath("//*[@id='loading']"));
    private SelenideElement finishText = $(byXpath("//*[@id='finish']/h4"));


    public void startLink1() {
        startLink1.click();
    }
    public void startLink2() {
        startLink2.click();
    }
    public void clickStartButton() {
        startButton.click();
    }


    public boolean isLoadingIndicatorVisible() {
        return loadingIndicator.isDisplayed();
    }


    public void waitForLoadingIndicatorToDisappear() {
        loadingIndicator.should(disappear);
    }


    public String getFinishText() {
        return finishText.getText();
    }


}
