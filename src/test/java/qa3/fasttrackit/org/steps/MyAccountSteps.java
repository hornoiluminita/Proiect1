package qa3.fasttrackit.org.steps;

import net.thucydides.core.annotations.Step;
import qa3.fasttrackit.org.pages.Homepage;
import qa3.fasttrackit.org.pages.LoginPage;
import qa3.fasttrackit.org.pages.MyAccountPage;

public class MyAccountSteps {
    Homepage homepage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    @Step
    public void checkOrders() {
        myAccountPage.myaccountButton();
        myAccountPage.ordersButton();
        myAccountPage.viewOrderButton();
        myAccountPage.setCheckOrderButton();
    }
}
