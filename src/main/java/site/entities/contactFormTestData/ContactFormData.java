package site.entities.contactFormTestData;

/**
 * Created by Александр on 13.03.2017.
 */
public abstract class ContactFormData {
    public String name;
    public String email;
    public String phone;
    public String message;


    public ContactFormData() {
    }

    public ContactFormData(String name, String email, String phone, String message) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.message = message;
    }
}
