package co.com.reto.wompi.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static co.com.reto.wompi.utils.Constants.STATUS;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class GetQuestion implements Question<Boolean> {

    private int statusOK;

    public GetQuestion(int statusOK) {
        this.statusOK = statusOK;
    }

    @Override
    @Subject("{0} valida el codigo de estado exitoso #statusOK ")
    public Boolean answeredBy(Actor actor) {
        actor.should(seeThatResponse(STATUS, response -> response.statusCode(statusOK)));
        return true;
    }

    public static GetQuestion successful(int statusOK) {
        return new GetQuestion(statusOK);
    }
}