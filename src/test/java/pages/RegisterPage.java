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

    public void clickRegister() throws Exception {
        highlight(lnkRegister);
        lnkRegister.click();
    }

    @FindBy(name="firstName")
    WebElement txtFirstName;

    private void setFirstName(String firstName) throws Exception {
        highlight(txtFirstName);
        txtFirstName.sendKeys(firstName);
    }

    @FindBy(name="lastName")
    WebElement txtLastName;

    private void setLastName(String lastName) throws Exception {
        highlight(txtLastName);
        txtLastName.sendKeys(lastName);
    }

    @FindBy(name="phone")
    WebElement txtPhone;

    private void setPhoneNumber(String phone) throws Exception {
        highlight(txtPhone);
        txtPhone.sendKeys(phone);
    }

    @FindBy(name="userName")
    WebElement txtEmail;

    private void setEmail(String email) throws Exception {
        highlight(txtEmail);
        txtEmail.sendKeys(email);
    }

    @FindBy(name="address1")
    WebElement txtAddress;

    private void setAddress(String address1) throws Exception {
        highlight(txtAddress);
        txtAddress.sendKeys(address1);
    }

    @FindBy(name="city")
    WebElement txtCity;

    private void setCity(String city) throws Exception {
        highlight(txtCity);
        txtCity.sendKeys(city);
    }

    @FindBy(name="state")
    WebElement txtState;

    private void setState(String state) throws Exception {
        highlight(txtState);
        txtState.sendKeys(state);
    }

    @FindBy(name="postalCode")
    WebElement txtPostalCode;

    private void setPostalCode(String postalCode) throws Exception {
        highlight(txtPostalCode);
        txtPostalCode.sendKeys(postalCode);
    }

    @FindBy(name="country")
    WebElement ddlCountry;

    private void selectCountry(String country) throws Exception {
        highlight(ddlCountry);
        new Select(ddlCountry).selectByVisibleText(country);
    }

    @FindBy(name="email")
    WebElement txtUserName;

    private void setUserName(String userName) throws Exception {
        highlight(txtUserName);
        txtUserName.sendKeys(userName);
    }

    @FindBy(name="password")
    WebElement txtPassword;

    private void setPassword(String password) throws Exception {
        highlight(txtPassword);
        txtPassword.sendKeys(password);
    }

    @FindBy(name="confirmPassword")
    WebElement txtConfirmPassword;

    private void setConfirmPass(String confirmPassword) throws Exception {
        highlight(txtConfirmPassword);
        txtConfirmPassword.sendKeys(confirmPassword);
    }

    public void clickOnSubmit(){
        txtConfirmPassword.submit();
    }

    @FindBy(xpath = "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")
    WebElement lblRegister;

    public String getUserNameRegistered() throws Exception {
        highlight(lblRegister);
        return lblRegister.getText();
    }

    public RegisterPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void addContactInformation(String ... contact) throws Exception{
        this.setFirstName(contact[0]);
        this.setLastName(contact[1]);
        this.setPhoneNumber(contact[2]);
        this.setEmail(contact[3]);
    }

    public void addMailingInformation(String ... mailing) throws Exception{
        this.setAddress(mailing[0]);
        this.setCity(mailing[1]);
        this.setState(mailing[2]);
        this.setPostalCode(mailing[3]);
        this.selectCountry(mailing[4]);
    }

    public void addUserInformation(String ... user) throws Exception{
        this.setUserName(user[0]);
        this.setPassword(user[1]);
        this.setConfirmPass(user[1]);
    }
}