package pl.tomaszbuga.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static pl.tomaszbuga.utils.DriverFactory.getChromeDriver;
import static pl.tomaszbuga.utils.DriverFactory.getWebDriverWait;

public class HomePage {
    private WebDriver driver = getChromeDriver();
    private WebDriverWait wait = getWebDriverWait();
}
