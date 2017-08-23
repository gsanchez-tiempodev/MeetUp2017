package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.RegisterPage;

/**
 * Created by gilsa on 17/08/2017.
 */
public class RegisterSteps{

    RegisterPage regPage = new RegisterPage();

    @Given("^user must be on demo aut web application$")
    public void userMustBeOnDemoAutWebApplication() throws Throwable {
        regPage.getDriver().get("http://newtours.demoaut.com/");
        regPage.clickRegister();
    }

    @Given("^user enter (.*), (.*), (.*) and (.*)$")
    public void userEnterFirstNameLastNamePhoneAndEmail(String firstName, String lastName, String phone, String email) throws Throwable {
        String[] contact = {firstName, lastName, phone, email};
        regPage.addContactInformation(contact);

    }

    @And("^user enter ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*) and select his ([^\"]*)$")
    public void userEnterAddressCityStatePostalCodeAndSelectHisCountry(String address, String city, String state, String postalCode, String country) throws Throwable {
        String[] mailling = {address, city, state, postalCode, country};
        regPage.addMailingInformation(mailling);
    }

    @And("^user enter his \"([^\"]*)\", \"([^\"]*)\", and user confirm his (.*)$")
    public void userEnterHisUserNamePasswordAndUserConfirmHisPassword(String userName, String password, String confirm) throws Throwable {
        String[] userInfo = {userName, password, confirm};
        regPage.addUserInformation(userInfo);
    }

    @When("^user click on submit button$")
    public void userClickOnSubmitButton(){
        regPage.clickOnSubmit();
    }

    @Then("^Application must direct the user to register web page and displays the user name$")
    public void ApplicationMustDirectTheUserToRegisterWebPageAndDisplaysTheUserName(){

    }
}
