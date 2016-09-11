/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spectralink.Framework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;

/**
 *
 * @author J. Drill
 */
public class Browser {
    
    public static void Window_Maximize(WebDriver driver){
        driver.manage().window().maximize();
    }
    
    public static void Window_Set_Phone(WebDriver driver){
        //ToDo
    }
    
    public static void Window_Set_Tablet(WebDriver driver){
        //ToDo
    }
    
    public static void Set_Implicit_Wait(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    
    public static void Set_Page_Timeout(WebDriver driver){
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }
}
