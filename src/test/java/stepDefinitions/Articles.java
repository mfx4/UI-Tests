package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.BasePage;
import pages.SearchPage;
import utilizer.Driver;
import utilizer.UIUtils;

import java.util.ArrayList;
import java.util.List;

public class Articles {

    @When("User searches option to find all articles related to {string}")
    public void user_searches_option_to_find_all_articles_related_to(String string) {
        BasePage basePage =new BasePage();
        basePage.searchIcon.click();
        UIUtils.waitFor(5);
        basePage.searchInputbox.sendKeys(string+ Keys.ENTER );
    }
    @Then("User gets  first heading and the last heading")
    public void user_gets_first_heading_and_the_last_heading() {
        SearchPage searchPage = new SearchPage();
        int totalNum = searchPage.searchResults.size();
        System.out.println("searchPage.searchResults.size() = " + totalNum);
        System.out.println("First heading: " + searchPage.searchResults.get(0).getText());
        System.out.println("First Page Last heading: " + searchPage.searchResults.get(totalNum-1).getText());

        Driver.get().findElement(By.xpath("(//div[@class='ssrcss-3vkeha-StyledButtonContent e1b2sq421'])[14]")).click();
        UIUtils.waitFor(2);
        System.out.println("Last Page Last heading: " + searchPage.searchResults.get(totalNum-1).getText());

    }
}
