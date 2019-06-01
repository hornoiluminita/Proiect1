package qa3.fasttrackit.org.steps;

import net.thucydides.core.annotations.Step;
import qa3.fasttrackit.org.pages.BlogPageAdmin;
import qa3.fasttrackit.org.pages.Homepage;
import qa3.fasttrackit.org.pages.LoginPage;

public class BlogStepsAdmin {
    Homepage homepage;
    LoginPage loginPage;
    BlogPageAdmin blogPageAdmin;

    @Step
    public void navigateToHomepage() {
        homepage.open();
    }

    @Step
    public void removecomment() {
        blogPageAdmin.clickfastTrackITButton();
        blogPageAdmin.clickcommentsButton();
        blogPageAdmin.clickselectcommnetButton();
        blogPageAdmin.clickmoveToTrashButton();
        blogPageAdmin.clickapplyButton();
        sleep(3);

    }

    @Step
    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
