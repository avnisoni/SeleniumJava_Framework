package com.utils.settings;

import com.utils.helper.GenericHelper;
import com.utils.pageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextContext {

    private WebDriver driver;
    private LoginPage loginPage;
    private GenericHelper genericHelper;

    public TextContext() {
//        try {
//            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/driver/chromedriver.exe");
//        }catch(Exception e){
//            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/driver/chromedriver");
//        }

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        driver.get("https://automationexercise.com/");

        System.out.println("Title : "+driver.getTitle());
        driver.manage().window().maximize();

        loginPage=new LoginPage(driver);
        genericHelper=new GenericHelper(driver);
    }

    public WebDriver getWebDriverManager() {return driver;}
    public LoginPage getLoginPage() { return loginPage;}
    public GenericHelper getGenericHelper() { return genericHelper;}
}
