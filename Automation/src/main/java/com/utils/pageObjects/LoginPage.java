package com.utils.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseClass {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public By getSignInOrLoginLink() { return By.xpath("//a[normalize-space()='Signup / Login']");}
    public By getName_TextBox() { return By.name("name");}
    public By getEmailAddressAtSignIn() { return By.xpath(".//input[@name='email' and @data-qa='signup-email']");}
    public By getEmailAddressAtLogIn() { return By.xpath("//input[@name='email' and @data-qa='login-email']");}


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
    public By getSignUpButton () {return By.xpath(".//button[normalize-space()='Signup']");}
    public By getMyAccountUnderOptions() {return By.xpath(".//a[contains(text(),'My Account')]");}
    public By getErrorMesgForExistingAccount() {return By.xpath(".//div[contains(text(),'There is already an account with this email address.')]");}
    @Override
    public WebDriver getDriver(){return this.driver;}
}
