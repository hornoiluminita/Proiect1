package qa3.fasttrackit.org.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import qa3.fasttrackit.org.steps.LoginSteps;
import qa3.fasttrackit.org.steps.OrderStepsAdmin;

@RunWith(SerenityRunner.class)

public class OrdersTestAdmin {
    @Managed(uniqueSession = true)
    private WebDriver driver;
    @Steps
    LoginSteps loginSteps;
    @Steps
    OrderStepsAdmin orderStepsAdmin;
    @Test
    public void changestatusorder(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser("admin","parola11");
        orderStepsAdmin.changeStatusOrder();

    }
    @Test
    public void searchCustomer(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser("admin","parola11");
        orderStepsAdmin.searchCustomer();
    }
}
