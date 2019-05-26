package qa3.fasttrackit.org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa3.fasttrackit.org:8008/")

public class OrdersAdminPage extends PageObject {
    @FindBy (css="#wp-admin-bar-site-name>a")
     private WebElementFacade fastTrackITButton;
    @FindBy (css="#toplevel_page_woocommerce>a>div.wp-menu-name")
    private WebElementFacade wooCommerceButton;
    @FindBy (css="input#cb-select-2582")
    private WebElementFacade selectOrderButton;
    @FindBy (css="#bulk-action-selector-top ")
    private WebElementFacade bulkActionsButton;
    @FindBy (css="#bulk-action-selector-top>option:nth-child(4) ")
    private WebElementFacade statusOnHoldButton;
    @FindBy (css="#doaction")
    private WebElementFacade applyButton;
    @FindBy (css="#post-2582 mark span")
    private WebElementFacade changedStatusButton;
    @FindBy (css=".select2-selection__placeholder")
    private WebElementFacade searchCustomerButton;
    @FindBy (css="input.select2-search__field")
    private WebElementFacade searchFieldButton;
    @FindBy (css=".select2.select2-container.select2-container--default")
    private WebElementFacade customerNameButton;
    @FindBy (css="#post-query-submit")
    private WebElementFacade filterButton;
    public void clickfastTrackITButton (){clickOn(fastTrackITButton);}
    public void clickwooCommerceButton (){clickOn(wooCommerceButton);}
    public void clickselectOrderButton (){clickOn(selectOrderButton);}
    public void clickbulkActionsButton (){clickOn(bulkActionsButton);}
    public void clickstatusOnHoldButton (){clickOn(statusOnHoldButton);}
    public void clickapplyButton(){clickOn(applyButton);}
    public void checkchangedStatusButton(){changedStatusButton.shouldContainText("On hold");}
    public void clicksearhCustomerButton (){clickOn(searchCustomerButton);}
    public void clicksearchFieldButton(String customer){typeInto(searchFieldButton,customer);}
    public void clickcustomerNameButton(){clickOn(customerNameButton);}
    public void clickfilterButton(){clickOn(filterButton);}
}


