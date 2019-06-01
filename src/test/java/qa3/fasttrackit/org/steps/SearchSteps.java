package qa3.fasttrackit.org.steps;

import com.ibm.icu.text.AlphabeticIndex;
import net.thucydides.core.annotations.Step;
import qa3.fasttrackit.org.pages.Homepage;
import qa3.fasttrackit.org.pages.SearchPage;

public class SearchSteps {
    Homepage homepage;
    SearchPage searchPage;

    @Step
    public void navigateToHomepage() {
        homepage.open();
    }

    @Step
    public void searchproduct() {
        searchPage.clickshopButton();
        searchPage.clicksearchButton();
        searchPage.clicksearchField("Belt");
        searchPage.clickselectsearchButon();

    }

    @Step
    public void checkproductwasfound() {
        searchPage.setCheckProductWasFound();

    }
}
