package steps;

import jline.internal.Log;
import net.thucydides.core.annotations.Step;
import pages.CreateAccountPage;
import pages.ImdbHomePage;
import pages.SignInPage;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateAccountSteps {
    private ImdbHomePage imdbHomePage;
    private SignInPage signInPage;
    private CreateAccountPage createAccountPage;

    @Step
    public void clickOtherSignInOption() {
        imdbHomePage.click_other_sign_in_options();
    }

    @Step
    public void clickCreateNewAccountButton() {
        signInPage.click_create_new_account();
    }

    @Step
    public void enterUserName(String userName) {
        createAccountPage.enter_user_name(userName);
    }

    @Step
    public void enterEmailAddress(String emailAddress) {
        createAccountPage.enter_email_address(emailAddress);
    }

    @Step
    public void enterPassword(String password) {
        createAccountPage.enter_password(password);
    }

    @Step
    public void reEnterPassword(String password) {
        createAccountPage.re_enter_password(password);
    }

    @Step
    public void clickCreateYourAccountButton()
    {
        createAccountPage.click_create_imdb_account_button();
    }
    @Step
    public void verifyUserLoggedIn(String userName)
    {
        assertThat(imdbHomePage.read_logged_in_user_name()).isEqualToIgnoringCase(userName);
    }

    @Step
    public void logOutOfApplication()
    {
        imdbHomePage.log_out_of_application();
    }
}
