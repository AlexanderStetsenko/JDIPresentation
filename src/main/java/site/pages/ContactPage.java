package site.pages;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.IText;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.openqa.selenium.support.FindBy;
import site.sections.ContactForm;

/**
 * Created by Александр on 10.03.2017.
 */
public class ContactPage extends WebPage{

    @FindBy(xpath = ".//*[@id='wpcf7-f1216-o3']/form")
    public ContactForm contactForm;







}
