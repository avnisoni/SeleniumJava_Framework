package com.steps;

import com.utils.settings.TextContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class LoginSteps extends BaseClass{
    private Scenario scenario;
    WebDriver driver;
    public LoginSteps(TextContext context) throws Exception {
        super(context);
    }
    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("^User creates an account$")
    public void userCreatesAnAccount(DataTable dataTable)throws Throwable {
        List<Map<String,String>> rows = dataTable.asMaps(String.class, String.class);
        String name = rows.get(0).get("Name");
        String email = rows.get(0).get("Email");

        genericHelper.click(loginPage.getSignInOrLoginLink());
        Thread.sleep(2000);
        genericHelper.sendKeys(loginPage.getName_TextBox(), name);
        genericHelper.sendKeys(loginPage.getEmailAddressAtSignIn(), email);
        Thread.sleep(2000);
        genericHelper.click(loginPage.getSignUpButton());

        System.out.println("You have successfully landed to Enter Account Information Page");
    }

    @Then("User verifies that account is successfully created")
    public void userVerifiesThatAccountIsSuccessfullyCreated() throws Throwable {
        Thread.sleep(3000);
        Assert.assertEquals(genericHelper.getText(loginPage.getSuccessfulAccountCreation_Text()),"Thank you for registering with Main Website Store.");
        userVerifiesAccountDetails();
    }

    @And("User logs out from the application")
    public void userLogsOutFromTheApplication() throws Throwable {
        Thread.sleep(3000);
        genericHelper.click(loginPage.getOptions_Dropdown());
        Thread.sleep(1000);
        genericHelper.click(loginPage.getSignOutUnderOptions());
    }

    @When("User signin to magento account")
    public void userSigninToMagentoAccount(DataTable dataTable) throws Throwable {
        List<Map<String,String>> rows = dataTable.asMaps(String.class, String.class);

        String email = rows.get(0).get("Email");
        String password = rows.get(0).get("Password");

        genericHelper.click(loginPage.getSignIn_ButtonHomePage());
        Thread.sleep(2000);
        Assert.assertEquals(genericHelper.getText(loginPage.getCustomerLoginHeader_Text()),"Customer Login");
        Thread.sleep(1000);
        genericHelper.sendKeys(loginPage.getEmailAddressAtSignin_TextBox(), email);
        genericHelper.sendKeys(loginPage.getPasswordAtSignin_TextBox(), password);

//        genericHelper.click(loginPage.getSignIn_Button());
        Thread.sleep(2000);
    }

    @Then("User verifies account details")
    public void userVerifiesAccountDetails() throws Throwable {
        Thread.sleep(3000);
        genericHelper.click(loginPage.getOptions_Dropdown());
        genericHelper.click(loginPage.getMyAccountUnderOptions());
        Thread.sleep(1000);
        Assert.assertEquals(genericHelper.getText(loginPage.getAccountHeader_Text()),"My Account");
    }

    @Then("User verifies account creation failure")
    public void userVerifiesAccountCreationFailure() throws Throwable {
     String errorMesg = genericHelper.getText(loginPage.getErrorMesgForExistingAccount());
     if(!errorMesg.contains("There is already an account with this email address.")){
         Assert.fail("Error message not found or did not match the expected error message.");
     }else System.out.println("Error messsage matched");
    }
}
