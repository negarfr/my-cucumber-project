package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DataTablesPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;


public class DataTablesStepDefinitions {

    DataTablesPage dataTablesPage = new DataTablesPage();

    @Given("user is on {string} page")
    public void user_is_on_page(String url) { // url coming from Test case we wrote in scenario_outline2

        Driver.getDriver().get(url);

    }
    @When("user clicks on New button")
    public void user_clicks_on_new_button() {

        ReusableMethods.waitFor(1); // put wait to see what is happening
        dataTablesPage.newButton.click();

    }
    @When("user enters the first name in {string} input")
    public void user_enters_the_first_name_in_input(String firstname) {

        dataTablesPage.firstName.sendKeys(firstname);

    }
    @When("user enters the last name in {string} input")
    public void user_enters_the_last_name_in_input(String lastname) {

        dataTablesPage.lastName.sendKeys(lastname);
    }
    @When("user enters the position in {string} input")
    public void user_enters_the_position_in_input(String position) {

        dataTablesPage.position.sendKeys(position);

    }
    @When("user enters the office in {string} input")
    public void user_enters_the_office_in_input(String office) {

        dataTablesPage.office.sendKeys(office);
    }
    @When("user enters the extension in {string} input")
    public void user_enters_the_extension_in_input(String extension) {
            dataTablesPage.extension.sendKeys(extension);
    }
    @When("user enters the start date in {string} input")
    public void user_enters_the_start_date_in_input(String date) {
        dataTablesPage.startDate.sendKeys(date);

    }
    @When("user enters the salary in {string} input")
    public void user_enters_the_salary_in_input(String salary) {

        dataTablesPage.salary.sendKeys(salary);

    }
    @When("user clicks on create button")
    public void user_clicks_on_create_button() {

        dataTablesPage.createButton.click();

    }
    @When("user search for the first name {string}")
    public void user_search_for_the_first_name(String firstname) {

        dataTablesPage.searchBox.sendKeys(firstname);

    }
    @Then("verify the name field contains the {string}")
    public void verify_the_name_field_contains_the(String firstname) {

        assertTrue(dataTablesPage.nameColumn.get(0).getText().contains(firstname));

    }




}
