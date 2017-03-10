package com.itcraft.JDIPresentation.contactTest;

import com.epam.jdi.uitests.web.selenium.driver.WebDriverUtils;
import com.itcraft.JDIPresentation.TestsBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import site.entities.ContactFormEntity;

import java.lang.reflect.Method;

import static site.ItechCraftSite.contactPage;

/**
 * Created by Александр on 10.03.2017.
 */
public class SendContactMessage extends TestsBase {

    @BeforeMethod
    public static void before(Method method){
        contactPage.isOpened();
    }

//    @AfterMethod
//    public static void after(Method method){
//        //contactPage.getDriver().quit();
//        WebDriverUtils.killAllRunWebDrivers();
//    }


    @Test(dataProvider = "contactFormData", dataProviderClass = ContactFormEntity.class)
    public void contactFormSending(ContactFormEntity contactFormEntity) throws Exception {
        contactPage.contactForm.submit(contactFormEntity);
    }
}
