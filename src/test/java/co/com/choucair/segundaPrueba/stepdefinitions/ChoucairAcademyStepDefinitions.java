package co.com.choucair.segundaPrueba.stepdefinitions;

import co.com.choucair.segundaPrueba.tasks.OpenUp;
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


    @When("^he goes to the main menu of the page$")
    public void heGoesToTheMainMenuOfThePage() {
    }

    @Then("^he finishes the registration process$")
    public void heFinishesTheRegistrationProcess() {
    }

}
