package qa3.fasttrackit.org.steps;

import net.thucydides.core.annotations.Step;
import qa3.fasttrackit.org.pages.Homepage;
import qa3.fasttrackit.org.pages.LoginPage;
import qa3.fasttrackit.org.pages.MyAccountPage;

public class LoginSteps {

    Homepage homepage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    @Step
    public void navigateToHomepage() {
        homepage.open();
    }

    @Step
    public void goToLoginPage() {
        homepage.clickMyAccount();
    }

    @Step
    public void loginUser(String email, String password) {
        loginPage.setEmailField(email);
        loginPage.setPassField(password);
        homepage.clickLoginLink();
    }

    @Step
    public void checkUserIsLoggedIn() {
        myAccountPage.checkLoggedIn("lllumy");
    }

    @Step
    public void checkAdminIsLoggedIn() {
        myAccountPage.checkLoggedIn("admin");
    }

    @Step
    public void checkIncorrectPassword() {
        loginPage.checkErrorMessageIncorrectPassword();
    }

    @Step
    public void checkErrorMessageIncorrectEmail() {
        loginPage.checkErrorMessageIncorrectEmail();
    }

    @Step
    public void userStillOnLoginPage() {
        loginPage.checkUserIsOnLoginPage();
    }

    @Step
    public void logOutUser() {
        loginPage.clicklogOutButton();
    }

}
