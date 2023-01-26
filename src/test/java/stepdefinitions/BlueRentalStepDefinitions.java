package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BlueRentalPage;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class BlueRentalStepDefinitions {
    BlueRentalPage blueRentalPage = new BlueRentalPage();

    @Given("user goes  on {string}")
    public void user_goes_on(String url) {
        Driver.getDriver().get(url);

    }
    @Then("user navigates to login page")
    public void user_navigates_to_login_page() {
        blueRentalPage.loginIcon.click();
    }
    @Then("enters username : {string}")
    public void enters_username(String username) {
        blueRentalPage.emailInput.sendKeys(username);
    }
    @Then("enters password : {string}")
    public void enters_password(String password) {
        blueRentalPage.passwordInput.sendKeys(password);
    }
    @Then("click on login button")
    public void click_on_login_button() {
        blueRentalPage.loginButton.click();
    }
    @Then("verify the login is successful")
    public void verify_the_login_is_successful() {
                assertTrue(blueRentalPage.userIcon.isDisplayed());
    }
    @Then("user closes the browser")
    public void user_closes_the_browser() {
        Driver.closeDriver();
    }

}
