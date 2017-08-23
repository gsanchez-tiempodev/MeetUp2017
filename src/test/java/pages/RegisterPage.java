package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.BaseClass;

/**
 * Created by gilsa on 17/08/2017.
 */
public class RegisterPage extends BaseClass{

    @FindBy(linkText="REGISTER")
    WebElement lnkRegister;

    public void clickRegister(){
        lnkRegister.click();
    }

    @FindBy(name="firstName")
    WebElement txtFirstName;

    private void setFirstName(String firstName){
        txtFirstName.sendKeys(firstName);
    }

    @FindBy(name="lastName")
    WebElement txtLastName;

    private void setLastName(String lastName){
        txtLastName.sendKeys(lastName);
    }

    @FindBy(name="phone")
    WebElement txtPhone;

    private void setPhoneNumber(String phone){
        txtPhone.sendKeys(phone);
    }

    @FindBy(name="userName")
    WebElement txtEmail;

    private void setEmail(String email){
        txtEmail.sendKeys(email);
    }

    @FindBy(name="address1")
    WebElement txtAddress;

    private void setAddress(String address1){
        txtAddress.sendKeys(address1);
    }

    @FindBy(name="city")
    WebElement txtCity;

    private void setCity(String city){
        txtCity.sendKeys(city);
    }

    @FindBy(name="state")
    WebElement txtState;

    private void setState(String state){
        txtState.sendKeys(state);
    }

    @FindBy(name="postalCode")
    WebElement txtPostalCode;

    private void setPostalCode(String postalCode){
        txtPostalCode.sendKeys(postalCode);
    }

    @FindBy(name="country")
    WebElement ddlCountry;

    private void selectCountry(String country){
        new Select(ddlCountry).selectByVisibleText(country);
    }

    @FindBy(name="email")
    WebElement txtUserName;

    private void setUserName(String userName){
        txtUserName.sendKeys(userName);
    }

    @FindBy(name="password")
    WebElement txtPassword;

    private void setPassword(String password){
        txtPassword.sendKeys(password);
    }

    @FindBy(name="confirmPassword")
    WebElement txtConfirmPassword;

    private void setConfirmPass(String confirmPassword){
        txtConfirmPassword.sendKeys(confirmPassword);
    }

    public void clickOnSubmit(){
        txtConfirmPassword.submit();
    }

    public RegisterPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void addContactInformation(String ... contact){
        this.setFirstName(contact[0]);
        this.setLastName(contact[1]);
        this.setPhoneNumber(contact[2]);
        this.setEmail(contact[3]);
    }

    public void addMailingInformation(String ... mailing){
        this.setAddress(mailing[0]);
        this.setCity(mailing[1]);
        this.setState(mailing[2]);
        this.setPostalCode(mailing[3]);
        this.selectCountry(mailing[4]);
    }

    public void addUserInformation(String ... user){
        this.setUserName(user[0]);
        this.setPassword(user[1]);
        this.setConfirmPass(user[1]);
    }
}