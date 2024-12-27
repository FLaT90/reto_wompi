package co.com.reto.wompi.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static co.com.reto.wompi.utils.Constants.RESPONSE_REQUEST;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

public class PostQuestion implements Question<Boolean> {

    private int statusOK;

    public PostQuestion(int statusOK) {
        this.statusOK = statusOK;
    }


    @Override
    @Subject("{0} valida el codigo de estado OK #statusDelete ")
    public Boolean answeredBy(Actor actor) {
        actor.should(seeThatResponse(RESPONSE_REQUEST,
                reponse -> reponse.statusCode(statusOK)
                        .body("type", equalTo("NEQUI"))
                        .body("phone_number", equalTo("3107654321"))
        )
    );
        return true;
    }

    public static PostQuestion registerSuccess(int statusOK) {
        return new PostQuestion(statusOK);
    }
}