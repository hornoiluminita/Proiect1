package qa3.fasttrackit.org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/")

public class SearchPage  extends PageObject {
    @FindBy(css="a[href*='shop']")
    private WebElementFacade shopButton;
    @FindBy(css=".fa.fa-search.search-btn")
    private WebElementFacade searchButton;
    @FindBy(css="header div form label input.search-field")
    private WebElementFacade searchField;
    @FindBy (css="header .search-submit ")
    private WebElementFacade selectsearchButon;
    public void clickshopButton(){ clickOn(shopButton); }
    public void clicksearchButton (){clickOn(searchButton);}
    public void clicksearchField (String product){typeInto(searchField,product);}
    public void clickselectsearchButon (){clickOn(selectsearchButon);}
}
