package poc.stepdefinitios;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.saucedemo.*;
import tasks.web.NavigateTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static userinterfaces.saucedemo.LoginUI.*;

public class saucedemoStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el {actor} navega hacia sauce.com")
    public void accederADemoqa1(Actor actor) {
        actor.wasAbleTo(NavigateTo.demoQAPage());
    }

    @Cuando("acceder al sistema")
    public void accederAlSistema(){
        theActorInTheSpotlight().attemptsTo(
                AccederAlSistema.Logearse(),
                Click.on(BTN_CART)
        );
    }

    @Entonces("validar acceso")
    public void validarAcceso(){
        theActorInTheSpotlight().attemptsTo(
                ValidarUrl.VerificarUrl(),
                ValidarPagina.VerificarPagina(),
                ValidarTitulo.VerificarTitulo(),
                ValidarMenu.VerificarMenu()
        );
    }


}
