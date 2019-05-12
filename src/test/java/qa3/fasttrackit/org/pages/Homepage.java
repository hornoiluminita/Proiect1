package qa3.fasttrackit.org.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/")
public class Homepage extends PageObject {

    @FindBy(css = "a[title='My Account']")
    private WebElementFacade myAccountButton;

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade loginLink;

    public void clickMyAccount(){
        clickOn(myAccountButton);
    }

    public void clickLoginLink(){
        clickOn(loginLink);
    }

}
