package site.sections;

import com.epam.jdi.uitests.web.selenium.elements.complex.Elements;
import com.epam.jdi.uitests.web.selenium.elements.composite.Search;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JSearch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import site.customElements.SearchResults;

/**
 * Created by Александр on 14.03.2017.
 */
public class SearchSection extends Section{

    @JSearch(

            input = @FindBy(xpath = ".//*[@id='appendedPrependedInput']"),
            searchButton = @FindBy(xpath = ".//*[@id='searchsubmit']"),
            suggestions = @FindBy(css = ""),
            jInput = @JFindBy(xpath = ".//*[@id='appendedPrependedInput']"),
            jSearchButton = @JFindBy(xpath = ".//*[@id='searchsubmit']") ,
            jSuggestions = @JFindBy(css = ""))
    public Search searchField;

    @FindBy(xpath = ".//*[@id='getUsers-content']/div/div[@class='found-post']")
    public Elements<SearchResults> searchResultss;

}
