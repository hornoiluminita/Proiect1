package qa3.fasttrackit.org.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import qa3.fasttrackit.org.pages.Homepage;
import qa3.fasttrackit.org.steps.LoginSteps;
import qa3.fasttrackit.org.steps.MyAccountSteps;

@RunWith(SerenityRunner.class)

public class MyAccountTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;
    @Steps
    LoginSteps loginSteps;
    @Steps
    MyAccountSteps myAccountSteps;

    @Test
    public void checkordderMessage() {
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser("lllumy@yahoo.co.uk", "oana1986@");
        myAccountSteps.checkOrders();
    }
}
