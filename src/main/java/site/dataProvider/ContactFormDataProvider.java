package site.dataProvider;

import org.testng.annotations.DataProvider;
import site.entities.ContactFormEntity;

/**
 * Created by Александр on 10.03.2017.
 */
public class ContactFormDataProvider {
    @DataProvider(name = "contactFormData")
    public static Object[][] attendees() {
        return new Object[][]{
                {new ContactFormEntity()}
        };
    }
}
