package qa3.fasttrackit.org.steps;

import net.thucydides.core.annotations.Step;
import qa3.fasttrackit.org.pages.CartpageAdmin;
import qa3.fasttrackit.org.pages.Homepage;


public class CartStepsAdmin {
    Homepage homepage;
    CartpageAdmin cartpageAdmin;

    @Step
    public void navigateToHomepage() {
        homepage.open();
    }

    @Step
    public void addproducttoshop(String regularprice, String saleprice, String productname) {
        cartpageAdmin.clickfastTrackITButton();
        cartpageAdmin.clickproductsButton();
        cartpageAdmin.clickaddNewProductButton();
        cartpageAdmin.setProductname(productname);
        cartpageAdmin.setRegularpriceField(regularprice);
        cartpageAdmin.setSaleprice(saleprice);
        cartpageAdmin.clickpublishButton();
    }
}