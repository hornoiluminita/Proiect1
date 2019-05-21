package qa3.fasttrackit.org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/")

public class BlogPage extends PageObject {
    @FindBy (css="div ul a[href*='blog']")
    private WebElementFacade blogButton;
    @FindBy (css="p #comment")
    private  WebElementFacade commentField;
    @FindBy (css=".submit" )
    private WebElementFacade postCommentButton;
    @FindBy (css="#content #comment-573 .comment-awaiting-moderation")
    private WebElementFacade messageField;

  public void clickblogButton (){ clickOn(blogButton);}
  public void setCommentField(String comment){typeInto(commentField,comment);}
  public void clickpostCommentButton(){clickOn(postCommentButton);}
  public void setMessageField(){messageField.shouldContainText("Your comment is awaiting moderation.");}
}
