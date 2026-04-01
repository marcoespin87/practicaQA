package tasks.saucedemo;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.web.CategoriasUI;
import userinterfaces.web.HeaderUI;
import userinterfaces.web.ProductosUI;
import utils.web.ControlAlarmas;
import utils.web.GeneradorAleatorio;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static userinterfaces.saucedemo.LoginUI.*;
import static userinterfaces.saucedemo.LoginUI.BTN_CART;

public class AccederAlSistema implements Task {

    public static AccederAlSistema Logearse(){
        return Tasks.instrumented(AccederAlSistema.class);
    }

    @Override
    public <T extends Actor> void performAs(T Actor){
        Actor.attemptsTo(
                Enter.theValue("standard_user").into(USER_INPUT),
                Enter.theValue("secret_sauce").into(PASS_INPUT),
                Click.on(BTN_LOGIN)
        );
    }
}
