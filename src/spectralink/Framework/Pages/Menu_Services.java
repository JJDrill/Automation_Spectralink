/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spectralink.Framework.Pages;

import spectralink.Framework.Pages.Services.*;
import spectralink.Framework.Pages.Util.iPage;

/**
 *
 * @author J. Drill
 */
public class Menu_Services {
    public enum MenuItems_Services {
        WorkSmart, Professional, Design, Deploy, Maintain;
    }
    
    public iPage Load_Page(MenuItems_Services selected){
        iPage rtnObj = null;
        
        if (MenuItems_Services.WorkSmart == selected) {
            rtnObj = new WorkSmart();
        } else if (MenuItems_Services.Professional == selected ||
                MenuItems_Services.Design == selected) {
            rtnObj = new Design();
        } else if (MenuItems_Services.Deploy == selected) {
            rtnObj = new Deploy();
        } else if (MenuItems_Services.Maintain == selected) {
            rtnObj = new Maintain();
        }
        
        return rtnObj;
    }
}
