package org.example.test;

import com.codeborne.selenide.Selenide;
import org.example.DynamicLoadingPage;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertTrue;

public class DynamicLoadingTest {

    private static final String BASE_URL = "https://the-internet.herokuapp.com/dynamic_loading";
    private static DynamicLoadingPage dynamicLoadingPage;

    @BeforeMethod
    static void setUp() {

        open(BASE_URL);
        dynamicLoadingPage = new DynamicLoadingPage();

    }

    @Test
    void testExample1() {

        dynamicLoadingPage.startLink1();
        dynamicLoadingPage.startButton.shouldBe(visible);
        dynamicLoadingPage.clickStartButton();

        assertTrue(dynamicLoadingPage.isLoadingIndicatorVisible(), "Loading indicator should be visible");

        Selenide.sleep(3000);

        dynamicLoadingPage.waitForLoadingIndicatorToDisappear();

        if (!dynamicLoadingPage.isLoadingIndicatorVisible()) {
            dynamicLoadingPage.getFinishText();
            String getFinishText = dynamicLoadingPage.getFinishText();
            Assertions.assertEquals(getFinishText, "Hello World!");
        } else {
            System.out.println("Loading indicator is visible. Skipping text retrieval.");
        }
    }

    @Test
    void testExample2() {

        dynamicLoadingPage.startLink2();
        dynamicLoadingPage.startButton.shouldBe(visible);
        dynamicLoadingPage.clickStartButton();

        assertTrue(dynamicLoadingPage.isLoadingIndicatorVisible(), "Loading indicator should be visible");

        Selenide.sleep(3000);

        dynamicLoadingPage.waitForLoadingIndicatorToDisappear();


        if (!dynamicLoadingPage.isLoadingIndicatorVisible()) {
            dynamicLoadingPage.getFinishText();
            String getFinishText = dynamicLoadingPage.getFinishText();
            Assertions.assertEquals(getFinishText, "Hello World!");
        } else {
            System.out.println("Loading indicator is visible. Skipping text retrieval.");
        }
    }


}
