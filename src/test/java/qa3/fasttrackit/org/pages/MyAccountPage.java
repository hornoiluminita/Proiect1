package qa3.fasttrackit.org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa3.fasttrackit.org:8008/")
public class MyAccountPage extends PageObject {

    @FindBy(css = "p:first-child")
    private WebElementFacade helloMessage;
    @FindBy (css="a[title^='My Account'] ")
    private WebElementFacade myaccountButton;
    @FindBy (css="li a[href*='my-account/orders']")
    private WebElementFacade ordersButton;
    @FindBy (css="a.woocommerce-button.button.view")
    private WebElementFacade viewOrderButton;
    @FindBy (css=".order-status")
    private WebElementFacade checkOrderButton;
    public void checkLoggedIn(String Username) {
        helloMessage.shouldContainText("Hello " + Username);
    }
    public void myaccountButton(){
        clickOn(myaccountButton);
    }
    public void ordersButton(){
        clickOn(ordersButton);
    }
    public void viewOrderButton(){
        clickOn(viewOrderButton);
    }
    public void setCheckOrderButton(){checkOrderButton.shouldContainText("On hold");
    }
}
