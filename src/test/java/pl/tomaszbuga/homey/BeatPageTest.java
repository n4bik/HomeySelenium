package pl.tomaszbuga.homey;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.tomaszbuga.pages.*;
import pl.tomaszbuga.pages.navigation.SideNav;

public class BeatPageTest extends BasePageTest {

    private BeatPage beatPage;
    private final SideNav sideNav = new SideNav();

    @Test
    public void verifyThatBeatPageButtonRedirectsToBeatPage() {
        beatPage = sideNav.clickOnBeatPageButton();

        Assert.assertEquals(driver.getCurrentUrl(), "http://localhost:4200/beats");
    }

    @Test
    public void verifyThatNewBeatButtonWorksProperly() {
        beatPage = sideNav.clickOnBeatPageButton();

        beatPage.clickOnTheNewBeatButton();

        Assert.assertTrue(beatPage.checkIsNewBeatDialogVisible());
    }
}
