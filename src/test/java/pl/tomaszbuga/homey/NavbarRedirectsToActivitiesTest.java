package pl.tomaszbuga.homey;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideWait;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pl.tomaszbuga.pages.navigation.SideNav;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.url;

public class NavbarRedirectsToActivitiesTest extends BasePageTest {
    private String activitiesBaseUrl = "http://localhost:4200/activities";
    private final SideNav sideNav = new SideNav();

    @BeforeMethod
    public void maximazeWindowBeforeTests() {
        getWebDriver().manage().window().maximize();
    }

    @Test
    public void verifyThatActivitiesPageButtonRedirectsToBeatPage() {
        sideNav.clickOnActivitiesPageButton();
        Assert.assertEquals(url(), activitiesBaseUrl);
    }

    @Test
    public void verifyThatActivitiesPageButtonOnCollapsedMenuRedirectsToActivitiesPage() {
        //Resize to make the menu expendable
        changeWindowDimension(500, 700);
        sideNav.expandSideNav();
        sideNav.clickOnActivitiesPageButton();
        Assert.assertEquals(url(), activitiesBaseUrl);
    }

    private void changeWindowDimension(int xVal, int yVal) {
        getWebDriver()
                .manage()
                .window()
                .setSize(new Dimension(xVal, yVal));
    }

}
