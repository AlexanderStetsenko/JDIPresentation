package site;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import site.pages.ContactPage;
import site.pages.HomePage;

/**
 * Created by Александр on 10.03.2017.
 */
public class ItechCraftSite extends WebSite {

    @JPage(url = "", title = "Software and Web development Company in USA, Germany, Canada | Mobile App Development Services | Software Programming Services")
    public static HomePage homePage;

    @JPage(url = "/contact/")
    public static ContactPage contactPage;
}
