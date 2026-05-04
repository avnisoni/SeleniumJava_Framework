package com.utils.settings;

import com.incubyte.helper.GenericHelper;
import com.incubyte.pageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TextContext {

    private WebDriver driver;
    private LoginPage loginPage;
    private GenericHelper genericHelper;

    public TextContext() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://magento.softwaretestingboard.com");
        System.out.println("------------------"+driver.getTitle());
        driver.manage().window().maximize();
//        driver = new ChromeDriver();
        loginPage=new LoginPage(driver);
        genericHelper=new GenericHelper(driver);
    }

    public WebDriver getWebDriverManager() {return driver;}
    public LoginPage getLoginPage() { return loginPage;}
    public GenericHelper getGenericHelper() { return genericHelper;}
}
