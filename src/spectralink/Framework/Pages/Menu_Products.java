/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spectralink.Framework.Pages;

import spectralink.Framework.Pages.Products.*;
import spectralink.Framework.Pages.Util.iPage;

/**
 *
 * @author J. Drill
 */
public class Menu_Products {
    public enum MenuItems_Products {
        MakingWorksmartPossible, HistoryOfInnovation,
        S7000, S7000_Cost, S7000_Handsets, S7000_Infrastructure, S7000_Integration,
        S8000, S8000_VOIP, S8000_Handsets, S8000_Infrastructure, S8000_Interoperability;
    }
    
    public iPage Load_Page(MenuItems_Products selected){
        iPage rtnObj = null;
        
        if (MenuItems_Products.MakingWorksmartPossible == selected) {
            rtnObj = new MakingWorksmartPossible();
        } else if (MenuItems_Products.HistoryOfInnovation == selected) {
            rtnObj = new HistoryOfInnovation();
        } else if (MenuItems_Products.S7000 == selected ||
                MenuItems_Products.S7000_Cost == selected) {
            rtnObj = new S7000_Cost();
        } else if (MenuItems_Products.S7000_Handsets == selected) {
            rtnObj = new S7000_Handsets();
        } else if (MenuItems_Products.S7000_Infrastructure == selected) {
            rtnObj = new S7000_Infrastructure();
        } else if (MenuItems_Products.S7000_Integration == selected) {
            rtnObj = new S7000_Integration();
        } else if (MenuItems_Products.S8000 == selected ||
                MenuItems_Products.S8000_VOIP == selected) {
            rtnObj = new S8000_VOIP();
        } else if (MenuItems_Products.S8000_Handsets == selected) {
            rtnObj = new S8000_Handsets();
        } else if (MenuItems_Products.S8000_Infrastructure == selected) {
            rtnObj = new S8000_Infrastructure();
        } else if (MenuItems_Products.S8000_Interoperability == selected) {
            rtnObj = new S8000_Interoperability();
        } else {
            rtnObj = null;
        }
        
        return rtnObj;
    }
}
