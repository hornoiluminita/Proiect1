package qa3.fasttrackit.org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa3.fasttrackit.org:8008/")
public class MyAccountPage extends PageObject {

    @FindBy(css = "div.entry-content p")
    private WebElementFacade helloMessage;


    public void checkLoggedIn(String userName) {
        helloMessage.shouldContainText("Hello, " + userName + "!");
    }
}
