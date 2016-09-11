/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spectralink.Framework.Pages;

import spectralink.Framework.Pages.Company.*;
import spectralink.Framework.Pages.Util.iPage;

/**
 *
 * @author J. Drill
 */
public class Menu_Company {
    
    public enum Menu {
        Company, AboutUs, WhyWorkSmart, Newsroom, PressReleases,
        InTheNews, Events, Leadership, Careers, ContactUs;
    }
    
    public iPage Load_Page(Menu selected){
        iPage rtnObj = null;
        
        if (Menu.Company == selected || Menu.AboutUs == selected) {
            rtnObj = new AboutUs();
        } else if (Menu.Careers == selected) {
            rtnObj = new Careers();
        } else if (Menu.WhyWorkSmart == selected) {
            rtnObj = new WhyWorkSmart();
        } else if (Menu.Newsroom == selected) {
            rtnObj = new Newsroom();
        } else if (Menu.PressReleases == selected) {
            rtnObj = new PressReleases();
        } else if (Menu.InTheNews == selected) {
            rtnObj = new InTheNews();
        } else if (Menu.Events == selected) {
            rtnObj = new Events();
        } else if (Menu.Leadership == selected) {
            rtnObj = new Leadership();
        } else if (Menu.Careers == selected) {
            rtnObj = new Careers();
        } else if (Menu.ContactUs == selected) {
            rtnObj = new ContactUs();
        }
        
        return rtnObj;
    }
}
