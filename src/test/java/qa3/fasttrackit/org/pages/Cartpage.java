package qa3.fasttrackit.org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/")

public class Cartpage extends PageObject {
    @FindBy (css="a[href*='shop']")
    private WebElementFacade shopButton;
    @FindBy (css= "a[href*='add-to-cart=48']")
    private WebElementFacade addtocartButton;
    @FindBy (css="a[href*='checkout']")
    private WebElementFacade checkoutButton;
    @FindBy (css="fa fa-shopping-cart")
    private WebElementFacade viewcartButton;
    @FindBy (css="remove this item")
    private WebElementFacade  removecartButton;
    public void clickshopButton(){
        clickOn(shopButton);
    }
    public void clickaddtocartButton(){clickOn(addtocartButton);}
    public void clickcheckoutButton(){clickOn(checkoutButton);}
    public void clickviewcartButton (){clickOn(viewcartButton);}
    public void clickremovecartButton (){clickOn(removecartButton);}
}
