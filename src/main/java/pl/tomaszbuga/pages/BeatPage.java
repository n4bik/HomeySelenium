package pl.tomaszbuga.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static pl.tomaszbuga.utils.DriverFactory.getChromeDriver;
import static pl.tomaszbuga.utils.DriverFactory.getWebDriverWait;

public class BeatPage {
    private WebDriver driver = getChromeDriver();
    private WebDriverWait wait = getWebDriverWait();

    private By newBeatButton = By.xpath("//app-beats/div/div/button");
    private By newBeatDialogContainer = By.xpath("//mat-dialog-container");

    public void clickOnTheNewBeatButton() {
        WebElement newBeatButtonElement = driver.findElement(newBeatButton);
        newBeatButtonElement.click();
    }

    public boolean checkIsNewBeatDialogVisible() {
        try {
            WebElement newBeatDialog = driver.findElement(newBeatDialogContainer);
            return newBeatDialog != null;
        } catch (NoSuchElementException exception) {
            return false;
        }
    }
}
