/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spectralink.Framework.Pages.Products;

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
public class S7000_Handsets implements iPage {
    private final String page_title = "DECT Handsets Reliable, Secure Wireless Phones | Spectralink";
    private final String menuProducts = "//*[@id=\"block-progressive-cms-menu\"]/div/header/div/div/div/div[2]/div/div/div/nav/ul/li[2]/a";
    private final String menuS7000Handsets = "//*[@id=\"tb-megamenu-column-3\"]/ul/li[5]/a";
    private final String page_Load_Check = "//*[@id=\"block-system-main\"]/div/div/div[2]/p[3]";
    
    @Override
    public void GoTo(){
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath(menuProducts));
        action.moveToElement(we).build().perform();
        driver.findElement(By.xpath(menuS7000Handsets)).click();
        WebDriverWait _wait = new WebDriverWait(driver, 10);
        _wait.until( ExpectedConditions.elementToBeClickable(By.xpath(page_Load_Check)) );
    }
    
    @Override
    public void Validate_Page_Load(){
        assert(page_title.equals(driver.getTitle()));
    }
}
