package co.com.choucair.certification.segundaPrueba.stepdefinitions;

import co.com.choucair.certification.segundaPrueba.model.AcademyChoucairData;
import co.com.choucair.certification.segundaPrueba.questions.Answer;
import co.com.choucair.certification.segundaPrueba.tasks.Login;
import co.com.choucair.certification.segundaPrueba.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

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
    public void heGoesToTheRegisterButtonAndStartTheProcess(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.onThePage(academyChoucairData.get(0).getStrFirstName(),
                academyChoucairData.get(0).getStrLastName(),
                academyChoucairData.get(0).getStrEmail(),
                academyChoucairData.get(0).getStrMonth(),
                academyChoucairData.get(0).getStrDay(),
                academyChoucairData.get(0).getStrYear(),
                academyChoucairData.get(0).getStrLanguage(),
                academyChoucairData.get(0).getStrCity(),
                academyChoucairData.get(0).getStrPostalCode(),
                academyChoucairData.get(0).getStrMobile(),
                academyChoucairData.get(0).getStrModel(),
                academyChoucairData.get(0).getStrOS(),
                academyChoucairData.get(0).getStrPassword()));
    }

    @Then("^he finishes the registration process$")
    public void heFinishesTheRegistrationProcess(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrButtonComplete())));
    }

}
