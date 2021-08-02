package co.com.choucair.certification.segundaPrueba.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestLoginPage {
    public static final Target JOIN_BUTTON = Target.the("The button to star de registration")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target FIRST_NAME = Target.the("where do we write our name")
            .located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("where do we write our last name")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("where do we write our email address")
            .located(By.id("email"));
    public static final Target MONTH_BUTTON = Target.the("where we see all the months")
            .located(By.id("birthMonth"));
    public static final Target DAY_BUTTON = Target.the("where we see all the days")
            .located(By.id("birthDay"));
    public static final Target YEAR_BUTTON = Target.the("where we see all the years")
            .located(By.id("birthYear"));
    public static final Target LANGUAGUE = Target.the("where do we write what language we know")
            .located(By.xpath("//input[@type='search']"));
    public static final Target NEXT_LOCATION = Target.the("where we click to go to the next location in the form")
            .located(By.xpath("//span[contains(text(), 'Next: Location')]"));
    public static final Target CITY = Target.the("where do we write our city")
            .located(By.id("city"));
    public static final Target POSTAL_CODE = Target.the("where do we write our postal code")
            .located(By.id("zip"));
}
