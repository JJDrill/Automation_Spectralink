/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spectralink.Framework.Pages.Services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static spectralink.Framework.Initialize.driver;
import spectralink.Framework.Pages.Util.iPage;

/**
 *
 * @author J. Drill
 */
public class WorkSmart implements iPage {
    private final String page_title = "WorkSmart Services for Unified Communications | Spectralink";
    private final String menuServices = "//*[@id=\"block-progressive-cms-menu\"]/div/header/div/div/div/div[2]/div/div/div/nav/ul/li[3]/a";
    private final String menuWorkSmart = "//*[@id=\"tb-megamenu-column-5\"]/ul/li[1]/a";
    private final String page_Load_Check = "//*[@id=\"block-system-main\"]/div/div/div[2]/h3";
    
    @Override
    public void GoTo(){
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath(menuServices));
        action.moveToElement(we).build().perform();
        driver.findElement(By.xpath(menuWorkSmart)).click();
        WebDriverWait _wait = new WebDriverWait(driver, 10);
        _wait.until( ExpectedConditions.elementToBeClickable(By.xpath(page_Load_Check)) );
    }
    
    @Override
    public void Validate_Page_Load(){
        assert(page_title.equals(driver.getTitle()));
    }
}
