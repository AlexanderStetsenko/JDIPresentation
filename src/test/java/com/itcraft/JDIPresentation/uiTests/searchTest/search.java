package com.itcraft.JDIPresentation.uiTests.searchTest;

import com.itcraft.JDIPresentation.uiTests.TestsBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import site.ItechCraftSite;

import static site.ItechCraftSite.*;

/**
 * Created by Александр on 14.03.2017.
 */
public class search extends TestsBase{

    @BeforeMethod
    public static void before() throws Exception {
        servicesPage.isOpened();
    }

    @Test
    public void search() throws Exception {
        searchSection.searchField.find("c#");
    }
}
