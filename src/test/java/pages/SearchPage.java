package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class SearchPage extends BasePage{

    @FindBy(xpath = "(//ul[@role='list'])[4]//a/span")
    public List<WebElement> searchResults;

}
