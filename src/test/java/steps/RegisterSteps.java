package steps;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
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

    @Given("^user enter contact information as (.*), (.*), (.*) and (.*)$")
    public void userEnterFirstNameLastNamePhoneAndEmail(String firstName, String lastName, String phone, String email) throws Throwable {
        String[] contact = {firstName, lastName, phone, email};
        regPage.addContactInformation(contact);

    }

    @And("^user introduce mailing info (.*), (.*), (.*), (.*) and select his (.*)$")
    public void userEnterAddressCityStatePostalCodeAndSelectHisCountry(String address, String city, String state, String postalCode, String country) throws Throwable {
        String[] mailing = {address, city, state, postalCode, country};
        regPage.addMailingInformation(mailing);
    }

    @And("^user create his login credentials as (.*), (.*), and user confirm his (.*)$")
    public void userCreateHisLoginCredentialsAsUserNamePasswordAndUserConfirmHisPassword(String userName, String password, String confirm) throws Throwable {
        String[] userInfo = {userName, password, confirm};
        regPage.addUserInformation(userInfo);
    }

    @When("^user click on submit button$")
    public void userClickOnSubmitButton(){
        regPage.clickOnSubmit();
    }

    @Then("^Application must direct the user to register web page and displays the (.*)")
    public void ApplicationMustDirectTheUserToRegisterWebPageAndDisplaysTheUserName(String userName) throws Exception{
        System.out.println(regPage.getUserNameRegistered());
        Assert.assertTrue(regPage.getUserNameRegistered().contains(userName));
    }

    @After
    public void tearDown(){
        regPage.getDriver().quit();
    }
}
