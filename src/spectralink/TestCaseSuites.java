/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spectralink;

import spectralink.Framework.Pages.*;
import spectralink.Framework.Pages.Util.*;

/**
 *
 * @author J. Drill
 */
public class TestCaseSuites {
    
    public static void Full_Regression(){
        LandingPage lp = new LandingPage();
        lp.Landing_Page();
        
        //Company Menu
        Menu_Company mc = new Menu_Company();
        iPage page = mc.Load_Page(Menu_Company.Menu.AboutUs);
        page.GoTo();
        page.Validate_Page_Load();
        
        page = mc.Load_Page(Menu_Company.Menu.WhyWorkSmart);
        page.GoTo();
        page.Validate_Page_Load();
        
        page = mc.Load_Page(Menu_Company.Menu.Newsroom);
        page.GoTo();
        page.Validate_Page_Load();
        
        page = mc.Load_Page(Menu_Company.Menu.PressReleases);
        page.GoTo();
        page.Validate_Page_Load();
        
        page = mc.Load_Page(Menu_Company.Menu.InTheNews);
        page.GoTo();
        page.Validate_Page_Load();
        
        page = mc.Load_Page(Menu_Company.Menu.Events);
        page.GoTo();
        page.Validate_Page_Load();
        
        page = mc.Load_Page(Menu_Company.Menu.Leadership);
        page.GoTo();
        page.Validate_Page_Load();
        
        page = mc.Load_Page(Menu_Company.Menu.Careers);
        page.GoTo();
        page.Validate_Page_Load();
        
        page = mc.Load_Page(Menu_Company.Menu.ContactUs);
        page.GoTo();
        page.Validate_Page_Load();
        
        mc = null;
        
        //Products menu
        Menu_Products mp = new Menu_Products();
        page = mp.Load_Page(Menu_Products.MenuItems_Products.HistoryOfInnovation);
        page.GoTo();
        page.Validate_Page_Load();
        
        page = mp.Load_Page(Menu_Products.MenuItems_Products.MakingWorksmartPossible);
        page.GoTo();
        page.Validate_Page_Load();
        
        page = mp.Load_Page(Menu_Products.MenuItems_Products.S7000);
        page.GoTo();
        page.Validate_Page_Load();
        
        page = mp.Load_Page(Menu_Products.MenuItems_Products.S7000_Handsets);
        page.GoTo();
        page.Validate_Page_Load();
        
        page = mp.Load_Page(Menu_Products.MenuItems_Products.S7000_Infrastructure);
        page.GoTo();
        page.Validate_Page_Load();
        
        page = mp.Load_Page(Menu_Products.MenuItems_Products.S7000_Integration);
        page.GoTo();
        page.Validate_Page_Load();
        
        page = mp.Load_Page(Menu_Products.MenuItems_Products.S8000);
        page.GoTo();
        page.Validate_Page_Load();
        
        page = mp.Load_Page(Menu_Products.MenuItems_Products.S8000_Handsets);
        page.GoTo();
        page.Validate_Page_Load();
        
        page = mp.Load_Page(Menu_Products.MenuItems_Products.S8000_Infrastructure);
        page.GoTo();
        page.Validate_Page_Load();
        
        page = mp.Load_Page(Menu_Products.MenuItems_Products.S8000_Interoperability);
        page.GoTo();
        page.Validate_Page_Load();
        
        mp = null;
        
        //Service Menu
        Menu_Services services = new Menu_Services();
        page = services.Load_Page(Menu_Services.MenuItems_Services.WorkSmart);
        page.GoTo();
        page.Validate_Page_Load();
        
        page = services.Load_Page(Menu_Services.MenuItems_Services.Design);
        page.GoTo();
        page.Validate_Page_Load();
        
        page = services.Load_Page(Menu_Services.MenuItems_Services.Deploy);
        page.GoTo();
        page.Validate_Page_Load();
        
        page = services.Load_Page(Menu_Services.MenuItems_Services.Maintain);
        page.GoTo();
        page.Validate_Page_Load();
        
        services = null;
    }
}
