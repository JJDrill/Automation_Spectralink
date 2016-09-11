/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spectralink.Framework.Pages;

import org.openqa.selenium.*;
import static spectralink.Framework.Initialize.driver;

/**
 *
 * @author J. Drill
 */
public class LandingPage {
    //Landing Page Elements
    private final String pe_Landing_AllSystems = "//*[@id=\"block-block-79\"]/div/div/div/div[1]/a";
    private final String pe_Landing_Energize = "//*[@id=\"block-block-91\"]/div/a";
    private final String pe_Landing_Partnering = "//*[@id=\"block-system-main\"]/div/div/div[2]/div/p/img";
    
    public void Landing_Page(){
        driver.get("http://www.spectralink.com/");
        driver.findElement(By.xpath(pe_Landing_AllSystems));
        driver.findElement(By.xpath(pe_Landing_Energize));
        driver.findElement(By.xpath(pe_Landing_Partnering));
    }
}
