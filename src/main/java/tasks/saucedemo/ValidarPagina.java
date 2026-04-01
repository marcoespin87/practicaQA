package tasks.saucedemo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

import static userinterfaces.saucedemo.LoginUI.*;
import static userinterfaces.saucedemo.ValidacionUI.INVENTORY_CONTAINER;

public class ValidarPagina implements Task {

    public static ValidarPagina VerificarPagina(){
        return Tasks.instrumented(ValidarPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T Actor){
        Actor.attemptsTo(
                Ensure.that(INVENTORY_CONTAINER).isDisplayed()
        );
    }
}
