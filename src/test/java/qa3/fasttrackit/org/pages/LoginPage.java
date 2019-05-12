package qa3.fasttrackit.org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa3.fasttrackit.org:8008/")
public class LoginPage extends PageObject {

    @FindBy ( css="h1 a[href*='fasttrackit']")
    private  WebElementFacade signin;
    @FindBy(id = "username")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passField;

    @FindBy(css="button button")
    private WebElementFacade loginButton;

    @FindBy (css=".woocommerce-error li")
    private  WebElementFacade errorMessage;

    public void setEmailField(String email){ typeInto(emailField, email); }

    public void setPassField(String pass){
        typeInto(passField, pass);
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }

    public void checkErrorMessage () {errorMessage.shouldContainText("Invalid username");}

    public void checkUserIsOnLoginPage (){loginButton.shouldBeVisible();}


}
