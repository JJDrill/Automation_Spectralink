/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spectralink.Framework.Pages.Company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static spectralink.Framework.Initialize.driver;
import spectralink.Framework.Pages.Util.*;

/**
 *
 * @author J. Drill
 */
public class Events implements iPage {
    private final String page_title = "Events | Spectralink";
    private final String menu_Company = "//*[@id=\"block-progressive-cms-menu\"]/div/header/div/div/div/div[2]/div/div/div/nav/ul/li[1]/a";
    private final String menu_Company_Events = "//*[@id=\"tb-megamenu-column-1\"]/ul/li[7]/a";
    private final String page_Load_Check = "//*[@id=\"block-system-main\"]/div/div/div[5]";
    
    @Override
    public void GoTo(){
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath(menu_Company));
        action.moveToElement(we).build().perform();
        driver.findElement(By.xpath(menu_Company_Events)).click();
        WebDriverWait _wait = new WebDriverWait(driver, 10);
        _wait.until( ExpectedConditions.elementToBeClickable(By.xpath(page_Load_Check)) );
    }
    
    @Override
    public void Validate_Page_Load(){
        assert(page_title.equals(driver.getTitle()));
    }
}
