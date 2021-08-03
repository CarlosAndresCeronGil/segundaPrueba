package co.com.choucair.certification.segundaPrueba.tasks;

import co.com.choucair.certification.segundaPrueba.userinterface.UTestLoginPage;
import cucumber.api.java.es.E;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Login implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;
    private String strLanguage;
    private String strCity;
    private String strPostalCode;
    private String strMobile;
    private String strModel;
    private String strOS;
    private String strPassword;
    private String strButtonComplete;

    public Login(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strLanguage, String strCity,String strPostalCode, String strMobile, String strModel, String strOS, String strPassword) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strLanguage = strLanguage;
        this.strCity = strCity;
        this.strPostalCode = strPostalCode;
        this.strMobile = strMobile;
        this.strModel = strModel;
        this.strOS = strOS;
        this.strPassword = strPassword;
    }

    public static Login onThePage(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strLanguage, String strCity, String strPostalCode, String strMobile, String strModel, String strOS, String strPassword) {
        return Tasks.instrumented(Login.class, strFirstName, strLastName, strEmail, strMonth, strDay, strYear, strLanguage, strCity, strPostalCode, strMobile, strModel, strOS, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestLoginPage.JOIN_BUTTON),
                Enter.theValue(strFirstName).into(UTestLoginPage.FIRST_NAME),
                Enter.theValue(strLastName).into(UTestLoginPage.LAST_NAME),
                Enter.theValue(strEmail).into(UTestLoginPage.EMAIL),
                SelectFromOptions.byVisibleText(strMonth).from(UTestLoginPage.MONTH_BUTTON),
                SelectFromOptions.byVisibleText(strDay).from(UTestLoginPage.DAY_BUTTON),
                SelectFromOptions.byVisibleText(strYear).from(UTestLoginPage.YEAR_BUTTON),
                Enter.theValue(strLanguage).into(UTestLoginPage.LANGUAGUE).thenHit(Keys.ENTER),
                Click.on(UTestLoginPage.NEXT_LOCATION),
                Enter.theValue(strCity).into(UTestLoginPage.CITY),
                Hit.the(Keys.DOWN).keyIn(UTestLoginPage.CITY),
                Hit.the(Keys.ENTER).keyIn(UTestLoginPage.CITY),
                Enter.theValue(strPostalCode).into(UTestLoginPage.POSTAL_CODE),
                Click.on(UTestLoginPage.NEXT_DEVICES),
                Click.on(UTestLoginPage.MOBILE_CLICK),
                Enter.theValue(strMobile).into(UTestLoginPage.MOBILE_WRITE).thenHit(Keys.ENTER),
                Click.on(UTestLoginPage.MODEL_CLICK),
                Enter.theValue(strModel).into(UTestLoginPage.MODEL_WRITE).thenHit(Keys.ENTER),
                Click.on(UTestLoginPage.OS_CLICK),
                Enter.theValue(strOS).into(UTestLoginPage.OS_WRITE).thenHit(Keys.ENTER),
                Click.on(UTestLoginPage.LAST_STEP),
                Enter.theValue(strPassword).into(UTestLoginPage.PASSWORD),
                Enter.theValue(strPassword).into(UTestLoginPage.CONFIRM_PASSWORD),
                Click.on(UTestLoginPage.CHECK_STAY_INFORM),
                Click.on(UTestLoginPage.CHECK_TERMS),
                Click.on(UTestLoginPage.CHECK_PRIVACY));
    }
}
