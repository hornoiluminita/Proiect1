package qa3.fasttrackit.org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/")

public class QuantityCartPage extends PageObject {
    @FindBy(css = "a[href*='shop']")
    private WebElementFacade shopButton;
    @FindBy(css = "a[href*='add-to-cart=60']")
    private WebElementFacade addcartButton;
    @FindBy(css = "i.fa.fa-shopping-cart")
    private WebElementFacade viewcartButton;
    @FindBy(css = "input[title='Qty'")
    private WebElementFacade changequantityButton;
    @FindBy(css = "button[name='update_cart']")
    private WebElementFacade updatecartButton;
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade checkupdateproductButton;
    @FindBy (css=".input-text.qty.text")
    private WebElementFacade checknegativequantitymessage;
    @FindBy(css=".cart-empty")
    private WebElementFacade checknotnumericquantitymessage;

    public void clickshopButton() {
        clickOn(shopButton);
    }

    public void clickaddcartButton() {
        clickOn(addcartButton);
    }

    public void clickviewcartButton() {
        waitABit(1500);
        clickOn(viewcartButton);
    }

    public void clickchangequantityButton(String quantity) {
        typeInto(changequantityButton, quantity);
    }

    public void clickupdatecartButton() {
        clickOn(updatecartButton);
    }

    public void setCheckupdateproductButton() {
        checkupdateproductButton.shouldContainText("Cart updated.");
    }
   public void setChecknegativequantitymessage(){
        getDriver().navigate().refresh();
        checknegativequantitymessage.shouldContainText("");
   }
    public void setChecknotnumericquantitymessage(){
        checknotnumericquantitymessage.shouldContainText("Your cart is currently empty.");
    }
}