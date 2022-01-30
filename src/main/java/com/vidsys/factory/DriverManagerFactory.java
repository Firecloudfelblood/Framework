package com.vidsys.factory;

import com.vidsys.driver.DriverManager;
import com.vidsys.driver.IEDriverManager;
import com.vidsys.utils.DriverType;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManagerFactory {
    public static DriverManager getDriverManager(DriverType type){
        DriverManager driverManager;
        switch(type){
            case IE: driverManager = new IEDriverManager();
                break;
            case EDGE:
            case FIREFOX:
            case CHROME:
            default: driverManager = new IEDriverManager();
            break;
        }
        return driverManager;
    }
}
