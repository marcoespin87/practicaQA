package userinterfaces.saucedemo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;

public class ValidacionUI extends PageObject {

    //public static final Target CATEGORIAS = Target.the("categorías disponibles").locatedBy("//div[@class='list-group']/a[@class='list-group-item' and @id='itemc']");

    public static final Target BURGUER_BTN = Target.the("Boton del Menu de Hamburguesa").locatedBy("//button[@id='react-burger-menu-btn']").waitingForNoMoreThan(Duration.ofSeconds(10));
    public static final Target INVENTORY_CONTAINER = Target.the("Contenedor del Catálogo").locatedBy("//div[@id='inventory_container']//div[@class='inventory_container']").waitingForNoMoreThan(Duration.ofSeconds(10));
}