
package com.itcraft.JDIPresentation.uiTests;

import com.epam.jdi.uitests.web.selenium.driver.SeleniumDriverFactory;
import com.epam.jdi.uitests.web.selenium.driver.WebDriverUtils;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import site.ItechCraftSite;
import site.pages.ContactPage;

import static com.epam.jdi.uitests.core.settings.JDISettings.driverFactory;
import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
import static com.epam.jdi.uitests.web.selenium.driver.WebDriverUtils.killAllRunWebDrivers;
import static site.ItechCraftSite.contactPage;
import static site.ItechCraftSite.*;


/**
 * Created by Александр on 10.03.2017.
 */
public class TestsBase extends TestNGBase {

    ItechCraftSite site = new ItechCraftSite();

    @BeforeSuite(alwaysRun = true)
    public static void setUp() throws Exception {
        WebSite.init(ItechCraftSite.class);
        logger.info("Run Tests");
    }

    @AfterSuite(alwaysRun = true)
    public static void tearDown() {
        System.out.println("driver should be closed");
        contactPage.getDriver().quit();
        killAllRunWebDrivers();
    }


}
