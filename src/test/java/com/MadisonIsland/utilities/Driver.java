package com.MadisonIsland.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Driver {
    private Driver(){}
    private static InheritableThreadLocal<WebDriver> driverpool= new InheritableThreadLocal<>();

    public static WebDriver get(){
        if (driverpool.get()==null) {
            String browser= System.getProperty("browser")!=null? browser= System.getProperty("browser"): ConfigurationReader.get("browser");
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverpool.set(new ChromeDriver());
                    break;
                default:
                    break;
            }
        }
        return driverpool.get();
    }
    public static void closeDriver(){
        driverpool.get().close();;
        driverpool.remove();
    }
}
