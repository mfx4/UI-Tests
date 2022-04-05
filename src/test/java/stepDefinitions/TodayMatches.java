package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Football;
import utilizer.ConfigurationReader;
import utilizer.Driver;
import utilizer.UIUtils;

import java.util.List;

public class TodayMatches {

    List<WebElement> allTeams;
    @When("User navigates to sport page")
    public void user_navigates_to_sport_page() {
        Driver.get().get(ConfigurationReader.get("WebURL"));

    }
    @Then("User gets all team names")
    public void user_gets_all_team_names() {
        Football football = new Football();
        allTeams = Driver.get().findElements(By.xpath("//span[@class='gs-u-display-none gs-u-display-block@m qa-full-team-name sp-c-fixture__team-name-trunc']"));
        List<String> allTeamsName = UIUtils.getElementsText(allTeams);
        System.out.println("allTeamsName = " + allTeamsName);
    }
    @Then("If there is no match User gets {string} message")
    public void if_there_is_no_match_user_gets_message(String message) {

        if (allTeams.size()==0){
            System.out.println(message);
        }else {
            System.out.println("Enjoy your watch!");
        }
    }
}
