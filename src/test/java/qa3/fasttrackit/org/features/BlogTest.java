package qa3.fasttrackit.org.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import qa3.fasttrackit.org.steps.BlogSteps;
import qa3.fasttrackit.org.steps.LoginSteps;

@RunWith(SerenityRunner.class)

public class BlogTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;
    @Steps
    LoginSteps loginSteps;
    @Steps
    BlogSteps blogSteps;
    @Test
    public void postusercomment(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser("lllumy@yahoo.co.uk","oana1986@");
        blogSteps.gotoblogButton();
        blogSteps.postcomment("Buna");
        blogSteps.sendcomment();
        blogSteps.checkcomment();
    }
}
