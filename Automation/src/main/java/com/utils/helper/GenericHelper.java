package com.utils.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericHelper {
    private WebDriver driver;
    public GenericHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By locator) throws Throwable{
        WebElement element=null;
        try {
            element = driver.findElement(locator);
            element.click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void sendKeys(By locator, String value) throws Throwable{
        try{
            driver.findElement(locator).sendKeys(value);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public String getText(By locator) throws Throwable{
        return driver.findElement(locator).getText();
    }
}
