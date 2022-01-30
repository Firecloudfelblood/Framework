package com.vidsys.driver;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
    protected WebDriver driver;
    protected abstract void createWebDriver();

    //close the webdriver
    public void quitWebDriver(){
        if(driver != null){
            driver.quit();
            driver= null;
        }
    }

    //call the webdriver
    public WebDriver getWebDriver(){
        if(driver == null){
            createWebDriver();
        }
        return driver;
    }
}
