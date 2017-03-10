package site.entities;

import org.testng.annotations.DataProvider;

/**
 * Created by Александр on 10.03.2017.
 */
public class ContactFormEntity {
    public String name = "Alex";
    public String email = "alex.stetcenko@gmail.com";
    public String phone = "3234234";
    public String message = "I love ITCraft";

    @DataProvider(name = "contactFormData")
    public static Object[][] contactFormData() {
        return new Object[][]{
                {new ContactFormEntity()}
        };
    }
}
