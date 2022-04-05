package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilizer.Driver;

import java.util.List;

public class Football extends BasePage{
    public Football(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//div[@class='qa-match-block']")
    public List<WebElement> matches;

    @FindBy(xpath = "//span[@class='gs-u-display-none gs-u-display-block@m qa-full-team-name sp-c-fixture__team-name-trunc']")
    public List<WebElement> allTeams;



}
