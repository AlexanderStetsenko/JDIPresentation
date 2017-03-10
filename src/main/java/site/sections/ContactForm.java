package site.sections;

import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import org.openqa.selenium.support.FindBy;
import site.entities.ContactFormEntity;

/**
 * Created by Александр on 10.03.2017.
 */
public class ContactForm extends Form<ContactFormEntity> {

    @FindBy(xpath = "//input[@name='your-name']")
    ITextField name;

    @FindBy(xpath = ".//*[@id='wpcf7-f1216-o3']/form/div[3]/div[1]/span/input")
    ITextField email;

	@FindBy(xpath = ".//*[@id='wpcf7-f1216-o3']/form/div[3]/div[2]/span/input")
	ITextField phone;



}
