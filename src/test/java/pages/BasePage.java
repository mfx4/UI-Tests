package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilizer.Driver;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }

//    @FindBy(xpath = "//span[@class='ssrcss-1hhm2vt-SearchText eki2hvo2']")
    @FindBy(xpath = "//div[@role='search']")
    public WebElement searchIcon;

    @FindBy(id = "search-input")
    public WebElement searchInputbox;
}
