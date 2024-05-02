package org.example.test;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class SelenideFirstTest {


    @Test
    public void checkCheckbox() {

        Configuration.screenshots = true;

        open("https://the-internet.herokuapp.com/checkboxes");
        Selenide.sleep(3000);

        String checkboxesText = $(By.xpath("//div[@class='example']/h3")).shouldHave(Condition.text("Checkboxes")).text();


        ElementsCollection checkboxList = $$(By.xpath("//input[@type='checkbox']"));
        checkboxList.shouldHave(CollectionCondition.size(3));

    }
    @Test
    public void uploadFile() {

        open("https://the-internet.herokuapp.com/upload");
        File fileToUpload = new File("D:/GitRepoJava/aqa-pet/hw24/src/test/resources/downloads/86c6537c-5e35-46ca-b414-074d4b18c5c0/sample.png");
        $(By.xpath("//*[@id='file-upload']")).uploadFile(fileToUpload);
        Selenide.sleep(3000);
        $(By.xpath("//*[@id='file-submit']")).click();
        Selenide.sleep(3000);
        $(By.xpath("//*[@id='content']/div/h3")).shouldHave(Condition.text("File Uploaded!"));
    }
    @Test(dependsOnMethods = "uploadFile")
    public void downloadFile() throws FileNotFoundException {

        open("https://the-internet.herokuapp.com/download");

        $(By.xpath("//a[@href='download/sample.png']")).download();

    }

    @Test
    public void dragAndDropFile() {

        open("https://the-internet.herokuapp.com/drag_and_drop");



        $(By.xpath("//div[@id='column-a']")).shouldBe(Condition.visible).dragAndDropTo($(By.xpath("//div[@id='column-b']")));
        Selenide.sleep(3000);

    }



}
