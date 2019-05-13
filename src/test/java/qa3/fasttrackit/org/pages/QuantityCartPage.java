package qa3.fasttrackit.org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/")

public class QuantityCartPage extends PageObject {
    @FindBy(css="a[href*='shop']")
    private WebElementFacade shopButton;
    @FindBy (css= "a[href*='add-to-cart=60']")
    private WebElementFacade addcartButton;
    @FindBy (css="i.fa.fa-shopping-cart")
    private WebElementFacade viewcartButton;
    @FindBy (id="#quantity_5cd9c3056205d")
    private WebElementFacade changequantityButton;
    @FindBy (css="update_cart")
    private WebElementFacade updatecartButton;
    public void clickshopButton(){
        clickOn(shopButton);
    }
    public void clickaddcartButton(){clickOn(addcartButton);}
    public void clickviewcartButton (){clickOn(viewcartButton);}
    public void clickchangequantityButton (){clickOn(changequantityButton);}
    public void clickupdatecartButton () {clickOn(updatecartButton);}
}
