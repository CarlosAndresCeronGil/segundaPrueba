package co.com.choucair.certification.segundaPrueba.tasks;

import co.com.choucair.certification.segundaPrueba.userinterface.UTestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestLoginPage.JOIN_BUTTON),
                Enter.theValue("Andres").into(UTestLoginPage.FIRST_NAME),
                Enter.theValue("Ceron").into(UTestLoginPage.LAST_NAME),
                Enter.theValue("andres3@hotmail.com").into(UTestLoginPage.EMAIL),
                SelectFromOptions.byVisibleText("January").from(UTestLoginPage.MONTH_BUTTON),
                SelectFromOptions.byVisibleText("6").from(UTestLoginPage.DAY_BUTTON),
                SelectFromOptions.byVisibleText("1998").from(UTestLoginPage.YEAR_BUTTON),
                Enter.theValue("Spanish").into(UTestLoginPage.LANGUAGUE).thenHit(Keys.ENTER),
                Click.on(UTestLoginPage.NEXT_LOCATION));
    }
}
