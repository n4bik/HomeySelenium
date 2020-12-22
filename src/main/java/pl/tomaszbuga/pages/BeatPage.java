package pl.tomaszbuga.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class BeatPage {
    private By newBeatButton = By.xpath("//app-beats/div/div/button");
    private By newBeatDialogContainer = By.xpath("//mat-dialog-container");

    public void clickOnTheNewBeatButton() {
        $(newBeatButton).click();
    }

    public boolean checkIsNewBeatDialogVisible() {
        return $(newBeatDialogContainer).exists();
    }
}
