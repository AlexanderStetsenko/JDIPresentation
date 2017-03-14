package site.customElements;

import com.epam.jdi.uitests.web.selenium.elements.common.Link;
import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Александр on 14.03.2017.
 */
public class SearchResults extends Section{

	@FindBy(css = "h3>a")
	public TextField title;

	@FindBy(css = "p")
	public Text text;

	@FindBy(css = "div>a.read-more")
    public Link readMoreLink;

}
