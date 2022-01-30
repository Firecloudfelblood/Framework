package com.vidsys.driver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class IEDriverManager extends  DriverManager{
    //working with IE as required eventually expanding to chrome
    @Override
    public void createWebDriver(){
        InternetExplorerOptions options = new InternetExplorerOptions();
        this.driver = new InternetExplorerDriver(options);
    }
}
