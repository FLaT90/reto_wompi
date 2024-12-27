package co.com.reto.wompi.stepdefinition;

import co.com.reto.wompi.questions.PostQuestion;
import co.com.reto.wompi.taks.post.Call;
import co.com.reto.wompi.utils.Uri;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.reto.wompi.utils.Constants.*;
import static io.restassured.http.ContentType.JSON;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.apache.http.HttpStatus.SC_CREATED;

public class PostStepdefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("configura la solicitud a consumir")
    public void configureRequestToConsume() {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                Call.service().
                        apiPost(
                                BASE_URL.replace(TYPE_ENVIRONMENT, ENV_QA),
                                "{\n" +
                                        "  \"payment_method\": {\n" +
                                        "    \"type\": \"NEQUI\"\n" +
                                        "    \"phone_number\": \"3107654321\" \n" +
                                        "  }\n" +
                                        "}",
                                Uri.CREATE_TRANSACTION.getUri(),
                                String.valueOf(JSON))
        );
    }
    @Then("valida los datos consultados")
    public void validateStatusOfTheRequest() {
        theActorInTheSpotlight().should(seeThat(PostQuestion.registerSuccess(SC_CREATED)));
    }
}