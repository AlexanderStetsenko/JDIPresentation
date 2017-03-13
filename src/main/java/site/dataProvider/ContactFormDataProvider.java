package site.dataProvider;

import org.testng.annotations.DataProvider;
import site.entities.contactFormTestData.ContactFormValid;
import site.entities.contactFormTestData.ContactFormWithoutEmail;

/**
 * Created by Александр on 10.03.2017.
 */
public class ContactFormDataProvider {
    @DataProvider(name = "contactFormData")
    public static Object[][] attendees() {
        return new Object[][]{
                {new ContactFormValid()}
        };
    }

    @DataProvider(name = "contactFormDataWithoutEmail")
    public static Object[][] contactFormDataWithoutEmail()
    {
        return new Object[][]
                {
                        {new ContactFormWithoutEmail()}
        };
    }
}
