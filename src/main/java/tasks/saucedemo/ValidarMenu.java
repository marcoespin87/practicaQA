package tasks.saucedemo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

import static userinterfaces.saucedemo.LoginUI.*;
import static userinterfaces.saucedemo.ValidacionUI.BURGUER_BTN;

public class ValidarMenu implements Task {

    public static ValidarMenu VerificarMenu(){
        return Tasks.instrumented(ValidarMenu.class);
    }

    @Override
    public <T extends Actor> void performAs(T Actor){
        Actor.attemptsTo(
                Ensure.that(BURGUER_BTN).isDisplayed(),
                Ensure.that(BURGUER_BTN).isEnabled()
        );
    }
}
