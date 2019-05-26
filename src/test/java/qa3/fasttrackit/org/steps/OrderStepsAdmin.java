package qa3.fasttrackit.org.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import qa3.fasttrackit.org.pages.Homepage;
import qa3.fasttrackit.org.pages.LoginPage;
import qa3.fasttrackit.org.pages.OrdersAdminPage;

public class OrderStepsAdmin {
    Homepage homepage;
    LoginPage loginPage;
    OrdersAdminPage ordersAdminPage;
    @Step
    public void navigateToHomepage(){
        homepage.open();
    }
    @Step
    public void changeStatusOrder (){
     ordersAdminPage.clickfastTrackITButton();
     ordersAdminPage.clickwooCommerceButton();
     ordersAdminPage.clickselectOrderButton();
     ordersAdminPage.clickbulkActionsButton();
     ordersAdminPage.clickstatusOnHoldButton();
     ordersAdminPage.clickapplyButton();
     ordersAdminPage.checkchangedStatusButton();

    }
    @Step
    public void searchCustomer (){
        ordersAdminPage.clickfastTrackITButton();
        ordersAdminPage.clickwooCommerceButton();
        ordersAdminPage.clicksearhCustomerButton();
        ordersAdminPage.clicksearchFieldButton("lumy");
        ordersAdminPage.clickcustomerNameButton();
        ordersAdminPage.clickfilterButton();
    }
}
