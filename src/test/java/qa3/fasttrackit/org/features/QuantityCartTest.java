package qa3.fasttrackit.org.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import qa3.fasttrackit.org.steps.QuantityCartSteps;

@RunWith(SerenityRunner.class)

public class QuantityCartTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;
    @Steps
    QuantityCartSteps quantityCartSteps;

    @Test
    public void changequantityfromcart() {
        quantityCartSteps.navigateToHomepage();
        quantityCartSteps.gotoquantitybutton("3");
        quantityCartSteps.checkupdatecart();
    }
    @Test
    public void negativequantity(){
        quantityCartSteps.navigateToHomepage();
        quantityCartSteps.gotoquantitybutton("-4");
        quantityCartSteps.checknegativequantitymessage();
    }
    @Test
    public void notnumericquantity() {

        quantityCartSteps.navigateToHomepage();
        quantityCartSteps.gotoquantitybutton("abc");
        quantityCartSteps.checknotnumericquantitymessage();
    }
    @Test
    public void speicalcharacters (){
        quantityCartSteps.navigateToHomepage();
        quantityCartSteps.gotoquantitybutton("@!");
        quantityCartSteps.checknotnumericquantitymessage();
    }
}



