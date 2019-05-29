package qa3.fasttrackit.org.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import qa3.fasttrackit.org.pages.LoginPage;
import qa3.fasttrackit.org.steps.BlogStepsAdmin;
import qa3.fasttrackit.org.steps.CartStepsAdmin;
import qa3.fasttrackit.org.steps.LoginSteps;

@RunWith(SerenityRunner.class)

public class CartTestAdmin {
    @Managed(uniqueSession = true)
    private WebDriver driver;
    @Steps
    LoginSteps loginSteps;
    @Steps
   CartStepsAdmin cartStepsAdmin;
    @Steps
    QuantityCartTest quantityCartTest;
    @Test
    public void addproducttoshop(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser("admin","parola11");
        cartStepsAdmin.addproducttoshop("100","90","Bag");


    }
}
