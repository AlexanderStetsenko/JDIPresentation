package com.itcraft.JDIPresentation.uiTests.contactTest;

import com.itcraft.JDIPresentation.uiTests.TestsBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import site.dataProvider.ContactFormDataProvider;
import site.entities.contactFormTestData.ContactFormValid;
import com.epam.web.matcher.testng.Assert;
import site.entities.contactFormTestData.ContactFormWithoutEmail;

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

    @AfterMethod
    public static void after(Method method){
        contactPage.refresh();
    }

    @Test(dataProvider = "contactFormData", dataProviderClass = ContactFormDataProvider.class)
    public void contactFormSending(ContactFormValid contactFormValid) throws Exception {
        contactPage.contactForm.submit(contactFormValid);
        Assert.assertEquals(contactPage.contactForm.capchaValidation.getText(), "Failed to send your message. Please try later or contact the administrator by another method.");
    }

    @Test(dataProvider = "contactFormDataWithoutEmail", dataProviderClass = ContactFormDataProvider.class)
    public void contactFormSendingWithEmptyEmailField(ContactFormWithoutEmail contactFormWithoutEmail) throws Exception {
        contactPage.contactForm.submit(contactFormWithoutEmail);
        System.out.println(contactPage.contactForm.capchaValidation.getText());
        Assert.assertEquals(contactPage.contactForm.capchaValidation.getText(), "Validation errors occurred. Please confirm the fields and submit it again.");
    }
}
