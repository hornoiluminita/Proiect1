package qa3.fasttrackit.org.steps;

import net.thucydides.core.annotations.Step;
import qa3.fasttrackit.org.pages.Cartpage;
import qa3.fasttrackit.org.pages.Homepage;
import qa3.fasttrackit.org.pages.LoginPage;
import qa3.fasttrackit.org.pages.MyAccountPage;
import qa3.fasttrackit.org.pages.QuantityCartPage;

public class QuantityCartSteps {
    Homepage homepage;
    QuantityCartPage quantityCartPage;

    @Step
    public void navigateToHomepage() {
        homepage.open();
    }

    @Step
    public void gotoquantitybutton(String quantity) {
        quantityCartPage.clickshopButton();
        quantityCartPage.clickaddcartButton();
        quantityCartPage.clickviewcartButton();
        quantityCartPage.clickchangequantityButton(quantity);
        quantityCartPage.clickupdatecartButton();
    }

    @Step
    public void checkupdatecart() {
        quantityCartPage.setCheckupdateproductButton();

    }

    @Step
    public void checknegativequantitymessage() {
        quantityCartPage.setChecknegativequantitymessage();
    }

    @Step
    public void checknotnumericquantitymessage() {
        quantityCartPage.setChecknotnumericquantitymessage();
    }

}