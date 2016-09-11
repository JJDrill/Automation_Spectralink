/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spectralink;

import spectralink.Framework.*;
import spectralink.Framework.Initialize.Browser_Type;
import org.openqa.selenium.*;

/**
 *
 * @author J. Drill
 */
public class TestCases {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Initialize fw = new Initialize();
        WebDriver driver = null;
        
        driver = fw.Get_Driver(Browser_Type.CHROME);
        Browser.Window_Maximize(driver);
        Browser.Set_Implicit_Wait(driver);
        Browser.Set_Page_Timeout(driver);
        TestCaseSuites.Full_Regression();
        driver.close();
        fw.Clear_Driver();
        
        driver = fw.Get_Driver(Browser_Type.EDGE);
        Browser.Window_Maximize(driver);
        Browser.Set_Implicit_Wait(driver);
        Browser.Set_Page_Timeout(driver);
        TestCaseSuites.Full_Regression();
        driver.close();
        fw.Clear_Driver();
    }
}
