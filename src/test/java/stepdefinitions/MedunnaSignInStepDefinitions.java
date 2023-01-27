package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MedunnaHomePage;
import pages.MedunnaLoginPage;
import utilities.ReusableMethods;

public class MedunnaSignInStepDefinitions {

MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
MedunnaLoginPage medunnaLoginPage = new MedunnaLoginPage();
    @When("click on user icon")
    public void click_on_user_icon() {
        ReusableMethods.waitFor(1);
    medunnaHomePage.userIcon.click();
    }
    @Then("click on Sign In option")
    public void click_on_sign_in_option() {

        medunnaHomePage.signInOption.click();
    }
    @Then("enter {string} in Username input")
    public void enter_in_username_input(String username) {

        medunnaLoginPage.usernameInput.sendKeys(username);
    }
    @Then("enter {string} in Password input")
    public void enter_in_password_input(String password) {
    medunnaLoginPage.passwordInput.sendKeys(password);
    }
    @Then("click on Remember me checkbox")
    public void click_on_remember_me_checkbox() {

        medunnaLoginPage.rememberMeCheckbox.click();

    }
    @Then("click on Sign In button")
    public void click_on_sign_in_button() {

        medunnaLoginPage.signInSubmitButton.click();

    }








}
