package co.com.reto.wompi.stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import sun.security.ssl.SSLLogger;

import static co.com.reto.wompi.utils.Constants.*;

@Slf4j
public class BaseUrlStepdenifition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} obtiene la baseurl de la api")
    public void getTheBaseurlFromTheApi(String actor) {
        SSLLogger.info(String.format(
                FORMAT_THREE,
                actor,
                CALL_SERVICE,
                BASE_URL.replace(TYPE_ENVIRONMENT, ENV_QA))
        );
    }
}
