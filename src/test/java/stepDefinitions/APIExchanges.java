package stepDefinitions;

import com.google.gson.Gson;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilizer.ConfigurationReader;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class APIExchanges {


    Response response;
    JsonPath jp;

    @When("Tester sends request")
    public void tester_sends_request() {
        response = given().accept(ContentType.JSON)
                .when().get(ConfigurationReader.get("BaseURI"));
    }
    @Then("Tester gets response status code {int}")
    public void tester_gets_response_status_code(int statusCode) {
        Assert.assertEquals(statusCode,response.statusCode());
    }
    @Then("Tester gets count the total number of currencies")
    public void tester_gets_count_the_total_number_of_currencies() {
        jp = response.jsonPath();
        String result = jp.getString("result");
        System.out.println("result = " + result);

        Map<String,Object> allCurrencies = jp.getMap("conversion_rates");
        System.out.println("Count of Currencies = " + allCurrencies.size());
    }
    @Then("Currency {string} is shown within the response")
    public void currency_is_shown_within_the_response(String currency) {

        Assert.assertTrue(jp.getMap("conversion_rates").toString().contains(currency));
    }
}
