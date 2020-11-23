package pl.tomaszbuga.pages.navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.tomaszbuga.pages.ActivitiesPage;
import pl.tomaszbuga.pages.BeatPage;
import pl.tomaszbuga.pages.HomePage;

import static pl.tomaszbuga.utils.DriverFactory.getChromeDriver;
import static pl.tomaszbuga.utils.DriverFactory.getWebDriverWait;

public class SideNav {
    private WebDriver driver = getChromeDriver();
    private WebDriverWait wait = getWebDriverWait();

    private By homePageButton = By.xpath("//mat-nav-list/a[1]/div");
    private By activitiesPageButton = By.xpath("//mat-nav-list/a[2]/div");
    private By beatPageButton = By.xpath("//mat-nav-list/a[3]/div");
    private By billsPageButton = By.xpath("//mat-nav-list/a[4]/div");

    public HomePage clickOnHomePageButton() {
        WebElement homePageButtonElement = driver.findElement(homePageButton);
        homePageButtonElement.click();
        return new HomePage();
    }

    public ActivitiesPage clickOnActivitiesPageButton() {
        WebElement activitiesPageButtonElement = driver.findElement(activitiesPageButton);
        activitiesPageButtonElement.click();
        return new ActivitiesPage();
    }

    public BeatPage clickOnBeatPageButton() {
        WebElement beatPageButtonElement = driver.findElement(beatPageButton);
        beatPageButtonElement.click();
        return new BeatPage();
    }
}
