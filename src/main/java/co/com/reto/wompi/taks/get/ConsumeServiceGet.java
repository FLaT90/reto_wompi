package co.com.reto.wompi.taks.get;

import co.com.reto.wompi.interactions.GetRequest;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class ConsumeServiceGet {

    public Performable apiget(String baseUrl, String request, String typeContent) {
        return Task.where("{0} call the service at execute GET",
                GetRequest.params(baseUrl, request, typeContent)
        );
    }
}
