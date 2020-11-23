package pl.tomaszbuga.homey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import static pl.tomaszbuga.utils.DriverFactory.getChromeDriver;
import static pl.tomaszbuga.utils.DriverFactory.getWebDriverWait;

public class BasePageTest {
    WebDriver driver;
    WebDriverWait wait;
    private String baseUrl = "http://localhost:4200/";

    @BeforeSuite
    public void startUpBrowser() {
        driver = getChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        wait = getWebDriverWait();
    }

    @BeforeMethod
    public void goToHomePage() {
        driver.get(baseUrl);
    }


    @AfterSuite(alwaysRun = true)
    public void closeDriver() {
        driver.close();
    }
}
