package qa3.fasttrackit.org.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa3.fasttrackit.org:8008/")

public class CartpageAdmin extends PageObject {
    @FindBy(css="#wp-admin-bar-site-name>a")
    private WebElementFacade fastTrackITButton;
    @FindBy (css="#menu-posts-product div.wp-menu-name ")
    private WebElementFacade productsButton;
    @FindBy (css="a[href*=\'wp-admin/post-new.php\'].page-title-action")
    private WebElementFacade addNewProductButton;
    @FindBy (id="title")
    private WebElementFacade productnameField;
    @FindBy (id="_regular_price")
    private WebElementFacade regularpriceField;
    @FindBy (id="_sale_price")
    private WebElementFacade salepriceField;
    @FindBy (css="input#publish")
    private WebElementFacade publishButton;
    public void clickfastTrackITButton(){clickOn(fastTrackITButton);}
    public void clickproductsButton(){ clickOn(productsButton); }
    public void clickaddNewProductButton(){clickOn(addNewProductButton);}
    public void setProductname(String productname){typeInto(productnameField, productname);}
    public void setRegularpriceField(String regularprice){typeInto(regularpriceField, regularprice);}
    public void setSaleprice(String saleprice){typeInto(salepriceField, saleprice);}
    public void clickpublishButton(){clickOn(publishButton);}

}
