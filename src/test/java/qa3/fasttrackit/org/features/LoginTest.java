package qa3.fasttrackit.org.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import qa3.fasttrackit.org.steps.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    LoginSteps loginSteps;
    @Before
    public void maximiseWindow(){
    driver.manage().window().maximize();
    }

    @Test
    public void loginWithValidCredentials(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser("lllumy@yahoo.co.uk","oana1986@");
        loginSteps.checkUserIsLoggedIn();

    }

    @Test
    public void loginWithInvalidPassword(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser("lllumy@yahoo.co.uk","45454iuhggf");
        loginSteps.checkUserNotLoggedIn();
    }

    @Test
    public void loginWithIncorrectEmail(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser("lllumy@yahoo.co.uk","jujijijiji12356");
        loginSteps.checkUserNotLoggedIn();
    }
    @Test
    public void loginWithInvalidEmail(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser("lllumyyahoo.co.uk","123bjhbhbbj");

        loginSteps.userStillOnLoginPage();
    }

}
