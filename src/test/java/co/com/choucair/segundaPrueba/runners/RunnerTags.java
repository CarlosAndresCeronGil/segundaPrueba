package co.com.choucair.segundaPrueba.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/resources/demo.feature",
        tags = "@scenario1",
        glue = "co.com.choucair.certification.segundaPrueba.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
