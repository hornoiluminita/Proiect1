package qa3.fasttrackit.org.features;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import qa3.fasttrackit.org.steps.SearchSteps;

@RunWith(SerenityRunner.class)
public class SearchTest{
    @Managed(uniqueSession = true)
    private WebDriver driver;
    @Steps
    SearchSteps searchSteps;
    @Test
    public void searchproduct (){
        searchSteps.navigateToHomepage();
        searchSteps.searchproduct();
        searchSteps.checkproductwasfound();
    }
}
