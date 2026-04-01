package tasks.saucedemo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

import static userinterfaces.saucedemo.LoginUI.*;

public class ValidarUrl implements Task {

    public static ValidarUrl VerificarUrl(){
        return Tasks.instrumented(ValidarUrl.class);
    }

    @Override
    public <T extends Actor> void performAs(T Actor){
        Actor.attemptsTo(
                Ensure.thatTheCurrentPage().currentUrl().isEqualTo("https://www.saucedemo.com/inventory.html")
        );
    }
}
