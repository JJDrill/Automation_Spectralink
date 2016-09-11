/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spectralink.Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

/**
 *
 * @author J. Drill
 */
public class Initialize {
    public static WebDriver driver = null;
    public enum Browser_Type {
        CHROME, IE, FIREFOX, EDGE;
    }
    
    public WebDriver Get_Driver(Browser_Type browser_choice){
        
        switch(browser_choice){
            case CHROME:
                System.setProperty("webdriver.chrome.driver",
                "D:\\Documents\\Development\\Selenium\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
                
            case IE:
                System.setProperty("webdriver.ie.driver",
                "D:\\Documents\\Development\\Selenium\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                break;
                
            case EDGE:
                System.setProperty("webdriver.edge.driver",
                "D:\\Documents\\Development\\Selenium\\Edge v14393\\MicrosoftWebDriver.exe");
                driver = new EdgeDriver();
                break;
                
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver",
                "D:\\Documents\\Development\\Selenium\\geckodriver-v0.10.0-win64\\geckodriver.exe");
                FirefoxProfile profile = new FirefoxProfile();
                profile.setEnableNativeEvents(false);
                driver = new FirefoxDriver(profile);
                break;
        }
        
        return driver;
    }
    
    public void Clear_Driver(){
        driver = null;
    }
}
