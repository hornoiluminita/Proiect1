package qa3.fasttrackit.org.steps;

import net.thucydides.core.annotations.Step;
import qa3.fasttrackit.org.pages.Cartpage;
import qa3.fasttrackit.org.pages.Homepage;
import qa3.fasttrackit.org.pages.LoginPage;
import qa3.fasttrackit.org.pages.MyAccountPage;
import qa3.fasttrackit.org.pages.QuantityCartPage;
public class QuantityCartSteps {
    Homepage homepage;
    LoginPage LoginPage;
    MyAccountPage myAccountPage;
    Cartpage cartpage;
    QuantityCartPage quantityCartPage;
    @Step
    public void navigateToHomepage(){
        homepage.open();
    }
    @Step
    public void gotoquantitybutton(){
        quantityCartPage.clickshopButton();
        quantityCartPage.clickaddcartButton();
        quantityCartPage.clickviewcartButton();
        quantityCartPage.clickchangequantityButton();
        quantityCartPage.clickupdatecartButton();
    }
}
