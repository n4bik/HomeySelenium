package pl.tomaszbuga.homey;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.tomaszbuga.pages.*;
import pl.tomaszbuga.pages.navigation.SideNav;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

public class BeatPageTest extends BasePageTest {
    private BeatPage beatPage;
    private String beatsBaseUrl = "http://localhost:4200/beats";
    private final SideNav sideNav = new SideNav();

    @Test
    public void verifyThatBeatPageButtonRedirectsToBeatPage() {
        beatPage = sideNav.clickOnBeatPageButton();

        Assert.assertEquals(url(), beatsBaseUrl);
    }

    @Test
    public void verifyThatNewBeatButtonWorksProperly() {
        beatPage = sideNav.clickOnBeatPageButton();
        beatPage.clickOnTheNewBeatButton();

        Assert.assertTrue(beatPage.checkIsNewBeatDialogVisible());
    }
}
