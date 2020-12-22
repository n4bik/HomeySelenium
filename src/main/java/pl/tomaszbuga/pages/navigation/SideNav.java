package pl.tomaszbuga.pages.navigation;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.tomaszbuga.pages.ActivitiesPage;
import pl.tomaszbuga.pages.BeatPage;
import pl.tomaszbuga.pages.HomePage;

import static com.codeborne.selenide.Selenide.$;
import static pl.tomaszbuga.utils.DriverFactory.getChromeDriver;
import static pl.tomaszbuga.utils.DriverFactory.getWebDriverWait;

public class SideNav {
    private By homePageButton = By.xpath("//mat-nav-list/a[1]/div");
    private By activitiesPageButton = By.xpath("//mat-nav-list/a[2]/div");
    private By beatPageButton = By.xpath("//mat-nav-list/a[3]/div");
    private By billsPageButton = By.xpath("//mat-nav-list/a[4]/div");
    private SelenideElement menuToggleButton = $("#hms-menu-toggle-button");
    private SelenideElement sideNavDrawer = $(".mat-drawer-inner-container");

    public BeatPage clickOnBeatPageButton() {
        $(beatPageButton).click();
        return new BeatPage();
    }

    public ActivitiesPage clickOnActivitiesPageButton() {
        $(activitiesPageButton).click();
        return new ActivitiesPage();
    }

    public SideNav expandSideNav() {
        menuToggleButton.waitUntil(Condition.visible, 5000);
        if (!isSideNavDisplayed())
            menuToggleButton.click();

        return this;
    }

    public SideNav collapseSideNav() {
        if (isSideNavDisplayed())
            menuToggleButton.click();
        return this;
    }

    private boolean isSideNavDisplayed() {
        return sideNavDrawer.isDisplayed();
    }
}
