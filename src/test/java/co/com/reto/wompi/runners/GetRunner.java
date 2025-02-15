package co.com.reto.wompi.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/get.feature",
        glue = "co.com.reto.wompi.stepdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@Successful"
)
public class GetRunner {
}