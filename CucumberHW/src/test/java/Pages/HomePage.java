package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "firstName")
    private WebElement firstname;


    @FindBy(name = "lastName")
    private WebElement lastName;

    @FindBy(name = "gender")
    private WebElement gender;

    @FindBy(name = "dob")
    private WebElement dob;

    @FindBy(name = "address")
    private WebElement address;

    @FindBy(name = "email")
    private WebElement email;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "company")
    private WebElement company;

    @FindBy(name = "role")
    private WebElement role;

    @FindBy(name = "expectation")
    private WebElement expectation;

    @FindBy(name = "comment")
    private WebElement comment;

    @FindBy(id = "submit")
    private WebElement submit;

    @FindBy(id = "submit-msg")
    public WebElement submitMessage;



    public void setFirstName(String firstName) {
        this.firstname.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName.sendKeys(lastName);
    }

    public void setGender(String gender) {
        this.gender.click();
    }

    public void setDob(String dob) {
        this.dob.sendKeys(dob);
    }

    public void setAddress(String address) {
        this.address.sendKeys(address);
    }

    public void setEmail(String email) {
        this.email.sendKeys(email);
    }
    public void setPassword(String password) {
        this.password.sendKeys(password);
    }

    public void setCompany(String company) {
        this.company.sendKeys(company);
    }

    public void setRole(String role) {
        this.role.click();
    }

    public void setExpectation(String expectation) {
        this.expectation.click();
    }

    public void setComment(String comment) {
        this.comment.sendKeys(comment);
    }

    public void setSubmit(String submit) {
        this.submit.click();
    }

    public void getSubmitMessage() {
        this.submitMessage.getText();
    }
}