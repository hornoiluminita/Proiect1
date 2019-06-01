package qa3.fasttrackit.org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa3.fasttrackit.org:8008/")
public class LoginPage extends PageObject {

    @FindBy(css = "h1 a[href*='fasttrackit']")
    private WebElementFacade signin;
    @FindBy(id = "username")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passField;

    @FindBy(css = "button[name='login']")
    private WebElementFacade loginButton;

    @FindBy(css = ".woocommerce-error li")
    private WebElementFacade errorMessageIncorrectPassword;
    @FindBy(css = "div strong")
    private WebElementFacade errorMessageIncorrectEmail;
    @FindBy(css = "li a[href*='my-account/customer-logout']")
    private WebElementFacade logoutButton;

    public void setEmailField(String email) {
        typeInto(emailField, email);
    }

    public void setPassField(String pass) {
        typeInto(passField, pass);
    }


    public void checkErrorMessageIncorrectPassword() {
        errorMessageIncorrectPassword.shouldContainText("ERROR: The password you entered for the email address lllumy@yahoo.co.uk is incorrect. Lost your password?");
    }

    public void checkErrorMessageIncorrectEmail() {
        errorMessageIncorrectEmail.shouldContainText("ERROR");
    }

    public void checkUserIsOnLoginPage() {
        element(loginButton).shouldBeVisible();
    }

    public void clicklogOutButton() {
        clickOn(logoutButton);
    }

}
