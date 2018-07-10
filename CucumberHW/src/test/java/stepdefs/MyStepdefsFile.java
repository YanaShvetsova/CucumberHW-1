package stepdefs;

import Pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.sql.Driver;

import static org.testng.Assert.assertEquals;


public class MyStepdefsFile {
    HomePage homePage;
    WebDriver driver;


    @Before
    public void init() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yana Shvetsova\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }

    @Given("^user navigates to the app url$")
    public void userNavigatesToTheAppUrl() {
        driver.get("http://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }

    @When("^user fills first name with value \"([^\"]*)\"$")
    public void userFillsFirstNameWithValue(String firstName) {
        homePage.setFirstName(firstName);
    }

    @When("^User fills last name with value \"([^\"]*)\"$")
    public void userFillsLastNameWithValue(String lastName) {
        homePage.setLastName(lastName);
    }

    @When("^User fills Gender \"([^\"]*)\"$")
    public void userFillsGender(String gender) {
        homePage.setGender(gender);
    }

    @And("^User fills Date of birth \"([^\"]*)\"$")
    public void userFillsDateOfBirth(String dob) {
        homePage.setDob(dob);
    }

    @And("^User fills Address \"([^\"]*)\"$")
    public void userFillsAddress(String address) {
        homePage.setAddress(address);
    }

    @And("^User fills Email \"([^\"]*)\"$")
    public void userFillsEmail(String email) {
        homePage.setEmail(email);
    }

    @And("^User fills Password \"([^\"]*)\"$")
    public void userFillsPassword(String password) {
        homePage.setPassword(password);
    }


    @And("^User fills Company \"([^\"]*)\"$")
    public void userFillsCompany(String company) {
        homePage.setCompany(company);
    }

    @And("^User fills Role \"([^\"]*)\"$")
    public void userFillsRole(String role) {
        homePage.setRole(role);
    }


    @And("^User select Job expectation \"([^\"]*)\"$")
    public void userSelectJobExpectation(String expectation) {
        homePage.setExpectation(expectation);
    }


    @And("^User fills Comment \"([^\"]*)\"$")
    public void userFillsComment(String comment) {
        homePage.setComment(comment);
    }

    @And("^User click button \"([^\"]*)\"$")
    public void userClickButton(String submit) {
        homePage.setSubmit(submit);
    }


    @Then("^form is submitted$")
    public void formIsSubmitted() {
        Assert.assertEquals(homePage.submitMessage.getText(), "Successfully submitted!");
    }

}



