package site.sections;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.IText;
import com.epam.jdi.uitests.core.interfaces.common.ITextArea;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import org.openqa.selenium.support.FindBy;
import site.entities.contactFormTestData.ContactFormData;

/**
 * Created by Александр on 10.03.2017.
 */
public class ContactForm extends Form<ContactFormData> {

    @FindBy(xpath = "//input[@name='your-name']")
    ITextField name;

    @FindBy(xpath = "//input[@name='your-email']")
    ITextField email;

	@FindBy(xpath = "//input[@name='your-phone']")
	ITextField phone;

    @FindBy(xpath = "//textarea[@name='textarea-841']")
    ITextArea message;

	@FindBy(xpath = "//input[@type='submit']")
	private IButton submit;

    @FindBy(xpath = "//div[@role='alert']")
    public IText capchaValidation;


}
