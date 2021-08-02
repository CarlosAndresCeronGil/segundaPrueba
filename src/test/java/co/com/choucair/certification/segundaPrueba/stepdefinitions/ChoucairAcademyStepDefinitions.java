package co.com.choucair.certification.segundaPrueba.stepdefinitions;

import co.com.choucair.certification.segundaPrueba.tasks.Login;
import co.com.choucair.certification.segundaPrueba.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Andres wants to register on the uTest page$")
    public void thanAndresWantsToRegisterOnTheUTestPage() {
        OnStage.theActorCalled("Andres").wasAbleTo(OpenUp.thePage());
    }

    @When("^he goes to the register button and start the process$")
    public void heGoesToTheRegisterButtonAndStartTheProcess() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.onThePage());
    }

    @Then("^he finishes the registration process$")
    public void heFinishesTheRegistrationProcess() {
    }

}
