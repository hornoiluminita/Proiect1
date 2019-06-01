package qa3.fasttrackit.org.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import qa3.fasttrackit.org.steps.CartSteps;

@RunWith(SerenityRunner.class)

public class CartTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;
    @Steps
    CartSteps cartSteps;

    @Test
    public void addproducttocart() {
        cartSteps.navigateToHomepage();
        cartSteps.goToCartpage();

    }

    @Test
    public void removeproductfromcart() {
        cartSteps.navigateToHomepage();
        cartSteps.removeproductfromcart();
    }

}



