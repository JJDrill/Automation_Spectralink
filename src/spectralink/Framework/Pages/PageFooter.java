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
 * @author jjdri
 */
public class PageFooter {
    //Footer Elements
    private final String pe_Footer_ContactUs = "//*[@id=\"block-block-8\"]/div[1]/h3";
    private final String pe_Footer_QuickLinks = "//*[@id=\"block-menu-menu-quick-links-footer\"]/div[1]/h3";
    private final String pe_Footer_FollowUs = "//*[@id=\"block-block-7\"]/div[1]/h3";
    private final String pe_Footer_Copywrite = "//*[@id=\"block-progressive-cms-footer-copyright\"]/div/div/div[1]";
    
    public void Verify_Page_Load(){
        driver.findElement(By.xpath(pe_Footer_ContactUs));
        driver.findElement(By.xpath(pe_Footer_QuickLinks));
        driver.findElement(By.xpath(pe_Footer_FollowUs));
        driver.findElement(By.xpath(pe_Footer_Copywrite));
    }
}
