package qa3.fasttrackit.org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/")

public class BlogPageAdmin extends PageObject {
    @FindBy (css="#wp-admin-bar-site-name>a")
    private WebElementFacade fastTrackITButton;
    @FindBy(css="a[href*='edit-comments']>div.wp-menu-name")
    private WebElementFacade commentsButton;
    @FindBy (css="#cb-select-566")
    private WebElementFacade selectcommentButton;
    @FindBy(css="#bulk-action-selector-top")
    private  WebElementFacade bulkActionsButton;
    @FindBy (css="#bulk-action-selector-top")
    private WebElementFacade moveToTrashButton;
    @FindBy (css="#doaction")
    private WebElementFacade applyButton;
    @FindBy (css="#moderated>p")
    private WebElementFacade messageMoveToTrash;
    public void clickfastTrackITButton(){clickOn(fastTrackITButton);}
    public void clickcommentsButton(){clickOn(commentsButton);}
    public void clickselectcommnetButton(){clickOn(selectcommentButton);}
    public void clickbulkActionsButton(){clickOn(bulkActionsButton);}
    public void clickmoveToTrashButton(){clickOn(moveToTrashButton);}
    public void clickapplyButton(){clickOn(applyButton);}
    public void checkmessageMoveToTrash(){messageMoveToTrash.shouldContainText("1 comment moved to the Trash");}
}
