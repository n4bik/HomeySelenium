package pl.tomaszbuga.homey;

import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class BasePageTest {
    private String baseUrl = "http://localhost:4200/";

    @BeforeMethod
    public void goToHomePage() {
        open(baseUrl);
    }
}
