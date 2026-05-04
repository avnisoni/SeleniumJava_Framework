package com.steps;
import com.utils.pageObjects.LoginPage;
import com.utils.helper.GenericHelper;
import com.utils.settings.TextContext;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    public WebDriver driver;
    TextContext textContext;
    LoginPage loginPage;
    GenericHelper genericHelper;

    public BaseClass( TextContext context) {
        textContext = context;
        driver=textContext.getWebDriverManager();
        loginPage=textContext.getLoginPage();
        genericHelper=textContext.getGenericHelper();
    }
}
