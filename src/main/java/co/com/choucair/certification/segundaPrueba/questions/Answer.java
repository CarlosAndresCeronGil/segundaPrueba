package co.com.choucair.certification.segundaPrueba.questions;

import co.com.choucair.certification.segundaPrueba.userinterface.UTestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor){
        boolean result;
        String buttonComplete = Text.of(UTestLoginPage.COMPLETE_SETUP).viewedBy(actor).asString();
        if(question.equals(buttonComplete)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
