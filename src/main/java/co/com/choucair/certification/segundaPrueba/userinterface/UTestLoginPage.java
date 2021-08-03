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
    public static final Target NEXT_LOCATION = Target.the("where we click to go to the next page in the form data")
            .located(By.xpath("//span[contains(text(), 'Next: Location')]"));
    public static final Target CITY = Target.the("where do we write our city")
            .located(By.id("city"));
    public static final Target POSTAL_CODE = Target.the("where do we write our postal code")
            .located(By.id("zip"));
    public static final Target NEXT_DEVICES = Target.the("where do we click to go to the next page in the form data")
            .located(By.xpath("//span[contains(text(), 'Next: Devices')]"));
    public static final Target MOBILE_CLICK = Target.the("where do we click to pick the brand of our mobile device")
            .located(By.xpath("//span[contains(text(), 'Select Brand')]"));
    public static final Target MOBILE_WRITE = Target.the("where do we write the brand of our mobile device")
            .located(By.xpath("//input[@placeholder='Select Brand']"));
    public static final Target MODEL_CLICK = Target.the("where do we click to pick the model of our mobile device")
            .located(By.xpath("//span[contains(text(), 'Select a Model')]"));
    public static final Target MODEL_WRITE = Target.the("where do we write the model of our mobile device")
            .located(By.xpath("//input[@placeholder='Select a Model']"));
    public static final Target OS_CLICK = Target.the("where do we click to pick the operating system of our mobile device")
            .located(By.xpath("//div[@name='handsetOSId']"));
    public static final Target OS_WRITE = Target.the("where do we write the operating system of our mobile device")
            .located(By.xpath("//div[@name='handsetOSId']//input[@type='search' and @placeholder='Select OS']"));
    public static final Target LAST_STEP = Target.the("where do we click to go for the last step in the form data")
            .located(By.xpath("//span[contains(text(), 'Next: Last Step')]"));
    public static final Target PASSWORD = Target.the("where do we write our password")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("where we confirm our password")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_STAY_INFORM = Target.the("where we check the box to stay inform")
            .located(By.xpath("//input[@name='newsletterOptIn']"));
    public static final Target CHECK_TERMS = Target.the("where we check the box to accept the terms of use")
            .located(By.xpath("//input[@name='termOfUse']"));
    public static final Target CHECK_PRIVACY = Target.the("where we chex the box to accept the privacy policy")
            .located(By.id("privacySetting"));
    public static final Target COMPLETE_SETUP = Target.the("where we click to complete the form data")
            .located(By.xpath("//span[contains(text(), 'Complete Setup')]"));
}
