package com.itcraft.JDIPresentation.uiTests.navigationTest;

import com.itcraft.JDIPresentation.uiTests.TestsBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static site.ItechCraftSite.*;
import static site.enums.MenuEnum.*;

/**
 * Created by Александр on 13.03.2017.
 */
public class topMenuNavigation extends TestsBase{

    @BeforeMethod
    public static void before(Method method){
      homePage.isOpened();
    }

    @Test
    public void topMenunavigation() throws Exception {
        topMenu.select(CONTACT);
        contactPage.checkOpened();
        topMenu.select(COMPANY);
        topMenu.select(SERVICES);
        topMenu.select(SOLUTIONS);
        topMenu.select(CLIENTS);
        topMenu.select(BLOG);
        topMenu.hover(CONTACT);
    }


    //You can call item from any level of menu. Separate char is "|"
    @Test
    public void subMenuNavigation() throws Exception {
//        topMenuSubItems.hoverAndClick("SERVICES|Web");
//        topMenuSubItems.hoverAndClick("SERVICES|Mobile");
        topMenuSubItems.hoverAndClick("SOLUTIONS|For Startups");
        topMenuSubItems.hoverAndClick("SOLUTIONS");
        topMenuSubItems.hoverAndClick("CLIENTS");


    }
}
