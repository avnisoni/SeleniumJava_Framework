package com.utils.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseClass {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
//    String createAccount ="(.//a[text()='Create an Account'])[1]";
//    String firstName =".//input[@id='firstname']";
//    String lastName =".//input[@id='lastname']";
//    String emailAddress =".//input[@id='email_address']";
//    String password =".//input[@id='password']";
//    String passwordConfirm =".//input[@id='password-confirmation']";
//    String createAccountButton =".//span[contains(text(),'Create an Account')]";

    public By getCreateAccount_ButtonHomePage() { return By.xpath("(.//a[text()='Create an Account'])[1]");}
    public By getFirstName_TextBox() { return By.xpath(".//input[@id='firstname']");}
    public By getLastName_TextBox() { return By.xpath(".//input[@id='lastname']");}
    public By getEmailAddressAtCreateAccount_TextBox() { return By.xpath(".//input[@id='email_address']");}
    public By getPasswordAtCreateAccount_TextBox() {return By.xpath(".//input[@id='password']");}
    public By getPasswordConfirm_TextBox() {return By.xpath(".//input[@id='password-confirmation']");}
    public By getCreateAccount_Button () {return By.xpath(".//span[contains(text(),'Create an Account')]");}
    public By getSuccessfulAccountCreation_Text () {return By.xpath(".//div[text()='Thank you for registering with Main Website Store.']");}
    public By getAccountHeader_Text() {return By.xpath(".//span[text()='My Account']");}
    public By getOptions_Dropdown() {return By.xpath(".//button[@class='action switch']");}
    public By getSignOutUnderOptions() {return By.xpath(".//a[contains(text(),'Sign Out ')]");}
    public By getSignIn_ButtonHomePage() { return By.xpath(".//a[contains(text(),'Sign In')]");}
    public By getCustomerLoginHeader_Text() {return By.xpath(".//span[text()='Customer Login']");}
    public By getPasswordAtSignin_TextBox() {return By.xpath(".//input[@id='pass']");}
    public By getEmailAddressAtSignin_TextBox() {return By.xpath(".//input[@id='email']");}
    public By getSignIn_Button () {return By.xpath(".//span[contains(text(),'Sign In')]");}
    public By getMyAccountUnderOptions() {return By.xpath(".//a[contains(text(),'My Account')]");}
    public By getErrorMesgForExistingAccount() {return By.xpath(".//div[contains(text(),'There is already an account with this email address.')]");}
    @Override
    public WebDriver getDriver(){return this.driver;}
}
