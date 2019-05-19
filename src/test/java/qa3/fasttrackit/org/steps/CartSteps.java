package qa3.fasttrackit.org.steps;

import net.thucydides.core.annotations.Step;
import qa3.fasttrackit.org.pages.Cartpage;
import qa3.fasttrackit.org.pages.Homepage;
import qa3.fasttrackit.org.pages.LoginPage;
import qa3.fasttrackit.org.pages.MyAccountPage;

public class CartSteps {
    Homepage homepage;
    Cartpage cartpage;

    @Step
    public void navigateToHomepage(){
        homepage.open();
    }
    @Step
    public void goToCartpage(){
        cartpage.clickshopButton();
        cartpage.clickaddtocartButton();
        cartpage.clickcheckoutButton();
    }
    @Step
    public void removeproductfromcart(String message){
        cartpage.clickshopButton();
        cartpage.clickaddtocartButton();
        cartpage.clickcheckoutButton();
        cartpage.clickviewcartButton ();
        cartpage.clickremovecartButton();
        cartpage.setCheckMessageRemoveProduct(message);
    }
}
