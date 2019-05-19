package qa3.fasttrackit.org.steps;

import net.thucydides.core.annotations.Step;
import qa3.fasttrackit.org.pages.BlogPage;
import qa3.fasttrackit.org.pages.Homepage;
import qa3.fasttrackit.org.pages.LoginPage;

public class BlogSteps {
    Homepage homepage;
    BlogPage blogPage;

    @Step
    public void navigateToHomepage() {
        homepage.open();
    }

    @Step
    public void gotoblogButton()   {
    blogPage.clickblogButton();
}
    @Step
    public void postcomment(String comment) {
        blogPage.setCommentField(comment);
    }
    @Step
    public void sendcomment() { blogPage.clickpostCommentButton();}
    @Step
    public void checkcomment(String message){
    blogPage.setMessageField(message);
        }

}
